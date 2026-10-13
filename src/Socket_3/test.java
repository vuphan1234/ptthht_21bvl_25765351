package Socket_3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class test {

	@Test
	public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
	    GreetClient client = new GreetClient();
	    client.startConnection("127.0.0.1", 1234);
	    String response = client.sendMessage("hello server");
	    System.out.println("Server tra loi: " + response);
	    assertEquals("hello client", response);
	}

}
