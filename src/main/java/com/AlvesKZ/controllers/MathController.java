package com.AlvesKZ.controllers;

import com.AlvesKZ.math.SimpleMath;
import com.AlvesKZ.utils.MathValidation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    private MathValidation mathValidation;
    private SimpleMath simpleMath;

    public MathController(MathValidation mathValidation, SimpleMath simpleMath) {
        this.mathValidation = mathValidation;
        this.simpleMath = simpleMath;
    }

    // http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
     public double sum(@PathVariable("numberOne") String numberOne,
                       @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!mathValidation.isNumeric(numberOne) || !mathValidation.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value!");

        return simpleMath.sum(mathValidation.convertToDouble(numberOne), mathValidation.convertToDouble(numberTwo)) ;
     }

    // http://localhost:8080/math/subtraction/3/5
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public double subtraction(@PathVariable("numberOne") String numberOne,
                              @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!mathValidation.isNumeric(numberOne) || !mathValidation.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value!");

        return simpleMath.subtraction(mathValidation.convertToDouble(numberOne), mathValidation.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/multiplication/3/5
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public double multiplication(@PathVariable("numberOne") String numberOne,
                                 @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!mathValidation.isNumeric(numberOne) || !mathValidation.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value!");

        return simpleMath.multiplication(mathValidation.convertToDouble(numberOne), mathValidation.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/division/3/5
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public double division(@PathVariable("numberOne") String numberOne,
                           @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!mathValidation.isNumeric(numberOne) || !mathValidation.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value!");

        return simpleMath.division(mathValidation.convertToDouble(numberOne), mathValidation.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/mean/3/5
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public double mean(@PathVariable("numberOne") String numberOne,
                       @PathVariable("numberTwo") String numberTwo) throws Exception {
        if (!mathValidation.isNumeric(numberOne) || !mathValidation.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value!");

        return simpleMath.mean(mathValidation.convertToDouble(numberOne), mathValidation.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/squareRoot/81
    @RequestMapping("/squareroot/{number}")
    public double squareRoot(@PathVariable("number") String number) throws Exception {
        if (!mathValidation.isNumeric(number))
            throw new UnsupportedOperationException("Please set a numeric value!");

        return simpleMath.squareRoot(mathValidation.convertToDouble(number));
    }


}
