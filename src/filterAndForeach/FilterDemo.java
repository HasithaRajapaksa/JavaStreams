package filterAndForeach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

    /*
    Filter - condition check
    forEach - for iteration
     */
    public static List<Customer> evaluateTaxEligibility(){

        List<Customer> list2 = new ArrayList<>();

        list2.add(new Customer(1,"a",150000));
        list2.add(new Customer(2,"b",100000));
        list2.add(new Customer(3,"c",78000));
        list2.add(new Customer(4,"d",50000));
        list2.add(new Customer(5,"e",47000));

        return list2
                .stream()
                .filter(cus -> cus.getSalary() > 60000)
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {

        System.out.println("");

        // foreach - void
        // filter - boolean

        List<String> list1 = Arrays.asList("idd","ibb","c","d","e");

        list1
                .stream()
                .filter(t -> t.startsWith("i"))
                .forEach(t -> System.out.println("item "+t));

        /*
        real world example
         */


        List<Customer> list3 = evaluateTaxEligibility();
       list3.stream().forEach(t-> System.out.println("item "+t.getName()+ t.getSalary()));








    }
}
