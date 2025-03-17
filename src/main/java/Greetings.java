import java.util.Scanner;

public class Greetings {
    public static void greetings() {
        Scanner console = new Scanner(System.in);
        boolean startMenuLoop = false;
        PlusClass plusClass = new PlusClass();


        while (!startMenuLoop) {
            System.out.println("Меню");
            System.out.println("1: Выберите сложение");
            System.out.println("2: Выберите вычитание");
            System.out.println("3: Выход");

            int choose = console.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Примеры на сложение");
                    plusClass.isPlus();
                    break;
                case 2:
                    System.out.println("Примеры на вычитание");
                    System.out.println("В РАЗРАБОТКЕ");
                    break;
                case 3:
                    System.out.println("До свидания");
                    startMenuLoop = true;
                    break;
                default:
                    System.out.println("Выберите пункт меню, цисла от 1 до 3");
                    break;
            }
        }
    }
}
