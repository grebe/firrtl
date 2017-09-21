package java.io

import java.lang.AutoCloseable

class BufferedOutputStream(val file: Option[File] = None, val stream: Option[OutputStream] = None) extends Closeable with Flushable with AutoCloseable {
  protected def this() = this(None, None)
  protected def this(file: File) = this(file = Some(file))
  protected def this(os: OutputStream) = this(stream = Some(os))

  def close(): Unit = {}
  def flush(): Unit = {}
}
