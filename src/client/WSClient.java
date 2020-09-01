package client;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.PlaceMessageBean;
import com.PlaceMessageWS;
import com.UserDTO;

public class WSClient {

	public static void main(String[] args) throws MalformedURLException {
		
		URL wsdlURL = new URL("http://localhost:8080/PlaceMessageBeanService/PlaceMessageBean?wsdl");
		//check above URL in browser, you should see WSDL file
		
		//creating QName using targetNamespace and name
		QName qname = new QName("http://com/", "PlaceMessageBeanService"); 
		
		Service service = Service.create(wsdlURL, qname);  
		
		//We need to pass interface and model beans to client
		PlaceMessageWS ps = service.getPort(PlaceMessageWS.class);
		
		UserDTO p1 = new UserDTO(); p1.setName("Joana"); p1.setID(1); p1.setSalary(30); p1.setSurname("Surname");
		UserDTO p2 = new UserDTO(); p2.setName("Igor"); p2.setID(2); p2.setSalary(25);
		
		//add person
		ps.createUser(p1);
		ps.createUser(p2);
		
		//get person
		System.out.println(ps.getUser(1));
		
		//get all persons
	//	System.out.println(Arrays.asList(ps.getAllPersons()));
		
		//delete person
	//	System.out.println("Delete Person Status="+ps.deletePerson(2));
		
		//get all persons
	//	System.out.println(Arrays.asList(ps.getAllPersons()));
		
	}

}
