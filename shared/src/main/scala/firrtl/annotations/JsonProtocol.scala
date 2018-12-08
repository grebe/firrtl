
package firrtl
package annotations

import scala.util.{Try, Failure}

import firrtl.ir._
import firrtl.Utils.error

object JsonProtocol {
  /** Serialize annotations to a String for emission */
  def serialize(annos: Seq[Annotation]): String = PlatformJsonProtocol.serializeTry(annos).get


  def deserialize(in: PlatformJsonProtocol.JsonInput): Seq[Annotation] = PlatformJsonProtocol.deserializeTry(in).get

}
