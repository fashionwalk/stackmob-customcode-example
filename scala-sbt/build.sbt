name := "scala-example"

organization := "com.stackmob"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.1"

libraryDependencies ++= {
  val ccVersion = "0.4.0"
  Seq(
    "com.stackmob" % "customcode" % ccVersion % "provided" withSources()
  )
}

packageOptions in (Compile, packageBin) += 
  Package.ManifestAttributes( java.util.jar.Attributes.Name.MAIN_CLASS -> "com.stackmob.example.EntryPointExtender" )

logBuffered := false
