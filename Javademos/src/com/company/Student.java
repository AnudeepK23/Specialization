package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> stu = new ArrayList<String>();
        ArrayList<Integer> marks = new ArrayList<Integer>();

        System.out.println("Enter the student1 name :");
        String n1 = sc.next();
        stu.add(n1);

        System.out.println("Enter the student1 age :");
        int s1 = sc.nextInt();
        list.add(s1);

        System.out.println("Enter the student1 marks :");
        int m1 = sc.nextInt();
        marks.add(m1);

        System.out.println("Enter the student2 name :");
        String n2 = sc.next();
        stu.add(n2);

        System.out.println("Enter the student2 age :");
        int s2 = sc.nextInt();
        list.add(s2);

        System.out.println("Enter the student2 marks :");
        int m2 = sc.nextInt();
        marks.add(m2);

        System.out.println("Enter the student3 name :");
        String n3 = sc.next();
        stu.add(n3);

        System.out.println("Enter the student3 age :");
        int s3 = sc.nextInt();
        list.add(s3);

        System.out.println("Enter the student3 marks :");
        int m3 = sc.nextInt();
        marks.add(m3);

        System.out.println("Enter the student4 name :");
        String n4 = sc.next();
        stu.add(n4);

        System.out.println("Enter the student4 age :");
        int s4 = sc.nextInt();
        list.add(s4);

        System.out.println("Enter the student4 marks :");
        int m4 = sc.nextInt();
        marks.add(m4);

//        System.out.println("Enter the student3 age :");
//        int s3 = sc.nextInt();
//        list.add(s3);
//        System.out.println("Enter the student4 age :");
//        int s4 = sc.nextInt();
//        list.add(s4);

        System.out.println("Before Sorting  : ");
        System.out.println(stu+ " , " +list+ " ," +marks);
       // System.out.println(stu+list+marks);

        Collections.sort(list);

        System.out.println("After Sorting  : ");
        System.out.println(stu+ " , " +list+ " ," +marks);

    }
}


//import java.util.Collections;
//
//public class Sorting {
//
//    private void sortStudentInArrayList() {
//        List<Student> students = new ArrayList<>();
//
//        Student student1 = createStudent("Biplab", 3);
//        students.add(student1);
//
//        Student student2 = createStudent("John", 1);
//        students.add(student2);
//
//        Student student3 =  createStudent("Pal", 5);
//        students.add(student3);
//
//        Student student4 = createStudent("Biplab", 2);
//        students.add(student4);
//
//
//        System.out.println("Original students list: " + students);
//
//        Collections.sort(integers, new NameComparator());
//        System.out.println("Sorted students list: " + students);
//    }
//}
//
//
//
//
//
//public class Student {
//    String name;
//    int no;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getNo() {
//        return no;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setNo(int no) {
//        this.no = no;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", no=" + no +
//                '}';
//    }
//}
//
//class NameComparator implements Comparator<Student> {
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}