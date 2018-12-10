// See LICENSE for license details.

package firrtl
package proto

import java.io.{BufferedOutputStream, OutputStream}

object ToProto {


  /** Serialize a FIRRTL Circuit to an Output Stream as a ProtoBuf message
    *
    * @param ostream Output stream that will be written
    * @param circuit The Circuit to serialize
    */
  def writeToStream(ostream: OutputStream, circuit: ir.Circuit): Unit = {
    PlatformToProto.writeToStreamFast(ostream, circuit.info, circuit.modules.map(() => _), circuit.main)
  }

}
