package com.irfan.mubasyir.agents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/agent")
public class AIAgentChatController {

    private MyAssistant assistant;

    @Autowired // Auto-wires the MyAssistant bean
    public AIAgentChatController(MyAssistant assistant) {
        this.assistant = assistant;
    }


    @PostMapping("/chat")
    public ResponseEntity<String> chatBot(@RequestBody String userMessage){

        String response=assistant.chat("api-user",userMessage);
        return ResponseEntity.ok(response);
    }



}
