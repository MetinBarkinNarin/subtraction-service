package com.mycompany.calculator.subtractionservice.controller;

import com.mycompany.calculator.subtractionservice.domain.CalculationResult;
import org.springframework.web.bind.annotation.RequestParam;

public interface ISubtractionController {
    public CalculationResult getCalculationResult(@RequestParam(value = "one") Integer one,
                                                  @RequestParam(value = "two") Integer two);
}
