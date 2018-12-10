// See LICENSE for license details.

package firrtl

import firrtl.ir._
import firrtl.logging.LazyLogging
import firrtl.Parser._
import firrtl.Utils.time


object PlatformParser extends LazyLogging {
  /** Parses a file in a given filename and returns a parsed [[Circuit]] */
  def parseFile(filename: String, infoMode: InfoMode): Circuit =
    null.asInstanceOf[Circuit]

  /** Parses a String and returns a parsed [[Circuit]] */
  def parseString(text: String, infoMode: InfoMode): Circuit =
    null.asInstanceOf[Circuit]
  /** Parses a org.antlr.v4.runtime.CharStream and returns a parsed [[Circuit]] */
  // def parseCharStream(charStream: CharStream, infoMode: InfoMode): Circuit = {
  //   val (parseTimeMillis, cst) = time {
  //     val parser = {
  //       val lexer = new FIRRTLLexer(charStream)
  //       new FIRRTLParser(new CommonTokenStream(lexer))
  //     }

  //     parser.getInterpreter.setPredictionMode(PredictionMode.SLL)

  //     // Concrete Syntax Tree
  //     val cst = parser.circuit

  //     val numSyntaxErrors = parser.getNumberOfSyntaxErrors
  //     if (numSyntaxErrors > 0) throw new SyntaxErrorsException(s"$numSyntaxErrors syntax error(s) detected")
  //     cst
  //   }

  //   val visitor = new Visitor(infoMode)
  //   val (visitTimeMillis, visit) = time {
  //     visitor.visit(cst)
  //   }
  //   val ast = visit match {
  //     case c: Circuit => c
  //     case x => throw new ClassCastException("Error! AST not rooted with Circuit node!")
  //   }

  //   ast
  // }
}
