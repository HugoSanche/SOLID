package com.company.depinv;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message again 2");
		MessagePrinter printer = new MessagePrinter();
		PrintWriter writer= new PrintWriter(System.out);
		printer.writeMessage(msg,new JSONFormatter(),writer);
	}

}
