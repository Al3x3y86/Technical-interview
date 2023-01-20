import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScannerException {
        //Напишите пример перехвата и обработки исключения с использованием собственных исключений.
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x == 0 ){
                throw new ScannerException("Все кроме 0");

            }
        }

    }
}