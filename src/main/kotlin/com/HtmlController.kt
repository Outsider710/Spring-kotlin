package com

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody


@Controller
class HtmlController {

    @GetMapping("/")
    fun index(model: Model):String {
        model["title"] = "index"
        return "index"
    }

    @GetMapping("/login")
    fun login(model: Model) {
        model["title"] = "login"
    }

    @PostMapping("/login/verify")
    fun log(@RequestBody user: User, model: Model) {
        model["title"] = "login Verify"
        model["login"] = user.login
    }
}


data class User(val login: String, val password: String)

