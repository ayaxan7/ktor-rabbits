package com.ayaan.routes

import com.ayaan.model.Rabbit
import io.ktor.http.HttpStatusCode
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.response.respond
private const val BASE_URL="http://localhost:8080"
private val rabbits=listOf(
    Rabbit("carl","cute animated","$BASE_URL/static/rabbits/rabbit1.jpg"),
    Rabbit("AMBER","THIRD animated","$BASE_URL/static/rabbits/rabbit2.jpg"),
    Rabbit("max","SECOND animated","$BASE_URL/static/rabbits/rabbit3.jpg"),
    Rabbit("john","cute BLACK","$BASE_URL/static/rabbits/rabbit4.jpg"),
    Rabbit("jane","cute BROWN","$BASE_URL/static/rabbits/rabbit5.jpg")
)
fun Route.randomRabbit(){
    get("/random-rabbit"){
//        val index = rabbits.indices.random()
//        val result=rabbits[index]
        call.respond(
            status=HttpStatusCode.OK,
            message=rabbits.random()
        )
    }
}
