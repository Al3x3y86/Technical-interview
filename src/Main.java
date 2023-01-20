import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Напишите Java-программу, чтобы определить, является ли строка палиндромом, или нет

        // простой вариант
        String string = "Потоп";
        for(int x = string.length()/2-1; x>=0; x--) {
            if (string.charAt(string.length() - 1 - x) !=
                    string.charAt(x)){
                System.out.println (" не явлется палиндромом");
                break;
            }
        }

        // Сложный вариан
        String inputString, reversedString = "";
        Scanner scannerQ = new Scanner(System.in);
        int stringLength;
        System.out.println("Введите число или строку");
        inputString = scannerQ.nextLine();
        stringLength = inputString.length();
        for (int x = stringLength -1; x>=0; x--) {
            reversedString = reversedString + inputString.charAt(x);

        }
        System.out.println("перевернутое значение: " + reversedString);
        if(inputString.equals(reversedString))
            System.out.println("Введенное значение является палиндромом");
        else
            System.out.println("Введенное значение не является палиндромом");

        }
    }
