package ua.in.transceptor;

import java.util.Stack;

/**
 * Created by Alex Korneyko on 03.07.2016.
 */
public class ReversePolishNotationCalculator {

    public double evaluate(String expr) {
        String[] expressionArray = expr.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String expressionElement : expressionArray) {
            double operandA;
            double operandB;

            switch (expressionElement) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    if (expressionElement.length() == 1) {
                        operandB = stack.pop();
                        operandA = stack.pop();
                        stack.push(operandA - operandB);
                    } else {
                        stack.push(parse(expressionElement));
                    }
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    operandB = stack.pop();
                    operandA = stack.pop();
                    stack.push(operandA / operandB);
                    break;
                default:
                    stack.push(parse(expressionElement));
                    break;
            }
        }
        return stack.pop();
    }

    private static double parse(String expressionElement) {

        if(expressionElement.equals("")) return 0;

        return Double.parseDouble(expressionElement);

    }
}
