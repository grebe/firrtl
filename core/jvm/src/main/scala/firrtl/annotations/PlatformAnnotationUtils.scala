// See LICENSE for license details.

package firrtl
package annotations

import net.jcazevedo.moultingyaml._
import firrtl.annotations.AnnotationYamlProtocol._

import firrtl.ir._
import firrtl.Utils.error


// object in shared/ extends this
trait PlatformAnnotationUtils {
  def toYaml(a: Annotation): String = a.toYaml.prettyPrint
  def fromYaml(s: String): Annotation = s.parseYaml.convertTo[Annotation]
}
