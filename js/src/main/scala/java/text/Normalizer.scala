// See LICENSE for license details.

package java.text

final class Normalizer {
}

object Normalizer {
  // class Form extends Enum[Form] {}
  case class Form(value: Int)
  object Form {
    val NFD = Form(0)
  }
  def normalize(src: CharSequence, form: Normalizer.Form): String = ???
}
