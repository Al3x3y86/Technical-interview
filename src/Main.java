import java.util.InputMismatchException;
import java.util.Scanner;

//Билет №9
//Задача
//Напишите пример обработки нескольких исключений в одном блоке catch.
public class Main {
    public static void main(String[] args) {
        System.out.println("Внесите два числа");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Число 1");
            int num1 = scanner.nextInt();

            System.out.println("Число 2");
            int num2 = scanner.nextInt();

            int divideNum = num1/ num2;
            System.out.println("Результат:" + divideNum);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Пожалуйста убедитесь, что ведено правильное значение!");
        }
    }
}
