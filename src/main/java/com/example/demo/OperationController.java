package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//N.B.: I have used different ways of throwing errors purely for demonstration's sake

@RestController
public class OperationController {

    @GetMapping("/operation")
    public Double calculate(Operation operation){
        double v1;
        double v2;
        String operator = operation.getOp();

        /*Here I am using "Double" so that values such as "null" or "Infinite" become admissible
        I chose "Double" instead of "double" because 0 is a valid output for this method, since
        you can convert 0 USD to 0 NOK, for example*/
        Double output;

        try {
            v1 = operation.getV1();
        } catch (Exception e){
            throw new NumberFormatException("v1 is not a number");
        }

        try {
            v2 = operation.getV2();
        } catch (NumberFormatException e){
            System.err.println("v2 is not a number");
            throw new NumberFormatException();
        }

        switch (operator){
            case "plus" : output = add(v1, v2);
                break;
            case "minus" : output = subtract(v1, v2);
                break;
            case "times" : output = multiply(v1, v2);
                break;
            case "divided" : output = divide(v1, v2);
                break;
            default: output=null;
        }
        return output;
    }

    public double add(double v1, double v2){
        return v1+v2;
    }

    public double subtract(double v1, double v2){
        return v1-v2;
    }

    public double multiply(double v1, double v2){
        return v1*v2;
    }

    public Double divide(double v1, double v2){
        //Since we are using Double instead of double, a try/catch here would not catch an exception
        //That is because any value divided by 0 will result in Infinity, when using "Double"
        if (v2!=0) {
            System.out.println(v1/v2);
            return v1 / v2;
        } else{
            //An alternative to handle this error is to throw a new ArithmeticException
            System.err.println("Impossible to divide by 0");
            return null;
        }
    }
}
