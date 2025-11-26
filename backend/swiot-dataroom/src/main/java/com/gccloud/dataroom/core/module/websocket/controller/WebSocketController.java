package com.gccloud.dataroom.core.module.websocket.controller;

import com.gccloud.dataroom.core.module.websocket.service.DashboardPushService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dataroom/ws")
@Api(tags = "WebSocket测试")
public class WebSocketController {

    @Autowired
    private DashboardPushService dashboardPushService;

    @PostMapping("/push")
    @ApiOperation("推送测试数据")
    public String push(@RequestBody Object data) {
        dashboardPushService.pushRealTimeData(data);
        return "success";
    }
}
