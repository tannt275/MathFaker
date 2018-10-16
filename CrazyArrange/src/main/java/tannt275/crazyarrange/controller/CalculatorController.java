package tannt275.crazyarrange.controller;

import java.util.Random;

import tannt275.crazyarrange.model.CalculatorModel;

public class CalculatorController {
    private CalculatorController instance = new CalculatorController();

    public CalculatorController getInstance() {
        return instance;
    }

    public CalculatorModel generateOperation(int level) {
        CalculatorModel calculatorModel = new CalculatorModel();
        Random random = new Random();
        //generate result: true or false
        boolean result = random.nextBoolean();
        int firstOperator = random.nextInt(8) + 1;
        int secondOperator = random.nextInt(8) + 1;
        int operatorRange = 0;
        if (level <= 1) {
            operatorRange = 2;
        } else {
            operatorRange = 3;
        }
        int operatorConvert = random.nextInt(operatorRange) + 1;
        return calculatorModel;
    }
}
