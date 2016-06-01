package net.ruangtedy.bey.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
	public void sendCommand(boolean cmd) {
		Socket echoSocket;
		try {
			echoSocket = new Socket("192.168.0.15", 9000);
			PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
			String userInput;
			
//				out.write("1");
//				out.flush();
				
			if(cmd){
				out.write("1");
			}else
			{
				out.write("0");
			}
		//		out.write("0");
				out.flush();
				out.close();
				echoSocket.close();
//				userInput = stdIn.readLine();
//				if (userInput == null) {
//                    break;
//                }
//			    out.println(userInput);
//			    System.out.println("echo: " + in.readLine());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
