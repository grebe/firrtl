// See LICENSE for license details.

package java.io

import java.nio.channels.FileChannel

class BufferedOutputStream(out: OutputStream, size: Int) extends FilterOutputStream(out) {
  def this(out: OutputStream) = this(out, -1)
}
