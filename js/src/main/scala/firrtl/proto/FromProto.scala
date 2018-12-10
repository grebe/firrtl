// See LICENSE for license details.

package firrtl
package proto

import java.io.InputStream

object PlatformFromProto {
  /** Deserialize ProtoBuf representation of [[ir.Circuit]]
    *
    * @param is InputStream containing ProtoBuf representation
    * @return Deserialized FIRRTL Circuit
    */
  def fromInputStream(is: InputStream): ir.Circuit = {
    ???
  }
}
