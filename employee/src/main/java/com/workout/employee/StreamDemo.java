package com.workout.employee;

import com.workout.employee.entity.Product;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class StreamDemo {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"TV",60000f));
        productList.add(new Product(2,"Laptop",55000f));
        productList.add(new Product(3,"Mobile",80000f));
        productList.add(new Product(4,"Tab",7000f));

        List<String> productListPrice = productList.stream().filter(product -> product.id < 4)
//                .collect(Collectors.toList())
                .map(product -> product.name).toList();
        System.out.println("Product list" + productListPrice);



        List<Integer> value = new ArrayList<Integer>();
        value.add(40);
        value.add(15);
        value.add(69);
        value.add(5);
        value.add(90);

        List<Integer> newValue = value.stream().filter(v ->v>
                50).collect(Collectors.toList());

        System.out.println(newValue);
    }
}
