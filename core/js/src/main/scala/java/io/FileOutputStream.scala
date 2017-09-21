package java.io

import java.lang.AutoCloseable

class FileOutputStream(val file: File) extends OutputStream with Closeable with Flushable with AutoCloseable {
  def write(b: Int): Unit = {}
  
}
