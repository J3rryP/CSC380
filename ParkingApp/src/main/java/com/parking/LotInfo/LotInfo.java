/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parking.LotInfo;

/**
 *
 * @author Jeremiah
 */
    
    public class LotInfo {

	String description;
	boolean isOccupied;
	String location;
	boolean handicupped;
	
	public LotInfo(){
		update("","",false,false);
	}
	
	public LotInfo(String d, String l, boolean i , boolean h){
		description = d;
		location = l;
		isOccupied = i;
		handicupped = h;
	}
	
	
	boolean taken(){
		return isOccupied;
	}

	void update(String des , String loc, boolean iso , boolean ish){
		description = des;
		location = loc;
		isOccupied = iso;
		handicupped = ish;
	}
	
	void status(){
		System.out.println("Lot info ");
		System.out.println("Location : "+ location);
		System.out.println("Description : "+ description);
		System.out.println("Occupied : "+isOccupied);
		System.out.println("Handicupped : "+handicupped);
	}

}

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
    //}
    
