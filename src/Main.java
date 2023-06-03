
import java.util.Arrays;

import static java.util.Collections.reverseOrder;

public class Main {
    public static void main(String[] args)
    {
        Integer[] a = new Integer[]{6541, 5, 1, 6,6541,643};
        Arrays.sort (a,reverseOrder());
        for (int values : a)
        {
            System.out.print(values + ", ");
        }
    }
}