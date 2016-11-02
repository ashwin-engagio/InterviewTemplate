package com.example.controller

import scala.io.Source

/**
  * Created by AshwinSundar on 11/1/16.
  */

object NameUtils {
  def getNames (): Unit = {
    // Backend logic goes here...
  }

  def readNames (): List[String] = {
    val fileName = "/Users/AshwinSundar/Documents/workspace/Interview/interview/src/main/resources/names.txt"

    var nameList = List[String]()
    for (line <- Source.fromFile(fileName).getLines()) {
      nameList = line :: nameList
    }
    nameList
  }
}