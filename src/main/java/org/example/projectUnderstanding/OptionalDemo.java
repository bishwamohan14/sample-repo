package org.example.projectUnderstanding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static Customer getCustomerById(String email) {
        List<Customer> customers = EKartDataBase.getAll();
       return customers.stream()
               .filter(customer -> customer.getEmail().equalsIgnoreCase(email))
               .findAny().get();
    }

    public static void main(String[] args){
        Customer customer=new Customer(101,"john","test@gmail.com", Arrays.asList("5465465","65648464"));

        // 3 Way to create optional object
        //Empty method
        //of method
        //ofNullable  use both empty and of
//        Optional<Object> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);
//
//        Optional<String> emailOptional = Optional.of(customer.getEmail());
//        System.out.println(emptyOptional);

        Optional<String> emailOptional1 = Optional.ofNullable(customer.getEmail());
        System.out.println(emailOptional1.orElse("default@gmail.com"));
//        System.out.println(emailOptional1.orElseThrow(()-> new IllegalArgumentException("Email not found")));
//        System.out.println(emailOptional1.map(String::toUpperCase).orElseGet(() -> "default email..."));

//        getCustomerById("pqr");
    }
}
