package com.hy.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
	private static final Logger log = LoggerFactory.getLogger(HelloWorld.class);
	public static void main(String[] args) throws Exception{
		String path = "sql/a.sql";
		FileInputStream in = new FileInputStream(new File(path));
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		StringBuffer buffer = new StringBuffer();
		String s = null;
		while((s = reader.readLine()) != null){
			buffer.append(s).append("\r\n");
		}
		System.out.println(buffer.toString()+"system");
		log.info("SLF4J=>{}",(buffer.toString().replaceFirst("\r\n", "-")));
		reader.close();
		
	}
}
