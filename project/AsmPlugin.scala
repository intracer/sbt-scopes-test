import sbt.{AutoPlugin, Def}
import sbt._
import Keys._

object AsmPlugin extends AutoPlugin {

  override def requires = plugins.JvmPlugin

  override def trigger = allRequirements

  object autoImport {
    lazy val asm = taskKey[Unit]("asm")
  }

  import autoImport._

  override def projectSettings: Seq[Def.Setting[_]] = settings

  lazy val settings = Seq(
    asm := Def.task {
      val t = (test in asm).value
      val s = (streams in asm).value
      s.log.info("yahooo")
    }.value,
    test in asm := (test in Test).value
  )
}