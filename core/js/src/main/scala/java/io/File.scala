package java.io

class File(val pathname: String, val parent: Option[File] = None, val child: Option[String] = None)  {
  // protected def this()  = this()
  def this(pathname: String) = this(parent = None, child = None, pathname = pathname)
  def this(parent: String, child: String) = this(parent = Some(new File(parent)), child = Some(child), pathname = null)
  def this(parent: File, child: String) = this(parent = Some(parent), child = Some(child), pathname = null)

  def delete(): Boolean = false

  def exists(): Boolean = false
  def getPath(): String = "yeah"
  def getAbsolutePath(): String = "/oh/yeah/"
  def listFiles(): Seq[File] = Seq(this)
  def isDirectory(): Boolean = false
  def mkdirs(): Unit = {}
  def toPath(): java.nio.file.Path = ???
}

