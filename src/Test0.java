import java.util.Scanner;
public class Test0 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Введите второе число");
        int b = s.nextInt();
        if (a>b)
        {
            System.out.print("Число " + a + " больше, чем число "+b);
        }
        else if (a == b)
        {
            System.out.print("Число " + a + " равно числу " + b);
        }
        else
        {
            System.out.print("Число "+a+" меньше, чем число "+b);
        }
    }
}