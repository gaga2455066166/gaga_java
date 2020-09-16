package com.cjl.mooc;

import java.io.Console;

public class ConsoleTest
{
	public static void main(String[] args){
		Console con = System.console();
		if( con == null ){
			System.out.println("null");
			return;
		}

		String s = con.readLine();
		
		con.printf( "****.", s );
		
	}
};