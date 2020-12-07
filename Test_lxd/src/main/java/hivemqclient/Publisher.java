package hivemqclient;

import java.util.UUID;

import com.hivemq.client.mqtt.MqttClient;
import com.hivemq.client.mqtt.datatypes.MqttQos;
import com.hivemq.client.mqtt.mqtt3.Mqtt3BlockingClient;
import com.hivemq.client.mqtt.mqtt3.Mqtt3Client;
import com.hivemq.client.mqtt.mqtt5.Mqtt5BlockingClient;
import com.hivemq.client.mqtt.mqtt5.Mqtt5Client;

public class Publisher {
	public static void main(String[] args) throws InterruptedException {
//		Mqtt5BlockingClient client = Mqtt5Client.builder()
//		        .identifier(UUID.randomUUID().toString())
//		        .serverHost("127.0.0.1")
//		        .buildBlocking();
		Mqtt3BlockingClient client = MqttClient.builder().identifier(UUID.randomUUID().toString())
				.serverHost("127.0.0.1").useMqttVersion3().build().toBlocking();

		client.connect();
//		client.publishWith().topic("test/topic").qos(MqttQos.AT_LEAST_ONCE).payload("lym".getBytes()).send();
		int count = 0;
		while (count < 1000) {
			client.publishWith().topic("inTopic").qos(MqttQos.AT_LEAST_ONCE).payload(("lym"+count).getBytes()).send();
			count++;
			Thread.sleep(1000);
		}
		client.disconnect();
	}
}
