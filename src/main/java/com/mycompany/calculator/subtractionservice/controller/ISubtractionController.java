package com.mycompany.calculator.subtractionservice.controller;

import com.mycompany.calculator.subtractionservice.domain.CalculationResult;
import com.mycompany.calculator.subtractionservice.service.ISubtractionService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/subtraction")
public class ISubtractionController implements SubtractionController {

    ISubtractionService iSubtractionService;

    public ISubtractionController(ISubtractionService iSubtractionService) {
        this.iSubtractionService = iSubtractionService;
    }

    @GetMapping(
            value = "/calculate",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @Override
    public CalculationResult getCalculationResult(Integer one, Integer two) {
        return iSubtractionService.subtraction(one,two);
    }
}
