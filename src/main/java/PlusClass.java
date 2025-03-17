import java.util.Random;
import java.util.Scanner;

public class PlusClass {

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
            answer = console.nextInt();
            if (answer != result) {
                ifCorrect(result);
            }
        }
    }
    public void ifCorrect(int result) {
        int counter = 0;

        while (!ifCorrect) {
            System.out.println("Неправильно, попробуй еще раз");
            answer = console.nextInt();
            counter++;
            if (answer == result) {
                System.out.println("Правильно!");
                ifCorrect = true;
            }
            if (counter == 2) {
                youTyred();
            }
        }
    }
    public void youTyred() {
        System.out.println("Устал ? Желаешь закончить ? y/n");
        String action = console.next();
        switch (action) {
            case "y":
                System.out.println("Выход в меню");
                ifCorrect = true;
                enterNumberLoop = true;
                isPlus();
                break;
            case "n":
                System.out.println("продолжаем");
                enterNumberLoop = false;
                isPlus();
                break;
            default:
                System.out.println("Default");
                break;
        }

        //TODO  В разработке
    }

    public int movePlus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}

