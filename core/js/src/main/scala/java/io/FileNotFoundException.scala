package java.io

class FileNotFoundException(val msg: String) extends RuntimeException {
  def this() = this("")
}
