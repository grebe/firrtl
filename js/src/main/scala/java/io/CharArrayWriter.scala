// See LICENSE for license details.

package java.io

class CharArrayWriter(initialSize: Int) extends Writer {
  def this() = this(1024)

  override def append(csq: CharSequence): CharArrayWriter = ???
  def close(): Unit = ???
  def flush(): Unit = ???
  def write(csq: Array[Char], start: Int, len: Int): Unit = ???
}

