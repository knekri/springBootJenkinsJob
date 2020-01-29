package com.example.springBootJenkinsJob;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

  @RequestMapping("/hello")
  public HelloObject index() {
    return new HelloObject("Greetings from spring boot app!!!");
  }

  @Data
  private static class HelloObject {

    @NonNull
    @JsonProperty(value = "sayHello")
    private String greeting;
  }

}
