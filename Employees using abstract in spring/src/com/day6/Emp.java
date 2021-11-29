package com.day6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] e = new Employee[10];
        int choice = 0, c2 = 0, i = 0;
        do {
            System.out.println("\n 1.Create");
            System.out.println(" 2.Display");
            System.out.println(" 3.RaiseSalary");
            System.out.println("4.Exit");
            System.out.println("Enter your Choice ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("\n 1.Clerk");
                        System.out.println("2.Programmer");
                        System.out.println("3.Manager");
                        System.out.println("4.Exit");
                        System.out.println("Enter Your Choice ");
                        c2 = sc.nextInt();
                        switch (c2) {
                            case 1:
                                e[i] = new Clerk();
                                i++;
                                break;
                            case 2:
                                e[i] = new Programmer();
                                i++;
                                break;
                            case 3:
                                e[i] = new Manager();
                                i++;
                                break;
                        }
                    } while (c2 != 4);
                    break;
                case 2:
                    try {
                        for (Employee x : e) {
                            if (x != null)
                                x.disp();
                        }
                    } catch (Exception ex) {
                        System.out.println("\n No Records were present .........!");
                    }

                    break;
                case 3:
                    try {
                        for (Employee x : e) {
                            if (x != null)
                                x.raise();
                        }
                        System.out.println("\n Salary Raised ........");
                    } catch (Exception ex) {
                        System.out.println("\n No Records Were Present......!");
                    }
                    break;
                case 4:
                    System.out.println("\n Exiting ......");
                    break;
                default:
                    System.out.println("\n Invalid Choice .......!!");
            }
        } while (choice != 4);


//        Scanner a = new Scanner(System.in);
//        String names = a.next();
//        List<String> nameList = Arrays.asList(names);
//        List<String> filteredNameList = nameList.stream()
//                .filter(name -> name.startsWith("C"))
//                .collect(Collectors.toList());
//        Stream name = Stream.of("Clerk", "Manager", "Programmer");
//        //name.filter(name == "Clerk");
//        name.filter(s -> s.contains("C")).map(String::toLowerCase).sorted().forEach(System.out::println);
    }
}
