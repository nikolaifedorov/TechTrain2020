package com.techtrain2020.rest.services.externalapi

import org.springframework.stereotype.Service
import java.io.IOException
import java.net.URL


@Service
class ExternalApiService {

    private val externalApiUrl = "http://localhost:8080/"
    private val expectedResponse = "МЫ"

    fun get(): String {
        val url = try { URL(externalApiUrl) } catch (e: IOException)  { null } ?: return ""

        val response: String = try { url.readText() } catch (e: IOException)  { "" }

        if (response == expectedResponse) {
            return response
        }

        return ""
    }
}
