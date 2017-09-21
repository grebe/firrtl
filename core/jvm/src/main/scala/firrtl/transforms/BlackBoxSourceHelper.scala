package firrtl.transforms

import java.io._

object PlatformBlackBoxSourceHelper {
  val FileListName = "black_box_verilog_files.f"
  /**
    * finds the named resource and writes into the directory
    * @param name the name of the resource
    * @param file the file to write it into
    */
  def copyResourceToFile(name: String, file: File) {
    val in = getClass.getResourceAsStream(name)
    if (in == null) {
      throw new FileNotFoundException(s"Resource '$name'")
    }
    val out = new FileOutputStream(file)
    Iterator.continually(in.read).takeWhile(-1 != _).foreach(out.write)
    out.close()
  }

}
