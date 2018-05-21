package com.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class MQTTMonitor {

    public boolean getStatus(){
        try {
            MqttClient client = new MqttClient("tcp://localhost:1883", MqttClient.generateClientId());
            client.connect();
            client.disconnect();
        } catch (MqttException e) {
            return false;
        }
        return  true;
    }
}
