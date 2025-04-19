package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        PrimeCheck pc = new PrimeCheck();
//        System.out.println(pc.checkPrime());

        //For CustomComparator
        Employee e1 = new Employee(1,"Abhidip","30");
        Employee e2 = new Employee(2,"Abhilisha","29");
        Employee e3 = new Employee(3,"Abhinav","24");
        Employee e4 = new Employee(4,"Abhirup","39");
        Employee e5 = new Employee(5,"Abhidip","30");

        List<Employee> emps = new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        emps.add(e4);
        emps.add(e5);

        Collections.sort(emps,new CustomComparator());

        for (Employee emp : emps) {
            System.out.println("id:"+emp.getEmpId()+",name:"+emp.getEmpName()+",age:"+emp.getEmpAge());
        }

    }
}
