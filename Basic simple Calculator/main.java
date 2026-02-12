package Calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.print("Enter first Number: " );
        double num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        try {
            switch (op) {
                case '+':
                    result = cal.add(num1, num2);
                    break;
                case '-':
                    result = cal.subtract(num1, num2);
                    break;
                case '*': 
                    result = cal.multiply(num1, num2);
                    break;
                case '/': 
                    result = cal.divide(num1, num2); 
                    break; 
                default: 
                    System.out.println("Invalid operator."); 
                    return;
            }
            System.out.println("Result: " + result);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

class Calculator {

    public double add(double a, double b){
        return a+b;
    }

    public double subtract(double a, double b){
        return a-b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double divide(double a, double b){
        if(b==0){
            throw new IllegalArgumentException("Cannot divide by Zero");
        }
        return a/b;
    }

}