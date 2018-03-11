/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

/**
 *
 * @author daolinh
 * 
 */
public class Student {
    
    private String rollNumber;
    private String name;
    private int gender;
    private String email;
    private String phone;
    private long birthday;
    private long createdAt;
    private long updatedAt;
    private int status;

    public Student() {
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
        this.status = 1;
    }

    public Student(String rollNumber, String name, String phone, long birthday) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
        this.status = 1;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        /**
         * if(gender == 1){
         *     return "trống";
         * }else{
         *      if(gender == 0){
         *              return "mái";
         *      }else{
         *              return "thái";
         *      }
         * }
         * 
         * (gender==1 ? "trống" : (gender == 0 ? "mái" : "bên thái"))
         */
        return "Sinh viên với mã số " + rollNumber + ", tên là " + name + ", giới tính " + (gender==1 ? "trống" : (gender == 0 ? "mái" : "bên thái")) + ", email=" + email + ", phone=" + phone + ", birthday=" + birthday + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", status=" + status + '}';
    }

    
}
