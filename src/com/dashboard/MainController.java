package com.dashboard;

import com.mqtt.MQTTMonitor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Landing page is coming...";
    }

    @RequestMapping("/mqttstatus")
    @ResponseBody
    public String mqttStatus() {

        MQTTMonitor monitor = new MQTTMonitor();
        String status = "Dead";
        if (monitor.getStatus()){
            status = "Alive";
        }
        return "MQTT Server is " + status + "!!!";
    }

    public static void main(String[] args ) {

        System.out.println("Starting the app...");
        SpringApplication.run(MainController.class, args);
    }
}
