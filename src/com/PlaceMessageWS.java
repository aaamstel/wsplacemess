package com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService

/*(name="CreateUserPlace", 
serviceName="PlaceMessage", 
targetNamespace="http://com.actionbazaar/user", 
portName = "UserPortMessage",
wsdlLocation= "PlaceMessage.wsdl")
*/
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT)
	public interface PlaceMessageWS {
		
	
public String sendMessage(String msg);
public UserDTO getUser(int id);

public void createUser2(int id, String name, String surname);

//public UserDTO getUser(int id);

@WebMethod(operationName="createUser")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public void createUser(@WebParam(name="user", mode= WebParam.Mode.IN,
targetNamespace="http://ws.test.com/") UserDTO user);


		
}