// See LICENSE for license details.

package java.io

import java.nio.channels.FileChannel

class PushbackReader(in: Reader, size: Int) extends FilterReader(in) {
  def this(in: Reader) = this(in, -1)

  def unread(c: Int): Unit = ???
}
