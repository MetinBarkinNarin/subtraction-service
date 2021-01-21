package com.mycompany.calculator.subtractionservice.controller;

import com.mycompany.calculator.subtractionservice.domain.CalculationResult;
import com.mycompany.calculator.subtractionservice.service.SubtractionService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/subtraction")
public class SubtractionController implements ISubtractionController {

    SubtractionService ISubtractionServiceIm;

    public SubtractionController(SubtractionService ISubtractionServiceIm) {
        this.ISubtractionServiceIm = ISubtractionServiceIm;
    }

    @GetMapping(
            value = "/calculate",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Override
    public CalculationResult getCalculationResult(Integer one, Integer two) {
        return ISubtractionServiceIm.subtraction(one, two);
    }
}
