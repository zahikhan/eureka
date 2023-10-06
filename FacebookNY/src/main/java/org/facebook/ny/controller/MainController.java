package org.facebook.ny.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/*
 * Facebook */

@RestController
@AllArgsConstructor
public class MainController {
  RestTemplate restTemplate;

  @GetMapping("hello-ny")
  String getResponse() {
    return "hello from new york.";
  }

  @GetMapping
  ResponseEntity<String> helloWorld() {
    String response = "FACEBOOK UK: Trying to connect to FACEBOOK UNITED KINGDOM.";
    String reply = restTemplate.getForObject("http://FACEBOOK-UNITED-KINGDOM", String.class);
    String connection = "Connected: Connected to FACEBOOK FACEBOOK-UNITED-KINGDOM.";
    return new ResponseEntity<>(response + connection + reply, HttpStatusCode.valueOf(200));
  }
}
