package tannt275.crazyarrange.model;

/**
 * score increase after a game is wright, level 1 => score + 1, level 2 => score + 2, level 3 => score + 3
 * if level == 1 => operation is + or -, equal operation is =
 * level == 2 => operation is +, -, x, equal operation is =
 * level == 3 => operation is +, -, x, equal operation is =, <, ></,>
 */
public class CalculatorModel {
    private int firstOperator;
    private int secondOperator;
    private int mainResult;
    private int extraResult;
    private int operation;
    private int equalOperation;
    private int level;
    private int score;
    private int time;

    public int getFirstOperator() {
        return firstOperator;
    }

    public void setFirstOperator(int firstOperator) {
        this.firstOperator = firstOperator;
    }

    public int getSecondOperator() {
        return secondOperator;
    }

    public void setSecondOperator(int secondOperator) {
        this.secondOperator = secondOperator;
    }

    public int getMainResult() {
        return mainResult;
    }

    public void setMainResult(int mainResult) {
        this.mainResult = mainResult;
    }

    public int getExtraResult() {
        return extraResult;
    }

    public void setExtraResult(int extraResult) {
        this.extraResult = extraResult;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public int getEqualOperation() {
        return equalOperation;
    }

    public void setEqualOperation(int equalOperation) {
        this.equalOperation = equalOperation;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
