package com;

import javax.xml.ws.Endpoint;

public class EndPublisher {


	
	 public static void main(String[] args) {
		 
	  Endpoint.publish("http://localhost:8080/com/PlaceMessage",new PlaceMessageBean());
	 }
	}
