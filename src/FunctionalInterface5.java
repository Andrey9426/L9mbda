import java.util.*;

public class FunctionalInterface5 {
    private static void sorting(){
        List<String >names= Arrays.asList("peter","anna","mike","olga");

        Collections.sort(names,new Comparator<String>(){
            @Override
                    public int compare(String a,String b){
                return b.compareTo(a);
            }

        });
        Collections.sort(names,(String a,String b)->b.compareTo(a));
        Collections.sort(names,(a,b)->b.compareTo(a));
        Collections.sort(names,Comparator.reverseOrder());
        names.sort(Comparator.reverseOrder());

    }
}
