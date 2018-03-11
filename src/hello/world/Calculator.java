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
public class Calculator {
        
    public Calculator(){
        
    }
    
    public int congHaiSo(int a, int b){
        return a + b;
    }
    
    public int truHaiSo(int a, int b){
        return a - b;
    }
    
    public int nhanHaiSo(int a, int b){
        return a * b;
    }
    
    public float chiaHaiSo(int a, int b){
        if(b == 0){
            System.err.println("Không thể chia cho 0.");
            return 0;
        }
        return (float) a / b;
    }
    
}
