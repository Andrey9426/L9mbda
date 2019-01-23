import java.util.function.UnaryOperator;

public class FunctionalInterface2 {
    private static void m3(){
        UnaryOperator<Integer>square = x->x*x;
        System.out.println(square.apply(5));

        UnaryOperator<StringBuilder> op = sb->reverseAndToUppercase(sb);
        System.out.println(op.apply(new StringBuilder("Java 8 ")));
    }
    private static StringBuilder reverseAndToUppercase(StringBuilder sb){
        return new StringBuilder(sb.insert(0,"it.courses.by"));
//        new StringBuilder(sb.append("it.courses.by"));


    }
}
