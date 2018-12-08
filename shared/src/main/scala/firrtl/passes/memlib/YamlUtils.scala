// See LICENSE for license details.

package firrtl.passes
package memlib
import java.io.{CharArrayWriter, File, PrintWriter}

import firrtl.Utils.error

case class Pin(name: String)
case class Source(name: String, module: String)
case class Top(name: String)
case class Config(pin: Pin, source: Source, top: Top)

