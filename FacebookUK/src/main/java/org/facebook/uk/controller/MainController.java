package org.facebook.uk.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @GetMapping
  ResponseEntity<String> helloWorld() {
    return new ResponseEntity<>("<h1>Facebook UK</h1>", HttpStatusCode.valueOf(200));
  }
}
