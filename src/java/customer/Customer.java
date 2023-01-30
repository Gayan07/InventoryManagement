/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author gayan
 */
public class Customer {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String userName;
    private String password;
    
    //Default Constructor
    public Customer(int id,String name,String email, String phone,String userName,String password){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.userName=userName;
        this.password=password;
    }

    Customer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
}
