import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionalInterface6 {
    
    public static Integer stringToNumberNotOptional (String string){
        Integer result;
        try{
            result=Integer.valueOf(string);
        }catch (NumberFormatException e){
            result=null;
        }return result;

    }

  
    public static Optional<Integer>strToNumber(String str){
        Optional<Integer>result;
        try{
            result=Optional.ofNullable(Integer.valueOf(str));
        }catch (NumberFormatException e){
            result =Optional.empty();
           }
           return  result;
        }
                
        private static void Optional(){
    
            List<String> strings= Arrays.asList("9",null,"two","2");
            List<Integer> numbers = strings.stream()
//                    .map(string->stringToNumberNotOptional(string))
//                    .filter(num->num!=null)
//                    .map(number->number*100)
//                    .collect(Collectors.toList());
                     .map(string -> strToNumber(string))
                     .filter(optional->optional.isPresent())
                     .map(optional->optional.get())
                     .map(number->number*100)
                     .collect(Collectors.toList());

        }

    public static void main(String[] args) {
        Optional();
        }



}

