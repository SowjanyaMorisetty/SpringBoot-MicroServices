package com.UST.cloudgateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBAckMethod")
        public String userServiceFallBAckMethod()
        {
            return "hi user it takes some time to load the server please wait..";
        }

    @GetMapping("/departmentServiceFallBAckMethod")
    public String departmentServiceFallBAckMethod()
    {
        return "hi user dept service  takes some time to load the server please wait..";
    }


}
