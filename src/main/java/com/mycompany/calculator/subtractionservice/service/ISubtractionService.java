package com.mycompany.calculator.subtractionservice.service;

import com.mycompany.calculator.subtractionservice.domain.CalculationResult;
import org.springframework.stereotype.Service;

@Service
public class ISubtractionService implements SubtractionService {

    @Override
    public CalculationResult subtraction(Integer numberOne, Integer numberTwo) {
        return new CalculationResult("SUCCESS", numberTwo - numberOne);
    }
}
