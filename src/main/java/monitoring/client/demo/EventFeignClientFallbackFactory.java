package monitoring.client.demo;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@Slf4j
public class EventFeignClientFallbackFactory implements FallbackFactory< EventFeignClient > {

	@Override
	public EventFeignClient create( Throwable throwable ) {
		return new EventFeignClient( ) {
			@Override
			public void sendEvent(@RequestBody EventDTO eventDTO) {
				log.warn( "BookFeignClient fallback, caused by: " + throwable.getMessage() );

			}
		};
	}

}
