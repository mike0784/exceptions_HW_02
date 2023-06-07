import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        double[] intArray = new double[10];
        for(int i = 0; i < intArray.length; i++)
            intArray[i] = r.nextDouble();

        try {
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

        /*try {
            int d = 0;  //Исправить d. Заменить на любое число не равное 0
            double catchedRes1 = intArray[8] / d;   //Сделать проверку на наличие индекса в массиве
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }*/
    }
}