package mapandFlatmap;

import filterAndForeach.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MappingDemo {

    public static void main(String[] args) {

        List<Customer> list2 = new ArrayList<>();

        list2.add(new Customer(1,"a",150000));
        list2.add(new Customer(2,"b",100000));
        list2.add(new Customer(3,"c",78000));
        list2.add(new Customer(4,"d",50000));
        list2.add(new Customer(5,"e",47000));

        /*
        map() - use for data transformation
        one to one mapping - one customer has one name
        Data Transformation - convert List<Customer> to List<String>
         */


        List<String> names = list2
                .stream()
                .map(t -> t.getName())
                .collect(Collectors.toList());

        System.out.println(names);




    }
}
