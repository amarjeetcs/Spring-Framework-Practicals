package com.amarjeet.java.networking;

import java.io.IOException;
import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 8080);
			DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("Java Sockets are cool");
			dos.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

