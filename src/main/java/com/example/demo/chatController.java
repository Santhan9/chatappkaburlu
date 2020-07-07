package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class chatController {




   
    @PostMapping(value="/sendMessage",consumes = "application/json", produces = "application/json")
    public void sendmessage(@RequestBody Message mes ){
        System.out.println(mes.getMess());



    }
}
