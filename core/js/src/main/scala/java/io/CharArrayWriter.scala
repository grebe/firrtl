package java.io

import java.lang.AutoCloseable

object CharArrayWriter {
  val defaultInitialSize: Int = 1024
}

class CharArrayWriter(initialSize: Int = CharArrayWriter.defaultInitialSize) extends Closeable with Flushable with AutoCloseable {
  protected def this() = this(CharArrayWriter.defaultInitialSize)

  def append(c: Char): CharArrayWriter = this
  def append(csq: CharSequence): CharArrayWriter = this
  def append(csq: CharSequence, start: Int, end: Int) = this

  protected def close(): Unit = {}
  protected def flush(): Unit = {}

}
