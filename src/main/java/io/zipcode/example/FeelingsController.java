package io.zipcode.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeelingsController {

    @Autowired
    FeelingsService feelingsService;

    @PostMapping("/")
    public String howDoYouFeel(@RequestBody FeelingRequest request){
        return feelingsService.feelingLogic(request);
    }
}
