// See LICENSE for license details.

package java.io

import java.nio.channels.FileChannel

class FilterReader(reader: Reader) extends Reader {

  def close(): Unit = ???
  def read(cbuf: Array[Char], off: Int, len: Int): Int = ???
}
