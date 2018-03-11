/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 *
 * @author daolinh
 */
public class Student {
    
    private String rollNumber;
    String name;
    String phone;
    String email;
    int gender;
    
    public void setRollNumber(String rollNumber){
        this.rollNumber = rollNumber;
    }
    
    public String getRollNumber(){
        return this.rollNumber;
    }
    
    public void diHoc(){
        System.out.println("Tôi đi học và tôi đang ngồi chơi Game.");
    }
    
    public void diThi(){
        System.out.println("Tôi đi thi và các bạn đang làm bài cho tôi.");
    }
    
    public void diLenThuVien(){
        System.out.println("Chi để ngắm gái thôi.");
    }
    
}
