package com.factorymethod.creator;

import com.factorymethod.product.Message;
import com.factorymethod.product.TextMessage;

public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
