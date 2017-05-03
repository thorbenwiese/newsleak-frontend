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

package models

import play.api.libs.json.Json
import scalikejdbc.WrappedResultSet

/**
 * Representation for a document tag.
 *
 * @param id the unique tag id.
 * @param documentId the unique document id.
 * @param label the corresponding tag label.
 */
case class Tag(id: Long, documentId: Long, label: String)

/** Companion object for [[models.Tag]] instances. */
object Tag {

  /** Automatic mapping for [[models.Tag]] to read and write from and to json. */
  implicit val tagFormat = Json.format[Tag]

  /** Factory method to create tags from database result sets. */
  def apply(rs: WrappedResultSet): Tag = Tag(
    rs.long("id"),
    rs.long("documentid"),
    rs.string("label")
  )
}
