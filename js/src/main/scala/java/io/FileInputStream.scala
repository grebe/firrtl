// See LICENSE for license details.

package java.io

import java.nio.channels.FileChannel

class FileInputStream(file: File) extends InputStream {
  def this(name: String) = this(new File(name))

  def getChannel(): FileChannel = ???
  def read(): Int = ???
}
