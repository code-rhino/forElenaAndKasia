package io.zipcode.example;

import org.springframework.stereotype.Service;

@Service
public class FeelingsService {

    public String feelingLogic(FeelingRequest request){
        String reponse = "Cheer Up Mate";
        if(request.isFeelingGood()){
            reponse = "Keep it up";
        }
        return reponse;
    }
}
