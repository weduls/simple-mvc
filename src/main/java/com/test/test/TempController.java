package com.test.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

    @GetMapping("/wedul/test")
    public ResponseEntity test(String data) {
        return ResponseEntity.ok(data);
    }

}
