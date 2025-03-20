package actions;

import Exceptions.ErrorMsg;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PlusClass {

    public Scanner console = new Scanner(System.in);
    public Random random = new Random();
    final int NUMBER = 10;
    public boolean enterNumberLoop = false;
    public boolean ifCorrect = false; //Проверка на правильность решения
    public int firstNumber;
    public int secondNumber;
    public int result;
    public Integer answer;
    ErrorMsg error = new ErrorMsg();


    public void isPlus() {

        while (!enterNumberLoop) {
            firstNumber = random.nextInt(NUMBER);
            secondNumber = random.nextInt(NUMBER);
            System.out.printf("%d + %d = ", firstNumber, secondNumber);
            result = movePlus(firstNumber, secondNumber);
           // answer = console.nextInt();
            inputMismatchError();
//            try {
//                answer = console.nextInt();
//                enterNumberLoop = true;
//            } catch (InputMismatchException e) {
//                System.out.println("Недопустимый ввод, используем цифры");
//                System.out.printf("%d + %d = ", firstNumber, secondNumber);
//                enterNumberLoop = true;
//                // ifCorrect = true;
//                // Greetings.greetingsMenu();
//            }


        }
    }

    public void ifCorrect(int result) {
        //   int counter = 0;
        while (!ifCorrect) {
            System.out.println("Неправильно, попробуй еще раз");
            System.out.printf("%d + %d = ", firstNumber, secondNumber);
            ifCorrect = true;
            //error.inputMismatchError();
            //answer = console.nextInt();
            // counter++;
            if (answer == result) {
                System.out.println("Правильно!");
                isPlus();
                ifCorrect = true;
            }
//            if (counter == 1) {
//                youTyred();
//            }
        }
    }

    public void youTyred() {
        String action = "";
        System.out.println("Устал ? Желаешь закончить ? y/n");
        action = console.next();
        switch (action) {
            case "y":
                System.out.println("Выход в меню");
                ifCorrect = true;
                enterNumberLoop = true;
                Greetings.greetingsMenu();
                break;
            case "n":
                System.out.println("Продолжаем");
                enterNumberLoop = false;
                isPlus();
                break;
            default:
                System.out.println("Нужно ввести y/n");
                break;
        }
    }

    public int movePlus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public void inputMismatchError() {


        try {
            answer = console.nextInt();
            if (answer != result) {
                ifCorrect(result);
            }

        } catch (InputMismatchException e) {
            System.out.println("Недопустимый ввод, используем цифры");
            System.out.printf("%d + %d = ", firstNumber, secondNumber);
            enterNumberLoop = true;

            // ifCorrect = true;
            // Greetings.greetingsMenu();

        }

    }
}

