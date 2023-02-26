package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/test")
public class TestControler {
    private int counter = 0;

    @GetMapping(value = "/getMessage")
    public ResponseEntity testMessgage() {
        System.out.println("HTTP GET request counter "+counter++);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body("Hello world");
    }


    @PostMapping(value = "/employe", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void testHttpPostRequest(@RequestBody Employe employe){
        System.out.println("HTTP POST request employe name "+employe.getName()+" employe badge "+employe.getBadgeNum());
    }

    @ResponseBody
    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    public String handleHttpMediaTypeNotAcceptableException() {
        return "acceptable MIME type:" + MediaType.APPLICATION_JSON_VALUE;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void handleError(Exception ex) {
        // TODO: log exception
    }
}
