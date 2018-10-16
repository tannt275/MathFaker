package tannt275.crazyarrange.controller;

import android.util.Log;

import java.util.Random;

import tannt275.crazyarrange.model.CalculatorModel;

public class CalculatorController {
    private String TAG = CalculatorController.class.getName();

    private static CalculatorController instance = new CalculatorController();

    public static CalculatorController getInstance() {
        return instance;
    }

    public CalculatorModel generateOperation(int level) {
        CalculatorModel calculatorModel = new CalculatorModel();
        Random random = new Random();

        return calculatorModel;
    }

    public CalculatorModel generateAddOperationBelowLevel3(Random random) {
        CalculatorModel calculatorModel = new CalculatorModel();
        boolean resultBoolean = random.nextBoolean();
        calculatorModel.setResult(resultBoolean);

        int firstOperator = random.nextInt(99);
        int secondOperator = random.nextInt(99 - firstOperator);
        int result = firstOperator + secondOperator;
        calculatorModel.setFirstOperator(firstOperator);
        calculatorModel.setSecondOperator(secondOperator);

        if (resultBoolean) {
            calculatorModel.setMainResult(result);
        } else {
            calculatorModel.setMainResult(randomAddWrong(firstOperator, secondOperator, random));
        }

        return calculatorModel;
    }

    private int randomAddWrong(int first, int second, Random random) {
        int result;
        do {
            result = random.nextInt(99);
        } while (result == (first + second));
        return result;
    }

    private int randomMinusWrong(int first, int second, Random random) {
        int result;
        do {
            result = random.nextInt(99);
        } while (result == (first - second));
        return result;
    }
}
