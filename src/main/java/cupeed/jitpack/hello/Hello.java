package cupeed.jitpack.hello;

import lombok.Data;

@Data
public class Hello {
	private String cupeed;

	public String hello() {
		return "hello, cupeed";
	}
}
