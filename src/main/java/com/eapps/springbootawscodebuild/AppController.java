package com.eapps.springbootawscodebuild;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping
    public String getAppDetails(){
        return "App is running";
    }
}
