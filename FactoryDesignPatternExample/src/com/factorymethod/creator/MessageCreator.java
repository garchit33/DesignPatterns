package com.factorymethod.creator;

import com.factorymethod.product.Message;

public abstract class MessageCreator {

	// Declare the factory method and returns the Instance of Product Abstract class/interface
	public abstract Message createMessage();
	
	public Message getMessage() {
		Message msg = createMessage();
		msg.setDefaultHeaders();
		msg.encryptMessage();
		return msg;
	}
}
