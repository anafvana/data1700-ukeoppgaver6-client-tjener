package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    private final Integer[] tempArray = new Integer[]{-3,-2,2,7,12,16,18,17,12,7,3,-2};

    @GetMapping("/fetchTemp")
    public int fetchTemp(String inMonth){
        int outTemp;
        switch (inMonth.toLowerCase()){
            case "januar" : outTemp = tempArray[0];
                break;
            case "februar" : outTemp = tempArray[1];
                break;
            case "mars" : outTemp = tempArray[2];
                break;
            case "april" : outTemp = tempArray[3];
                break;
            case "mai" : outTemp = tempArray[4];
                break;
            case "juni" : outTemp = tempArray[5];
                break;
            case "juli" : outTemp = tempArray[6];
                break;
            case "august" : outTemp = tempArray[7];
                break;
            case "september" : outTemp = tempArray[8];
                break;
            case "oktober" : outTemp = tempArray[9];
                break;
            case "november" : outTemp = tempArray[10];
                break;
            case "desember" : outTemp = tempArray[11];
                break;
            default: outTemp = 0;
        }
        return outTemp;
    }

}
