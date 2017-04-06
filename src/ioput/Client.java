package ioput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	public Client() {
		try {
			System.out.println("Connect to 127.0.0.1"+"...");
			socket = new Socket("127.0.0.1", 10000);
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(socket.getOutputStream(),true);
			out.println(in.readLine());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(in.readLine());
			
			in.close();
			out.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}
}
