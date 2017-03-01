/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parking.user;

/**
 *
 * @author Jeremiah
 *

* 
  
  
  * /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
        // TODO code application logic here
  //  }
    
public class Users {
	String name;
	String id;
	String sex;
	int age;
	


	public Users(){
		this("","","",0);
	}
	
	public Users(String n , String id , String s , int a){
		name = n;
		id = id;
		sex = s;
		age = a;
	}
	
	void setName(String n){
		name = n;
	}
	
	void setAge(int a){
		age = a;
	}
	void setId(String n){
		id = n;
	}


	void setSex(String s){
		sex = s;
	}	
	
	String getName(){
		return name;
	}
	
	String getId(){
		return id;
	}
	
	int getAge(){
		return age;
	}
	
	String getSex(){
		return sex;
	}
}

