// See LICENSE for license details.

package java.io

import java.nio.channels.FileChannel

class FileOutputStream(file: File) extends OutputStream {
  def this(name: String) = this(new File(name))

  def write(b: Int) = {
    ???
  }

  def getChannel(): FileChannel = ???
}
