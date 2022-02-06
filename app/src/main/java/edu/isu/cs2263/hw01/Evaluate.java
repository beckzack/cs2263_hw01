package edu.isu.cs2263.hw01;

import java.util.ArrayDeque;

/**
 * A Java class that takes mathematical expressions and evaluates them from left to right
 *
 * @author Zackary Beck
 */
public class Evaluate {

    private int finalResult;

    /**
     * Takes the user's expression and sends it to be transformed into an array of characters
     *
     * @param expression The expression to be sent to the expressionToArrays method
     */
    public Evaluate(String expression) {
        expressionToArrays(expression);
    }

    /**
     * Returns the final result of the expression
     *
     * @return The result of the evaluated expression
     */
    public int getFinalResult() {
        return finalResult;
    }

    /**
     * Breaks the expression into an array and puts the values and operators in their respective array deques
     * Passes the array deques to be evaluated in the EvaluateExpression class
     *
     * @param expression The expression given by the user
     */
    public void expressionToArrays(String expression) {
        char[] chars = expression.toCharArray();
        ArrayDeque<Integer> values = new ArrayDeque<>();
        ArrayDeque<Character> operators = new ArrayDeque<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                StringBuilder stringBuilder = new StringBuilder();

                while (i < chars.length && chars[i] >= '0' && chars[i] <= '9') {
                    stringBuilder.append(chars[i]);
                    i++;
                }
                values.add(Integer.parseInt(stringBuilder.toString()));
                // We have to decrease i by one because otherwise it skips the character directly after the digit
                i--;
            } else if (chars[i] == '+' || chars[i] == '-' || chars[i] == '/' || chars[i] == '*') {
                operators.add(chars[i]);
            }
        }
        finalResult = evaluateExpression(values, operators);
    }

    /**
     * Takes an array deque of values and operators and computes their result from left to right
     *
     * @param values ArrayDeque of the numbers in the expression
     * @param operators ArrayDeque of the operators in the expression
     * @return The result of the expression
     */
    public int evaluateExpression(ArrayDeque<Integer> values, ArrayDeque<Character> operators) {
        while (!(operators.isEmpty())) {
            int num1 = values.removeFirst();
            int num2 = values.removeFirst();
            char operator = operators.removeFirst();

            values.addFirst(applyOperator(num1, num2, operator));
        }
        return values.removeFirst();
    }
    /**
     * Takes an operator and two numbers and applies the operator
     *
     * @param num1 The first number in the expression
     * @param num2 The other number in the expression
     * @param operator The operator to be applied using num1 and num2
     * @return The result of the operation
     */
    public int applyOperator(int num1, int num2, char operator) {
        int result = 0;

        // Check if num2 is equal to 0 - if it is, and we're trying to do division throw an error
        if (num2 == 0 && operator == '/') {
            throw new UnsupportedOperationException("Numbers can't be divisible by zero");
        }

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }
        return result;
    }
}
