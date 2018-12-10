// See LICENSE for license details.

package firrtl
package proto

import java.io.OutputStream

object PlatformToProto {
  /** Serialized a deconstructed Circuit with lazy Modules
    *
    * This serializer allows intermediate objects to be garbage collected during serialization
    * to save time and memory
    *
    * @param ostream Output stream that will be written
    * @param info Info of Circuit
    * @param modules Functions to generate Modules lazily
    * @param main Top-level module of the Circuit
    */
  // Note this function is sensitive to changes to the Firrtl and Circuit protobuf message definitions
  def writeToStreamFast(
    ostream: OutputStream,
    info: ir.Info,
    modules: Seq[() => ir.DefModule],
    main: String
  ): Unit = {
  }
}
