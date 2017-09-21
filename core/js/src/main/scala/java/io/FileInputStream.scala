package java.io

class FileInputStream(val string: Option[String] = None, val file: Option[File] = None) extends InputStream {
  protected def this(name: String) = this(string = Some(name))
  protected def this(file: File)   = this(file   = Some(file))

  def read(): Int = 0
}
