import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterface3 {
    private static void m4(){
        Function<Integer,String>contert = x-> String.valueOf(x)+"roubles";
        Function<String,Integer> stringToNumber= x->Integer.valueOf(x)*100;
        System.out.println(contert.apply(5));
        System.out.println(stringToNumber.apply("100"));


        Consumer<Integer>printer =x-> System.out.printf("%d roubles \n",x);
        printer.accept(600);


    }
}
