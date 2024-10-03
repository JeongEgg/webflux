package com.example.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {
    @GetMapping("/posts/{id}")
    public Map<String, String> getPosts(@PathVariable Long id) throws Exception {
        Thread.sleep(300);
        if (id > 10L) {
            throw new Exception("Too Long");
        }
        return Map.of("id",id.toString(), "content","Post content is %d".formatted(id));
    }
}
