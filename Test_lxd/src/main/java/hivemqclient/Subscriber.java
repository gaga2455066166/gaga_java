package hivemqclient;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import com.hivemq.client.mqtt.mqtt5.Mqtt5BlockingClient;
import com.hivemq.client.mqtt.mqtt5.Mqtt5BlockingClient.Mqtt5Publishes;
import com.hivemq.client.mqtt.mqtt5.Mqtt5Client;
import com.hivemq.client.mqtt.MqttClient;
import com.hivemq.client.mqtt.MqttGlobalPublishFilter;
import com.hivemq.client.mqtt.datatypes.MqttQos;
import com.hivemq.client.mqtt.mqtt3.Mqtt3BlockingClient;
import com.hivemq.client.mqtt.mqtt3.Mqtt3BlockingClient.Mqtt3Publishes;
public class Subscriber {
	public static void main(String[] args) throws InterruptedException {
//		Mqtt5Client client = MqttClient.builder()
//		        .identifier(UUID.randomUUID().toString())
//		        .serverHost("127.0.0.1")
//		        .useMqttVersion5()
//		        .build();
//		final Mqtt5BlockingClient client = Mqtt5Client.builder()
//		        .identifier(UUID.randomUUID().toString())
//		        .serverHost("127.0.0.1")
//		        .buildBlocking();
		Mqtt3BlockingClient client = MqttClient.builder().identifier(UUID.randomUUID().toString())
				.serverHost("127.0.0.1").useMqttVersion3().build().toBlocking();


		client.connect();

		try (final Mqtt3Publishes publishes = client.publishes(MqttGlobalPublishFilter.ALL)) {
			while(true) {
//				client.subscribeWith().topicFilter("test/topic").qos(MqttQos.AT_LEAST_ONCE).send();
				client.subscribeWith().topicFilter("outTopic").qos(MqttQos.AT_MOST_ONCE).send();
				
				publishes.receive(5, TimeUnit.SECONDS).ifPresent((x)-> {
					System.out.println(new String(x.getPayloadAsBytes()));
				});
				publishes.receive(100, TimeUnit.MILLISECONDS).ifPresent(System.out::println);
				
			}

		} finally {
		    client.disconnect();
		}
	}
}
