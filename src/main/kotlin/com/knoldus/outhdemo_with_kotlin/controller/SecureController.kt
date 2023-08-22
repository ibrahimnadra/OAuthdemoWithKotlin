package com.knoldus.outhdemo_with_kotlin.controller

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping


@Controller
class SecureController {

    @GetMapping("/")
    fun main(@AuthenticationPrincipal oauth2User: OAuth2User, model: Model): String {
        val loginId = oauth2User.getAttribute<String>("login") ?: "unknown-login"
        model.addAttribute("loginId", loginId)
        return "home_page.html"
    }
}
