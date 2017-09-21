package java.io

object PushbackReader {
  val defaultSize = 1024
}

class PushbackReader(reader: Reader, size: Int) extends Closeable with Readable with AutoCloseable {
  protected def this(reader: Reader) = this(reader, PushbackReader.defaultSize)

  def close(): Unit = {}
  def flush(): Unit = {}

  def read(buf: java.nio.CharBuffer): Int = 0
  def unread(n: Int) = {}
}
