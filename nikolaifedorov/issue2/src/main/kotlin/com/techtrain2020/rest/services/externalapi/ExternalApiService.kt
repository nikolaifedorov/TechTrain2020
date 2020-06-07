package com.techtrain2020.rest.services.externalapi

import org.springframework.stereotype.Service
import java.net.URL


@Service
class ExternalApiService {

    private val expectedResponse = "МЫ"

    val url = URL("http://localhost:8080/")

    fun get(): String {
        val response: String = url.readText()

        if (response == expectedResponse) {
            return response
        }

        return ""
    }
}
