package com.reviewdog.sample.controller.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/reviewdog")
class DemoController {

    @GetMapping("/get")
    fun get(): String {
        return "Hello"
    }
}