package firrtl

object FIRRTLJS extends scala.scalajs.js.JSApp {
  def main(): Unit = {
    Driver.main(Array("-i", "GCDTester.fir", "-X", "verilog"))
  }
}
