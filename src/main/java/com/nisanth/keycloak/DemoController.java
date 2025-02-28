package com.nisanth.keycloak;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping
    @PreAuthorize("hasRole('client_user')") // role based authentication
    public String hello()
    {
        return "Hello from springBoot keycloak";
    }


    @GetMapping("/hello2")
    @PreAuthorize("hasRole('client_admin')") // role based authentication
    public String hello2()
    {
        return "Hello-2 from springBoot keycloak=ADMIN";
    }
}
