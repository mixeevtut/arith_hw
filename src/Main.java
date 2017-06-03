import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Находим x в уравнении \'ax - b = 0\'");
        System.out.print("Введите a: "); // как обработать исключение, когда вводят текст вместо числа, увы, не знаю
        Scanner in1 = new Scanner(System.in);
        double a = in1.nextDouble();
        System.out.print("Введите b: ");
        double b = in1.nextDouble();
        double x = b/a;
        System.out.println("X = " + x);
    }
}
