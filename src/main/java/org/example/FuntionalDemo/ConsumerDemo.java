package org.example.FuntionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
//    @Override  implements Consumer<Integer>
//    public void accept(Integer integer) {
//        System.out.println("Printing: "+integer);
//    }

    public static void main(String[] args) {
//       Consumer<Integer> consumer=t -> System.out.println("Printing: "+t);


        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.stream().forEach(t -> System.out.println("Print: "+t));


    }


}
