package com.amarjeet.java.networking;

import java.io.IOException;
import java.net.*;
import java.io.*;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket serverScocket = new ServerSocket(8080);
			System.out.println("Wating for client to connect on port 8080");
			Socket socket=serverScocket.accept();
			System.out.println("Connection Established");
			DataInputStream dis=new DataInputStream(socket.getInputStream());
			String data=dis.readUTF();
			System.out.println("Data Received"+data);
			dis.close();
			serverScocket.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
