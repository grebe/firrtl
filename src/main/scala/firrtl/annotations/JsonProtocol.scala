
package firrtl
package annotations

import scala.util.{Try, Failure}

object JsonProtocol {
  /** Serialize annotations to a String for emission */
  def serialize(annos: Seq[Annotation]): String = serializeTry(annos).get

  def serializeTry(annos: Seq[Annotation]): Try[String] = {
    Try(annos.map(_.toString).mkString("\n"))
  }

  def deserialize(in: java.io.InputStream): Seq[Annotation] = deserializeTry(in).get

  def deserializeTry(in: java.io.InputStream): Try[Seq[Annotation]] = Try({
    Seq[Annotation]()
})
}
