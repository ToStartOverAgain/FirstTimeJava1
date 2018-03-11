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
public class LoopDemo {
    
    public static void main(String[] args) {                
        int count = 0;
        
        while (count < 10) {                        
            System.out.println(count);
            count++;
        }        
        System.out.println("==================");
        
        int count1 = 0;
        
        do {
            count1++;
            System.out.println(count1);            
        } while (count1 < 10);
        
    }
    
}
