// See LICENSE for license details.

package firrtl
package annotations

import scala.util.{Try, Failure}

object PlatformAnnotationUtils {
  def toYaml(a: LegacyAnnotation): String = ""
  def fromYaml(s: String): LegacyAnnotation = null.asInstanceOf[LegacyAnnotation]
}

object PlatformJsonProtocol {
  type JsonInput = java.io.File

  def serializeTry(annos: Seq[Annotation]): Try[String] = {
    Try("")
  }
  def deserializeTry(in: JsonInput): Try[Seq[Annotation]] = Try({
    Seq(null.asInstanceOf[Annotation])
  })
}
