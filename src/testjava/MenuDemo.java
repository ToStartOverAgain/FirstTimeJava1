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
public class MenuDemo {
    
    public static void main(String[] args) {
        while(true){
            MenuDemo menu = new MenuDemo();
            Scanner scanner = new Scanner(System.in);
            int choice = 0;

            System.out.println("===============Student Manager==============");
            System.out.println("1. Student list.");
            System.out.println("2. Add student.");
            System.out.println("3. Edit student.");
            System.out.println("4. Delete student.");
            System.out.println("5. Exit.");
            System.out.println("Please enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1: 
                    menu.printStudentList();
                    break;
                case 2: 
                    menu.addStudent();
                    break;
                case 3: 
                    menu.editStudent();
                    break;
                case 4: 
                    menu.deleteStudent();
                    break;
                case 5: 
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter choice from 1 to 5.");
                    break;
            }

            System.out.println("============================================");
        }
        
    }
    
    public void printStudentList(){
        System.out.println("Display student list.");
    }
    
    public void addStudent(){
        System.out.println("Add new student.");
    }
    
    public void editStudent(){
        System.out.println("Edit student.");
    }
    
    public void deleteStudent(){
        System.out.println("Delete student.");
    }
    
}
