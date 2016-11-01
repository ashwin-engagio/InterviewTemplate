package com.example.app

import org.scalatra._

class MyScalatraServlet extends InterviewStack {

  get("/") {
    contentType="text/html"

    ssp("/hello-scalate", "layout" -> "")
  }

}
