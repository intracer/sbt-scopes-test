import sbt.Keys._
import sbt.{AutoPlugin, Def, _}
import sbtassembly.AssemblyPlugin

object NoTestPlugin extends AutoPlugin {

  override def requires = plugins.JvmPlugin

  override def trigger = allRequirements

  val settings: Seq[Def.Setting[_]] = Seq(
    test in AsmPlugin.autoImport.asm := {},
    test in AssemblyPlugin.autoImport.assembly := {}
  )
}