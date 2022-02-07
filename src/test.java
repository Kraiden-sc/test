import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");

            String name = scanner.next();
            if (name.length() < 3) {
                System.out.println("Имя должно сожерожать от 3х символов");
            } else {
                System.out.println("Введите ваш возвраст");

                int age = scanner.nextInt();
                    if (age > 18 & age < 50) {
                        System.out.println("Добро пожаловать " + name);
                    } else {
                        System.out.println(name + " ваш возвраст должен быть от 18 до 50 лет");
                    }

            }
            }
        }


