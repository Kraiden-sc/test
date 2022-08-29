import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");

            String name = scanner.next();
            if (name.length() < 2) {
                System.out.println("Имя должно состоять минимум из 3х символов");
            } else {
                System.out.println("Введите ваш возвраст");
                try {

                    int age = scanner.nextInt();
                    if (age > 17 & age < 50) {
                        System.out.println("Добро пожаловать " + name);
                    } else {
                        System.out.println(name + " ваш возвраст должен быть от 18 до 50 лет включительно");
                    }
                } catch (InputMismatchException t) {
                    System.out.println("Принимаются только целочисленные значения");
                }
            }
            }
        }


