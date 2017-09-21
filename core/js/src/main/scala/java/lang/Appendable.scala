package java.lang

trait Appendable {
  def append(c: Char): Appendable
  def append(csq: CharSequence): Appendable = append(csq, 0, csq.length)
  def append(csq: CharSequence, start: Int, end: Int): Appendable
}
