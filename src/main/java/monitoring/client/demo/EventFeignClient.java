package monitoring.client.demo;

import feign.Headers;
import org.joda.time.DateTime;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "event-client", url = "http://localhost:8080",fallbackFactory = EventFeignClientFallbackFactory.class)
public interface EventFeignClient {

	String AUTH_TOKEN = "Authorization";

	@PostMapping("/event")
//	@Headers("Content-Type: application/json")
	public void sendEvent(EventDTO eventDTO);
}


