package com.techtrain2020.rest.controllers.home

import com.techtrain2020.rest.RestApplication
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus


@SpringBootTest(
        classes = [RestApplication::class],
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerTests {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun shouldReturnMessage() {
        // GIVEN
        var expectedContent = "МЫ сломали";
        var url = "/";

        // WHEN
        val result = testRestTemplate.getForEntity(url, String::class.java)

        // THEN
        assertNotNull(result)
        assertEquals(HttpStatus.OK, result?.statusCode)
        assertEquals(expectedContent, result?.body)
    }

}