package com.parking.collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremiah
 */
import java.util.ArrayList;

public class DatabaseCollection {
	ArrayList<Users> db;
	ArrayList<LotInfo> lt;

	public DatabaseCollection(){
		db = new ArrayList<Users>();
	}
	
	boolean addUsers(Users d){
		return db.add(d);
	}
	
	void addAll(Users [] d){
		for(Users a : d){
			db.add(a);
		}
	}
	
	boolean deleteUsers(Users d){
		return db.remove(d);
	}

	boolean searchUsers(Users d){
		return db.contains(d);
	}
	
	
	boolean addLot(LotInfo l){
		return lt.add(l);
	}
	
	void addLots(LotInfo [] d){
		for(LotInfo a : d){
			lt.add(a);
		}
	}
	
	boolean deleteLot(LotInfo d){
		return lt.remove(d);
	}

	boolean searchLot(LotInfo d){
		return lt.contains(d);
	}
	
	
}
