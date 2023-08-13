package com.gamewolf.gameinfo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.gamewolf.gameinfo.model.SocketInputMsg;
import com.gamewolf.gameinfo.model.SocketMessage;

@Controller //很重要，未确定
public class WebSocketController {
	
	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public SocketMessage send(SocketInputMsg message) throws Exception {
	    String time = new SimpleDateFormat("HH:mm").format(new Date());
	    SocketMessage sm=new SocketMessage();
	    sm.setFrom(message.getFrom());
	    sm.setText(message.getText());
	    sm.setTime(time);
	    return sm;
	}

}
