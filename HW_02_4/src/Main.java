import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.print("Введите: ");
        str = in.nextLine();
        if(str.isEmpty())
            throw new NullPointerException("Нельзя вводить пустую строку");
        else
            System.out.println("Вы ввели: " + str);
    }
}