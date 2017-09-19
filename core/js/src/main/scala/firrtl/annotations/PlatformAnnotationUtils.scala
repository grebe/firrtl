// See LICENSE for license details.

package firrtl
package annotations

import firrtl.annotations.AnnotationYamlProtocol._

import firrtl.ir._
import firrtl.Utils.error


// object in shared/ extends this
trait PlatformAnnotationUtils {
  def toYaml(a: Annotation): String = AnnotationYamlFormat.write(a)
  def fromYaml(s: String): Annotation = AnnotationYamlFormat.read(s) // s.parseYaml.convertTo[Annotation]
}
