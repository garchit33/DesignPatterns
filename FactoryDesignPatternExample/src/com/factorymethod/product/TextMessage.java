package com.factorymethod.product;

public class TextMessage extends Message {

	// Concrete implementation of Product Abstract class
	@Override
	public String getContent() {
		return "This is a Text Message";
	}
}
