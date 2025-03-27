package select;

import menu.StartMenuClass;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AdditionClass {

    Scanner console = new Scanner(System.in);
    Random random = new Random();
    final int NUMBER = 10;
    private final boolean enterNumberLoop = false;
    private final boolean ifCorrect = false; //Проверка на правильность решения
    private int firstNumber;
    private int secondNumber;
    private Integer answer;
    StartMenuClass startMenu = new StartMenuClass();

    public void isPlus() {
        while (!enterNumberLoop) {
            int plusResult;
            try {
                firstNumber = random.nextInt(NUMBER);
                secondNumber = random.nextInt(NUMBER);
                System.out.printf("%d + %d = ", firstNumber, secondNumber);
                plusResult = actionPlus(firstNumber, secondNumber);
                answer = console.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Недопустимый ввод, используем цифры");
                startMenu.startMenu();
                break;
            }
            if (!answer.equals(plusResult)) {
                ifCorrect(plusResult);
            }
//            if (console.hasNextInt()) {
//                System.out.printf("%d", answer);
//
//            }
        }
    }

    public void ifCorrect(int result) {
        while (!ifCorrect) {
            try {
                System.out.println("Неправильно, попробуй еще раз: ");
                System.out.printf("%d + %d = ", firstNumber, secondNumber);
                answer = console.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Недопустимый ввод, нужно ввести число");
                isPlus();
                break;
            }
            if (answer.equals(result)) {
                System.out.println("Правильно!");

            }
        }
    }

//    public void youTyred() {
//        String action = "";
//        System.out.println("Устал ? Желаешь закончить ? y/n");
//        action = console.next();
//        switch (action) {
//            case "y":
//                System.out.println("Выход в меню");
//                ifCorrect = true;
//                enterNumberLoop = true;
//                StartMenuClass.startMenu();
//                break;
//            case "n":
//                System.out.println("Продолжаем");
//                enterNumberLoop = false;
//                isPlus();
//                break;
//            default:
//                System.out.println("Нужно ввести y/n");
//                break;
//        }
//    }

    public int actionPlus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}


