import java.util.function.BinaryOperator;

public class FunctionalInterface1 {
    private static void m2(){
        BinaryOperator<Integer>multiply = (x,y)-> x*y;
        System.out.println(multiply.apply(3,5));
        System.out.println(multiply.apply(10,-2));

        BinaryOperator<StringBuilder> op= (sb1,sb2)->sb1.append(sb2);
        System.out.println(op.apply(new StringBuilder("functional Interfaces"),new StringBuilder("in java 8")));

    }
}
