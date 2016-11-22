package g53sqm.chat.server;

import static org.junit.Assert.*;

import java.net.ServerSocket;

import org.junit.Before;
import org.junit.Test;

public class ServerTest {
	
	private static final int TEST_PORT = 9000;
	
	Server server = null;
	
	@Before
	public void initialize(){
		server = new Server(TEST_PORT);
	}
	
	/*
	@Test
	public void testServerConnection(){
		ServerSocket testSocket = null;
		
		try{
			testSocket = new ServerSocket(TEST_PORT);
			
			assertTrue()
		}
	}*/

	@Test
	public void testGetUserList() {
		assertSame(server.getUserList(),server.getNumberOfUsers());
	}

	@Test
	public void testDoesUserExist() {
		fail("Not yet implemented");
	}

}
