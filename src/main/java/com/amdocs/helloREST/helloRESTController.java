package com.amdocs.helloREST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("./")
public class helloRESTController{
@GetMapping("hello")
public String sayHello(){
return "Hello This is Ajay";
}
}
