package com.ayaan

import com.ayaan.plugins.configureMonitoring
import com.ayaan.plugins.configureRouting
import com.ayaan.plugins.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureRouting()
}