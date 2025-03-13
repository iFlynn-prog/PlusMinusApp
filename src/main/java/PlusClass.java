import java.util.Random;
import java.util.Scanner;

public class PlusClass {

    public static void plus() {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        final int NUMBER = 10;
        boolean isFinished = false;

        while (!isFinished) {

            int firstNumber = random.nextInt(NUMBER);
            int secondNumber = random.nextInt(NUMBER);

            System.out.printf("%d + %d = ", firstNumber, secondNumber);
            int result = movePlus(firstNumber, secondNumber);
            int answer = console.nextInt();

            while (answer != result) {
                System.out.print("Неправильно, попробуй еще раз: ");
                answer = console.nextInt();
            }

            System.out.println("Правильно, давай еще: ");

        }
    }

    public static int movePlus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}