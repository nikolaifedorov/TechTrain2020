package com.techtrain2020.rest.controllers.home

import com.techtrain2020.rest.services.externalapi.ExternalApiService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping


@RestController
class HomeController(val externalApiService: ExternalApiService) {

    @GetMapping("/")
    fun home(): String {
        return externalApiService.get() + " сломали"
    }

}
