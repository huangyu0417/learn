package com.hy.utill;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
/**
 * 
 * @desc 描述   
 * @author hy        
 * @version 1.0      
 * @created 2016-11-2 下午2:35:42
 */
public class ReplaceString {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try{
		File file = new File("E:/e.sql");
		File file2 = new File("E:/elt.sql");
		InputStream in = new FileInputStream(file);
		OutputStream out = new FileOutputStream(file2);
		 reader = new BufferedReader(new InputStreamReader(in));
		 writer = new BufferedWriter(new OutputStreamWriter(out));
		String buf;
		while((buf = reader.readLine()) != null){
			String a = buf.replaceAll("to_timestamp[(](.*)['][)]", "to_timestamp('21-07-2015 13:59:59.714000', 'dd-mm-yyyy hh24:mi:ss.ff')");
			writer.write(a+"\r\n");
		}
		}catch(Exception exception){
			
		}finally{
		reader.close();
		writer.close();
		}
	}
}
