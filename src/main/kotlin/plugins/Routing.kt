package com.ayaan.plugins

import com.ayaan.routes.randomRabbit
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
//        get("/") {
//            call.respondText("Hello World!")
//        }
        randomRabbit()
        // Static plugin. Try to access `/static/index.html`
        staticResources("/static", "static")
    }
}