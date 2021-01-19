package com.mycompany.calculator.subtractionservice.service;

import com.mycompany.calculator.subtractionservice.domain.CalculationResult;

public interface SubtractionService {

    CalculationResult subtraction(Integer numberOne, Integer numberTwo);
}
