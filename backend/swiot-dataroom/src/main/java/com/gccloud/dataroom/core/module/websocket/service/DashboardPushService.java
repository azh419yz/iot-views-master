package com.gccloud.dataroom.core.module.websocket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class DashboardPushService {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void pushRealTimeData(Object data) {
        messagingTemplate.convertAndSend("/topic/data", data);
    }
}
