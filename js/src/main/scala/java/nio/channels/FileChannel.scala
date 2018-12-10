// See LICENSE for license details.

package java.nio.channels

import java.nio.channels.spi.AbstractInterruptibleChannel

class FileChannel extends AbstractInterruptibleChannel with SeekableByteChannel
with GatheringByteChannel with ScatteringByteChannel {
  // Members declared in java.nio.channels.spi.AbstractInterruptibleChannel
  protected def implCloseChannel(): Unit = ???
  
  // Members declared in java.nio.channels.GatheringByteChannel
  def write(x$1: Array[java.nio.ByteBuffer]): Long = ???
  def write(x$1: Array[java.nio.ByteBuffer],x$2: Int,x$3: Int): Long = ???
  
  // Members declared in java.nio.channels.ScatteringByteChannel
  def read(x$1: Array[java.nio.ByteBuffer]): Long = ???
  def read(x$1: Array[java.nio.ByteBuffer],x$2: Int,x$3: Int): Long = ???
  
  // Members declared in java.nio.channels.SeekableByteChannel
  def position(x$1: Long): java.nio.channels.SeekableByteChannel = ???
  def position(): Long = ???
  def read(x$1: java.nio.ByteBuffer): Int = ???
  def size(): Long = ???
  def transferFrom(src: ReadableByteChannel, position: Long, count: Long): Long = ???
  def truncate(x$1: Long): java.nio.channels.SeekableByteChannel = ???
  def write(x$1: java.nio.ByteBuffer): Int = ???
}
