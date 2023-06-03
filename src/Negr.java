import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Negr {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        List<Integer> m = new ArrayList<>(Arrays.asList(1,5,7,0,11,17,3));
        boolean check = false;
        System.out.println("Введите любое число:");
        int b = a.nextInt();
        for (int i=0; i <= m.size()-1; i++)
        {
            if (m.get(i) == b) {
                check=true;
                System.out.println("Это число есть в массиве");
                break;
            }
        }
        if (check==false )
        {
            System.out.println("Этого числа нет в массиве");
        }

        System.out.println("lox");
    }
}


