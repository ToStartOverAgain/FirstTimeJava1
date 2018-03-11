/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 * @author daolinh
 */
public class Customer {
    
    private String customerId;
    private String name;
    private long birthday;
    private String phone;
    
    // Contructor, hàm đặc biệt, tên giống với tên class, không có dữ liệu trả về.
    // Dùng để tạo ra một đối tượng cụ thể của class đó.
    // Mặc định, một class khi được tạo ra luôn có contructor.
    public Customer(){
    
    }
    
    public Customer(String customerId, String name, String phone, long birthday){
        this.phone = phone;
        this.customerId = customerId;
        this.name = name;
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }          
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }
    
    public String getCustomerId(){
        return this.customerId;
    }
    
    public long getBirthday(){
        return this.birthday;
    }
    
    public void setBirthday(long birthday){
        this.birthday = birthday;
    }
    
    public void shopping(){
        System.out.println("Tôi đang đi shopping.");
    }
    
    public void buy(String productName){
        System.out.println(this.name + " đã mua " + productName);        
    }
       
    
}


