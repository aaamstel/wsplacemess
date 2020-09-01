package com;


import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;
import javax.jws.WebService;



@Stateless
@WebService(endpointInterface = "com.PlaceMessageWS")
	public class PlaceMessageBean implements PlaceMessageWS {
	
	/*
	 * 
	 * (name="CreateUserPlace", 
serviceName="PlaceMessage", 
targetNamespace="http://localhost:8080/user", 
portName = "UserPortMessage",
wsdlLocation= "META-INF/PlaceMessage.wsdl")
	
	*/
	
	static Map<Integer, UserDTO> storage = new HashMap<Integer,UserDTO>();
	
	

	public void createUser(UserDTO user){
	  storage.put(user.getID() ,user);
}
	
	 public UserDTO getUser(int id) {		 
		 return storage.get(id);
 }
	 
		public void createUser2(int id, String name, String surname){
			
			UserDTO uss = new UserDTO();
			uss.setID(id);
			uss.setName(name);
			uss.setSurname(surname);
			  storage.put(uss.getID() ,uss);
			//return storage.get(id);
		}
	 
	 

	@Override
	public String sendMessage(String msg) {
		return msg;
	}
	
}