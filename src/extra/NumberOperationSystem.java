package extra;

/**
 * The Number Operation System is Mini Java Project for Clearing basic concepts.
 * Project covers loops, operators, variables, printing values, Switch case and many more.
 */

import java.util.Scanner;

public class NumberOperationsSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n*** Number Operations System ***");
            System.out.println("1. Print Numbers from 1 to 10");
            System.out.println("2. Print Numbers from 51 to 60");
            System.out.println("3. Print Numbers from 100 to 81 (Reverse Order)");
            System.out.println("4. Find Factorial of a Number");
            System.out.println("5. Print Fibonacci Series");
            System.out.println("6. Print Table of a Given Number");
            System.out.println("7. Print Number in Reverse Order");
            System.out.println("8. Find Max Digit in a Number");
            System.out.println("9. Summation of Digits");
            System.out.println("10. Summation of First and Last Digit");
            System.out.println("11. Display Day of the Week");
            System.out.println("12. Perform Arithmetic Operations");
            System.out.println("13. Find Area (Triangle, Rectangle, Circle)");
            System.out.println("14. Check Odd or Even");
            System.out.println("15. Check Prime or Not");
            System.out.println("16. Check Positive or Negative");
            System.out.println("17. Check Leap Year");
            System.out.println("18. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printNumbers1To10();
                    break;
                case 2:
                    printNumbers51To60();
                    break;
                case 3:
                    printNumbers100To81();
                    break;
                case 4:
                    findFactorial();
                    break;
                case 5:
                    printFibonacci();
                    break;
                case 6:
                    printTable();
                    break;
                case 7:
                    reverseNumber();
                    break;
                case 8:
                    findMaxDigit();
                    break;
                case 9:
                    summationOfDigits();
                    break;
                case 10:
                    summationFirstAndLastDigit();
                    break;
                case 11:
                    displayDayOfWeek();
                    break;
                case 12:
                    arithmeticOperations();
                    break;
                case 13:
                    findArea();
                    break;
                case 14:
                    checkOddEven();
                    break;
                case 15:
                    checkPrime();
                    break;
                case 16:
                    checkPositiveNegative();
                    break;
                case 17:
                    checkLeapYear();
                    break;
                case 18:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (choice != 18);

        scanner.close();
    }

    // Method to print numbers from 1 to 10 using for loop
    public static void printNumbers1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Method to print numbers from 51 to 60 using while loop
    public static void printNumbers51To60() {
        int i = 51;
        while (i <= 60) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    // Method to print numbers from 100 to 81 using do-while loop
    public static void printNumbers100To81() {
        int i = 100;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 81);
        System.out.println();
    }

    // Method to find factorial of a number
    public static void findFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }

    // Method to print Fibonacci series up to a given number
    public static void printFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci series: " + a + " " + b + " ");
        for (int i = 2; i < limit; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Method to print the table of a given number
    public static void printTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    // Method to reverse a number
    public static void reverseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

    // Method to find the maximum digit in a number
    public static void findMaxDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int maxDigit = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            num /= 10;
        }
        System.out.println("Max digit is: " + maxDigit);
    }

    // Method to find the summation of digits in a number
    public static void summationOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Summation of digits: " + sum);
    }

    // Method to find summation of first and last digit of a number
    public static void summationFirstAndLastDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int lastDigit = num % 10;
        while (num >= 10) {
            num /= 10;
        }
        int firstDigit = num;
        System.out.println("Summation of first and last digit: " + (firstDigit + lastDigit));
    }

    // Method to display day of the week using switch-case
    public static void displayDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 for Monday, 7 for Sunday): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }
    }

    // Method for arithmetic operations using switch-case
    public static void arithmeticOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Choose an operation:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Sum: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Difference: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Product: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Quotient: " + (num1 / num2));
                } else {
                    System.out.println("Division by zero error!");
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }

    // Method to find the area of a shape using if conditions
    public static void findArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose shape to find area:");
        System.out.println("1. Triangle\n2. Rectangle\n3. Circle");
        int shape = scanner.nextInt();
        if (shape == 1) {
            System.out.print("Enter base and height of triangle: ");
            double base = scanner.nextDouble();
            double height = scanner.nextDouble();
            System.out.println("Area of Triangle: " + (0.5 * base * height));
        } else if (shape == 2) {
            System.out.print("Enter length and breadth of rectangle: ");
            double length = scanner.nextDouble();
            double breadth = scanner.nextDouble();
            System.out.println("Area of Rectangle: " + (length * breadth));
        } else if (shape == 3) {
            System.out.print("Enter radius of circle: ");
            double radius = scanner.nextDouble();
            System.out.println("Area of Circle: " + (Math.PI * radius * radius));
        } else {
            System.out.println("Invalid shape choice!");
        }
    }

    // Method to check if a number is odd or even
    public static void checkOddEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    // Method to check if a number is prime
    public static void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }

    // Method to check if a number is positive or negative
    public static void checkPositiveNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    // Method to check if a year is a leap year
    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}