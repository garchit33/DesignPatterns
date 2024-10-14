package com.factorymethod.product;

public class JSONMMessage extends Message {

	// Concrete implementation of Product Abstract class
	@Override
	public String getContent() {
		return "This is JSON Message";
	}
}
