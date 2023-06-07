import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String str;
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.print("Введите дробное число: ");
            str = in.next();
            try {
                float a = Float.parseFloat(str);
                System.out.println("Вы ввели: " + a);
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            }
        }
    }
}