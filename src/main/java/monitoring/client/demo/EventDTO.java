package monitoring.client.demo;

import lombok.*;
import org.joda.time.DateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventDTO {

	private String id;

//	private DateTime timestamp;

	private String message;

}
