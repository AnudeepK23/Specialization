//package com.day6;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.*;
////import java.util.stream.Stream;
//
////import static jdk.internal.org.jline.utils.Colors.s;
// public class Filter extends Emp {
//
//    public static void main(String[] args) {
//        //@Test
//        List<Employee> filteredList = new ArrayList<>();
//        List<Employee> originalList = buildEmployeeList();
//        List<String> nameFilter = employeeNameFilter();
//
//        for (
//                Employee employee : originalList) {
//            for (String name : nameFilter) {
//                if (employee.getClass().equals(name)) {
//                    filteredList.add(employee);
//                }
//            }
//        }
//
//        assertThat(filteredList.size(), is(nameFilter.size()));
//    }
//}
//
//   // public static void main(String[] args) {
////        char bus;
////        List<String> nameList = Arrays.asList("Clerk", "Manager", "Programmer");
////        List<String> filteredNameList = nameList.stream()
////                .filter(name -> name.startsWith("C"))
////                .collect(Collectors.toList());
////        for(String name : filteredNameList){
////            System.out.println(name);
////        }
////
////        Stream name = Stream.of("Clerk", "Manager", "Programmer");
////        name.filter(bus -> bus.contains("Clerk")).forEach(System.out::println);
