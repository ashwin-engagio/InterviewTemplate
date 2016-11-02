package com.example.app

import com.example.controller.NameUtils
import org.scalatra._

class MyScalatraServlet extends InterviewStack {

  get("/") {
    contentType="text/html"
    ssp("/index", "layout" -> "")
  }

  get("/names") {
    NameUtils.getNames()

  }
}
