package org.example.FuntionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

//    @Override
    //  implements Supplier<String>
//    public String get() {
//        return "Hi welcome to Lambda Expression";
//    }

    public static void main(String[] args) {
//        Supplier<String> supplier=new SupplierDemo();
//        System.out.println(supplier.get());

//            Supplier<String> supplier = () -> "Hi welcome to Lambda Expression";
//        System.out.println(supplier.get());

        //Stream
        List<String> list= Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(() -> "Hi welcome to Lambda Expression"));


    }
}
