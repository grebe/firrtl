// See LICENSE for license details.

package firrtl
package proto

import java.io.{File, FileInputStream}

object FromProto {

  /** Deserialize ProtoBuf representation of [[ir.Circuit]]
    *
    * @param filename Name of file containing ProtoBuf representation
    * @return Deserialized FIRRTL Circuit
    */
  def fromFile(filename: String): ir.Circuit = {
    PlatformFromProto.fromInputStream(new FileInputStream(new File(filename)))
  }
}
