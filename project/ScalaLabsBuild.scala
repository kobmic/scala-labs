import sbt._
import Keys._

object LabBuild extends Build {
  
  lazy val scalaLabsSettings = Defaults.defaultSettings ++ Seq(
    organization := "com.jayway",
    version := "0.1",
    scalaVersion := "2.9.1",
    libraryDependencies ++= Dependencies.test,
    resolvers += ScalaToolsSnapshots
  ) 

  
  lazy val root = Project(id = "labs", base = file(".")) aggregate(lab01, lab02, lab03, lab04, lab05, lab06, lab07, lab08, lab09)
  
  lazy val lab01 = Project(
    id = "lab01",
    base = file("lab01"),
    settings = scalaLabsSettings ++ Seq(
      description := "Lab01 - constructors, auxilliary constructors"
    ))
  
  lazy val lab02 = Project(
    id = "lab02", 
    base = file("lab02"),
    settings = scalaLabsSettings ++ Seq(
      description := "Lab02 - traits"
    ))
  
  lazy val lab03= Project(
    id = "lab03", 
    base = file("lab03"),
    settings = scalaLabsSettings ++ Seq(
      description := "Lab03 - constructors, function literals"
  ))
  
  lazy val lab04= Project(
    id = "lab04", 
    base = file("lab04"),
    settings = scalaLabsSettings ++ Seq(
      description := "Lab04 - stackable traits"
  )) 
  
  lazy val lab05= Project(
    id = "lab05", 
    base = file("lab05"),
    settings = scalaLabsSettings ++ Seq(
      description := "Lab05 - objects"
  )) 
  
  lazy val lab06= Project(
    id = "lab06", 
    base = file("lab06"),
    settings = scalaLabsSettings ++ Seq(
      description := "Lab06 - Companion objects"
  ))
  
  lazy val lab07= Project(
    id = "lab07", 
    base = file("lab07"),
    settings = scalaLabsSettings ++ Seq(
      description := "Lab07 - Pattern matching"
  ))
  
  lazy val lab08= Project(
    id = "lab08", 
    base = file("lab08"),
    settings = scalaLabsSettings ++ Seq(
      description := "Lab08 - Case classes"
  ))
  
  lazy val lab09= Project(
    id = "lab09", 
    base = file("lab09"),
    settings = scalaLabsSettings ++ Seq(
      description := "Lab09 - Implicit conversions"
  ))
    
  lazy val solutions = Project(
    id = "solutions", 
    base = file("solutions"),
    settings = scalaLabsSettings ++ Seq(
      libraryDependencies ++= Dependencies.test,
      description := "solutions"
    )) 
}


object Dependencies {
  val scalatest = "org.scalatest" %% "scalatest" % "1.6.1" % "test"
  val junit = "junit" % "junit" % "4.8.2" % "test"
  val test = Seq(scalatest, junit)
}    
    