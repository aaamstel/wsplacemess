package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserStoreBean {

	UserStoreBean(){}

    static Map<Integer, UserDTO> storage = new HashMap<Integer,UserDTO>();

	public static void add(UserDTO user){
		storage.put(user.getID(),user);
		}
		
	public static UserDTO getUser(int id) {
		return storage.get(id);
	}


	public static Map<Integer,UserDTO> getUsers(){
		return new HashMap<Integer,UserDTO>(storage);
}


}
