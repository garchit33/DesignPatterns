package com.factorymethod.creator;

import com.factorymethod.product.JSONMMessage;
import com.factorymethod.product.Message;

public class JSONMessageCreator extends MessageCreator {

	// Implementation of factory method from creator and instantiate the Product Concrete class
	@Override
	public Message createMessage() {
		return new JSONMMessage();
	}
}
