package monitoring.client.demo;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class FeignClientTester implements CommandLineRunner {

	private final EventFeignClient eventFeignClient;

	@Override
	public void run( String... args ) throws Exception {
		for ( int i = 0 ; i < 10 ; i++ ) {
			eventFeignClient.sendEvent( EventDTO.builder()
					                            .message( "message " + i )
//					                            .timestamp( DateTime.now() )
					                            .build() );
		}
	}
}
