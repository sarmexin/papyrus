package com.sepfort.papyrus.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Greeting test() throws InterruptedException {
        Thread.sleep(4000);
        return new Greeting(100L, "new text");
    }


}

