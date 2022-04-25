package sorting;

import java.util.Arrays;
import java.util.List;

public class SortDemo {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        System.out.println("");


        list1.stream().sorted().forEach(t -> System.out.println(t) );

    }
}
