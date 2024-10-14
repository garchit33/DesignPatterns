package com.factorymethod.client;

import com.factorymethod.creator.JSONMessageCreator;
import com.factorymethod.creator.MessageCreator;
import com.factorymethod.creator.TextMessageCreator;
import com.factorymethod.product.Message;

public class Client {

	public static void main(String[] args) {
		// Aproach - 1 to print Message from Concrete Product class
		printMessage(new TextMessageCreator());
		printMessage(new JSONMessageCreator());
		
		// Aproach - 2 to print Message from Concrete Product class
		MessageCreator textMessageCreator = new TextMessageCreator();
		Message textMessage = textMessageCreator.getMessage();
		System.out.println(textMessage.getContent());
		
		MessageCreator jsonMessageCreator = new JSONMessageCreator();
		Message jsonMessage = jsonMessageCreator.getMessage();
		System.out.println(jsonMessage.getContent());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message msgCreator = creator.getMessage();
		String msg = msgCreator.getContent();
		System.out.println(msg);
	}
}
