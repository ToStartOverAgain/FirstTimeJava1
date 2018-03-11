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
public class Employee {
    
    private String maNhanVien;
    private String ten;
    private int tuoi;
    private String diachi;

    public Employee(String maNhanVien, String ten, int tuoi, String diachi) {
        this.maNhanVien = maNhanVien;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }

    public Employee() {
    }        
    // ten, tuoi, dia chi, ma nhan vien.
    // Tạo contructor với các tham số truyền vào là ma nhan vien, tên, tuổi, địa chỉ.
    // Tại Class HelloWorld, tạo mới một nhân viên kèm các tham số truyền vào.
    // và in ra thông tin.

    @Override
    public String toString() {
        return "Mã nhân viên là " + maNhanVien + ", tên nó là " + ten + ", tuổi " + tuoi + ", địa chỉ " + diachi + ".";
    }
    

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
