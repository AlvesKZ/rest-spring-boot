package com.AlvesKZ.math;

import org.springframework.stereotype.Component;

@Component
public class SimpleMath {

    public double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public double subtraction(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public double multiplication(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    public double division(double numberOne, double numberTwo) {

        if (numberTwo <= 0) throw new UnsupportedOperationException("The divider number must be bigger than 0!");

        return numberOne / numberTwo;
    }

    public double mean(double numberOne, double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public double squareRoot(double number) {

        if (number < 0) throw new UnsupportedOperationException("Cannot calculate square root of negative numbers!");

        return Math.sqrt(number);
    }
}