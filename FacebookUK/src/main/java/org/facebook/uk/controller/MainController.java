package org.facebook.uk.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@AllArgsConstructor
public class MainController {
  RestTemplate restTemplate;


  @GetMapping("hello-uk")
  String getResponse() {
    return "hello from United Kingdom.";
  }

  @GetMapping
  ResponseEntity<String> helloWorld() {
    String response = "FACEBOOK UK: Trying to connect to FACEBOOK New York.";
    String reply = restTemplate.getForObject("http://FACEBOOK-NY/hello-ny", String.class);
    String connection = "Connected: Connected to FACEBOOK New York.";
    return new ResponseEntity<>(response + connection + reply, HttpStatusCode.valueOf(200));
  }
}
