package com.day4;

import java.util.*;

public class StudentMenu {
    static Scanner sc = new Scanner(System.in);
    static List<Student> stulist = new ArrayList<Student>();

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("Menu");
            System.out.println("1.Create");
            System.out.println("2.Search");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.DisplayData");
            System.out.println("Exit(press -1)");

            System.out.println("Please chose your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    createStudentData();
                    break;
                case 2:
                    int id;
                    System.out.println("Enter the id you want to search");
                    id = sc.nextInt();
                    searchStudent(id);
                    break;
                case 3:
                    updateStudentData();
                    break;
                case 4:
                    System.out.println("Enter the id you want to delete");
                    id = sc.nextInt();
                    deleteStudentData(id);
                    break;
                case 5:
                    System.out.println(stulist);
                    break;
                default:
                    System.out.println("Enter correct option");
            }
        } while (choice != -1);
        System.out.println("Program ends");

    }


    private static void createStudentData() {
        System.out.println("enter Student Name");
        String name = sc.next();

        System.out.println("enter Student ID");
        int id = sc.nextInt();

        System.out.println("enter Student Dept");
        String dept = sc.next();

        System.out.println("enter Student college");
        String college = sc.next();

        Student newStu = new Student(name, id, dept, college);

        stulist.add(newStu);

    }

    private static void searchStudent(int id) {
        for (int index = 0; index < stulist.size(); index++) {
            Student stud = stulist.get(index);
            if (stud.getStuId() == id)
                System.out.println(stud);

        }
    }
        private static void deleteStudentData ( int id){
            for (int i = 0; i < stulist.size(); i++) {
                Student stud = stulist.get(i);
                if (stud.getStuId() == id){
                    stulist.remove(stud);
                }
                System.out.println("Student removed...");
            }


        }
        private static void updateStudentData () {
            int id;
            String name;
            String dept;
            String college;
            System.out.println("Enter the id you want to update");
            id = sc.nextInt();
            System.out.println("Enter the name");
            name = sc.next();
            System.out.println("Enter department");
            dept = sc.next();
            System.out.println("Enter college name");
            college = sc.next();
            for (int i = 0; i < stulist.size(); i++) {
                Student s = stulist.get(i);
                if (s.getStuId() == id) {
                    s.setStuName(name);
                    s.setDept(dept);
                    s.setCollege(college);
                }


            }


        }

}
