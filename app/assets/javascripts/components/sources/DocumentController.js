/*
 * Copyright (C) 2016 Language Technology Group and Interactive Graphics Systems Group, Technische Universität Darmstadt, Germany
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

define([
    'angular',
    'ngSanitize',
    '../../factory/util',
    'ngMaterial'
], function (angular) {
    'use strict';

    angular.module('myApp.document', ['play.routing', 'ngSanitize', 'ngMaterial'])
        .controller('DocumentController',
            [
                '$scope',
                '$http',
                '$compile',
                '$templateRequest',
                '$sce',
                '$timeout',
                'playRoutes',
                'util',
                '_',
                'sourceShareService',
                'highlightShareService',
                'graphPropertiesShareService',
                'uiShareService',
                'ObserverService',
                function ($scope,
                          $http,
                          $compile,
                          $templateRequest,
                          $sce,
                          $timeout,
                          playRoutes,
                          util,
                          _,
                          sourceShareService,
                          highlightShareService,
                          graphPropertiesShareService,
                          uiShareService,
                          ObserverService) {

                    var self = this;

                    $scope.sourceShared = sourceShareService;
                    $scope.highlightShared = highlightShareService;
                    $scope.uiShareService = uiShareService;
                    $scope.graphPropertiesShared = graphPropertiesShareService;

                    $scope.tabs = $scope.sourceShared.tabs;

                    // Maps from doc id to list of tags
                    $scope.tags = {};
                    $scope.labels = $scope.sourceShared.labels;


                    self.numKeywords = 15;

                    $scope.removeTab = function (tab) {
                        var index = $scope.tabs.indexOf(tab);
                        $scope.tabs.splice(index, 1);
                    };

                    $scope.observer = ObserverService;

                    // Remove all open documents when reset is issued, but keep
                    // old bindings to the array.
                    $scope.observer.subscribeReset(function() { $scope.tabs.length = 0; });


                    init();

                    function init() {
                        updateTagLabels();
                    }


                    /**
                     * Applies the highlighting and underlining to the given text.
                     *
                     * @param toFormat - The string to apply the highlighting and underlining to.
                     * @return string - Returns the highlighted and underlined text.
                     */
                    var getHighlightedText = function (toFormat, wordsToUnderline) {
                        toFormat = toFormat.replace(/\n/g, "<br>");
                        var highlightedText = toFormat;
                        for (var i = 0; i < graphPropertiesShareService.categoryColors.length; i++) {
                            highlightedText = util.highlight(
                                highlightedText,
                                [],
                                wordsToUnderline[i],
                                graphPropertiesShareService.categoryColors[i]
                            );
                        }
                        return highlightedText;
                    };

                    $scope.renderDoc = function(doc) {
                        var marker = [[], [], [], []];
                        doc.entities.forEach(function(e) {
                            var index = graphPropertiesShareService.getIndexOfCategory(e.type);
                            marker[index].push(e.name);
                        });
                        return $sce.trustAsHtml(getHighlightedText(doc.content, marker));
                    };

                    $scope.retrieveKeywords = function(doc) {
                        var terms =  [];
                        playRoutes.controllers.DocumentController.getKeywordsById(doc.id, self.numKeywords).get().then(function(response) {
                            response.data.forEach(function(t) { return terms.push(t.term); });
                        });
                        return terms;
                    };

                    $scope.transformTag = function(tag, doc) {
                        // If it is an object, it's already a known tag
                        if (angular.isObject(tag)) {
                            return tag;
                        }
                        // Otherwise try to create new tag
                        $scope.addTag({ label: tag }, doc);
                        // Prevent the chip from being added. We add it with an id in
                        // the addTag method above.
                        return null;
                    };

                    function updateTagLabels() {
                        $scope.labels.length = 0;
                        // Fetch all available document labels for auto-complete
                        playRoutes.controllers.DocumentController.getTagLabels().get().then(function(response) {
                            response.data.labels.forEach(function(l) { $scope.labels.push(l); });
                        });
                    }

                    $scope.initTags = function(doc) {
                        $scope.tags[doc.id] = [];
                        playRoutes.controllers.DocumentController.getTagsByDocId(doc.id).get().then(function(response) {
                            response.data.forEach(function(tag) {
                                $scope.tags[doc.id].push({ label: tag.label, id: tag.id });
                            });
                        });
                    };

                    $scope.addTag = function(tag, doc) {
                        // Do not add tag if already present
                        var match = _.findWhere($scope.tags[doc.id], { label: tag.label });
                        if(match) {
                            return;
                        }

                        playRoutes.controllers.DocumentController.addTag(doc.id, tag.label).get().then(function(response) {
                            $scope.tags[doc.id].push({ id: response.data.id , label: tag.label });
                            // Update labels
                            updateTagLabels();
                        });
                    };

                    $scope.removeTag = function(tag) {
                        playRoutes.controllers.DocumentController.removeTagById(tag.id).get().then(function(response) {
                            // Update labels
                            updateTagLabels();
                        });
                    };

                    $scope.querySearch = function(doc, query) {
                        var results = query ? $scope.labels.filter(createFilterFor(query)) : [];
                        return results;
                    };

                    function createFilterFor(query) {
                        var lowercaseQuery = angular.lowercase(query);
                        return function filterFn(label) {
                            return (label.toLowerCase().indexOf(lowercaseQuery) === 0);
                        };
                    }
                }
            ]);
});