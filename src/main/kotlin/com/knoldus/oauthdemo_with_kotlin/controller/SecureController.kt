package com.knoldus.oauthdemo_with_kotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SecureController {
    @GetMapping("/")
    fun main(): String {
        return "Hello, I have implemented SSO in Kotlin-Spring Boot project using OAuth2."
    }
}
