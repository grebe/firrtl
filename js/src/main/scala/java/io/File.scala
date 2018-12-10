// See LICENSE for license details.

package java.io

import java.nio.file.Path

class File(pathname: String) extends Serializable with Comparable[File] {
  def this(parent: String, child: String) = this(parent + "/" + child)
  def this(parent: File, child: String) = this(parent.getCanonicalPath() + "/" + child)

  def compareTo(o: File): Int = ???

  def exists(): Boolean = ???
  def canExecute(): Boolean = ???
  def canRead(): Boolean = ???
  def canWrite(): Boolean = ???
  def delete(): Boolean = ???
  def getAbsoluteFile(): File = ???
  def getAbsolutePath(): String = ???
  def getCanonicalFile(): File = ???
  def getCanonicalPath(): String = ???
  def getName(): String = ???
  def getParent(): String = ???
  def getParentFile(): File = ???
  def getPath(): String = ???
  def isAbsolute(): Boolean = ???
  def isDirectory(): Boolean = ???
  def listFiles(): Array[File] = ???
  def mkdir(): Boolean = ???
  def mkdirs(): Boolean = ???
  def toPath(): Path = ???

}
