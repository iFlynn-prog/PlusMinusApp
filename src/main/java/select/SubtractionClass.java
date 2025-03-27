package select;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SubtractionClass {
    Scanner console = new Scanner(System.in);
    Random random = new Random();
    int firstNumber;
    int secondNumber;
    int minusResult;
    Integer minusAnswer;
    boolean subtractionLoop = false;
    boolean subtractionLoopCheckCorrect = false;
    int actionMinusResult;

    public int actionMinus(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            actionMinusResult = firstNumber - secondNumber;
            System.out.printf("%d - %d = ", firstNumber, secondNumber);
        } else {
            actionMinusResult = secondNumber - firstNumber;
            System.out.printf("%d - %d = ", secondNumber, firstNumber);
        }
        return actionMinusResult;

    }

    public void isMinus() {
        try {
            while (!subtractionLoop) {
                firstNumber = random.nextInt(10);
                secondNumber = random.nextInt(10);
                minusResult = actionMinus(firstNumber, secondNumber);
                minusAnswer = console.nextInt();
                if (minusAnswer.equals(minusResult)) {
                    System.out.println("Правильно");
                    isMinus();
                } else {
                    while (!subtractionLoopCheckCorrect) {
                        System.out.print("Неверно, попробуй еще раз \n");
                        System.out.print("Введи правильный ответ: ");
                        minusAnswer = console.nextInt();
                        if (minusAnswer.equals(minusResult)) {
                            System.out.println("Правильно");
                            isMinus();
                        }
                    }
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Блок ошибки на вычитании");
            subtractionLoop = true;
            subtractionLoopCheckCorrect = true;


        }
    }
}