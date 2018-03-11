/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.Scanner;

/**
 *
 * @author daolinh
 */
public class MainThread {
    
    public static void main(String[] args) {
        MainThread mt = new MainThread();
        mt.getStudentInfor();
    }
    
    public void getStudentInfor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student name:");
        String name = scanner.nextLine();
        System.out.println("Please enter student roll number:");
        String rollNumber = scanner.nextLine();
        System.out.println("Please enter student phone:");
        String phone = scanner.nextLine();
        
        Student student1 = new Student(rollNumber, name, phone, 0);
        System.out.println(student1.toString());
    }
}
