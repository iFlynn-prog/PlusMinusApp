package menu;

import select.AdditionClass;
import select.SubtractionClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StartMenuClass {
    boolean startMenuLoop = false;
    public void startMenu() {
        Scanner console = new Scanner(System.in);
        AdditionClass addition = new AdditionClass();
        SubtractionClass subtraction = new SubtractionClass();

        int choose;
        while (!startMenuLoop) {
            System.out.println("Меню");
            System.out.println("1: Выберите сложение");
            System.out.println("2: Выберите вычитание");
            System.out.println("3: Выход");

            try {
                choose = console.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Цифры в меню блеать");
                startMenu();
                break;
            }

            switch (choose) {

                case 1:
                    System.out.println("Примеры на сложение");
                    addition.isPlus();
                    break;
                case 2:
                    System.out.println("Примеры на вычитание");
                    System.out.println("В РАЗРАБОТКЕ");
                    subtraction.isMinus();

                    break;
                case 3:
                    System.out.println("До свидания");
                    Runtime.getRuntime().exit(0);
                    break;
                default:
                    System.out.println("Выберите пункт меню, числа от 1 до 3");
                    break;
            }
        }
    }
}
