import sbt._
import Keys._

object LabBuild extends Build {
  
  lazy val scalaLabsSettings = Defaults.defaultSettings ++ Seq(
    organization := "com.jayway",
    version := "0.1",
    scalaVersion := "2.9.1",
    resolvers += ScalaToolsSnapshots
  ) 

  
  lazy val root = Project(id = "labs", base = file(".")) aggregate(lab01, lab02)
  
  lazy val lab01 = Project(
    id = "lab01",
    base = file("lab01"),
    settings = scalaLabsSettings ++ Seq(
      libraryDependencies ++= Dependencies.test,
      description := "Lab01"
    ))
  
  lazy val lab02 = Project(
    id = "lab02", 
    base = file("lab02"),
    settings = scalaLabsSettings ++ Seq(
      libraryDependencies ++= Dependencies.test,
      description := "Lab02"
    ))
}


object Dependencies {
  val scalatest = "org.scalatest" %% "scalatest" % "1.6.1" % "test"
  val junit = "junit" % "junit" % "4.8.2" % "test"
  val test = Seq(scalatest, junit)
}    
    