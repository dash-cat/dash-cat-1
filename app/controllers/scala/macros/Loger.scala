package controllers

import scala.language.experimental.macros
import scala.reflect.macros.blackbox

// Logger object with macro implementation for logging
object Logger {
  def log(message: String): Unit = macro logImpl

  def logImpl(c: blackbox.Context)(message: c.Expr[String]): c.Expr[Unit] = {
    import c.universe._

    val pos = c.enclosingPosition
    val file = pos.source.file.name
    val line = pos.line

    // Macro to log messages with file and line information
    reify {
      println(s"[$file:$line] " + message.splice)
    }
  }
}
