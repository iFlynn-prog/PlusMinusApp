package actions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PlusClass  {

    Scanner console = new Scanner(System.in);
    Random random = new Random();
    final int NUMBER = 10;
    boolean enterNumberLoop = false;
    boolean ifCorrect = false; //Проверка на правильность решения
    int firstNumber;
    int secondNumber;
    int result;
    int answer;


    public void isPlus() {
        while (!enterNumberLoop) {
            firstNumber = random.nextInt(NUMBER);
            secondNumber = random.nextInt(NUMBER);
            System.out.printf("%d + %d = ", firstNumber, secondNumber);
            result = movePlus(firstNumber, secondNumber);
            try {
                answer = console.nextInt();
                ifCorrect(result);
            } catch (InputMismatchException e) {
                System.out.println("Введите число блеать");
                console.nextInt();
            }
        }
    }

    public void ifCorrect(int result) {
        int counter = 0;
        while (!ifCorrect) {

            try {
                System.out.println("Неправильно, попробуй еще раз");
                answer = console.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введите число");
                console.next();
            }
            counter++;
            if (answer == result) {
                System.out.println("Правильно!");
                isPlus();
                ifCorrect = true;
            }
            if (counter == 1) {
                youTyred();
            }
        }
    }

    public void youTyred() {
        System.out.println("Устал ? Желаешь закончить ? y/n");
        String action = "";
        try {
            action = console.next();

        } catch (InputMismatchException e) {
            System.out.println("не получен корректный ввод");
            console.next();
        }

        switch (action) {
            case "y":
                System.out.println("Выход в меню");
                ifCorrect = true;
                enterNumberLoop = true;
                Greetings.greetingsMenu();
                break;
            case "n":
                System.out.println("продолжаем");
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

}

