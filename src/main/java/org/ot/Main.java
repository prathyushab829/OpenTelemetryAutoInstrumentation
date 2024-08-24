package org.ot;

import org.ot.Bean.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            List<Employee> e = new ArrayList<>();
            Optional<Employee> e1 = Optional.of(new Employee("1","2"));
            System.out.println(Optional.ofNullable(e1.get().getName()));
            SpringApplication.run(Main.class, args);
        }

}