import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {
    private static void m1() {
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-7));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(sumAll(numbers,n -> true));
        System.out.println(sumAll(numbers, n ->n % 2 == 0));
        System.out.println(sumAll(numbers, n ->n > 3));


    }
    private static int sumAll(List<Integer>numbers, Predicate<Integer>p){
        int total=0;
        for(int number:numbers){
            if(p.test(number)){
                total+=number;
            }
        }return total;
    }
}
