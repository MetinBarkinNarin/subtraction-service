package com.mycompany.calculator.subtractionservice.service;

import com.mycompany.calculator.subtractionservice.domain.CalculationResult;

public interface ISubtractionService {

    CalculationResult subtraction(Integer numberOne, Integer numberTwo);
}
