/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import java.util.Scanner;

/**
 *
 * @author daolinh
 */
public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên nhân viên: ");
        String ten = scanner.nextLine();
        System.out.println("Vui lòng nhập mã nhân viên: ");
        String maNhanVien = scanner.nextLine();
        System.out.println("Vui lòng nhập tuổi nhân viên: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Vui lòng nhập địa chỉ nhân viên: ");
        String diachi = scanner.nextLine();

        Employee nhanvien1 = new Employee(maNhanVien, ten, tuoi, diachi);

        System.out.println(nhanvien1.toString());
    }
}
