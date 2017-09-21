package firrtl

object FIRRTLJS extends scala.scalajs.js.JSApp {
  def main(): Unit = {
    Driver.execute(Array("-i", "GCDTester.fir", "-X", "verilog", "-o", "GCDTester.v"))
  }
}
