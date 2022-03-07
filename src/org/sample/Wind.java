package org.sample;

import java.io.File;
import java.io.IOException;

public class Wind {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Program Files (x86)");
		
		boolean canRead = f.canRead();
		System.out.println(canRead);
		
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		
		boolean exists = f.exists();
		System.out.println(exists);
		
		boolean file = f.isFile();
		System.out.println(file);
		
		boolean directory = f.isDirectory();
		System.out.println(directory);
		
		String[] list = f.list();
		
		for (String string : list) {
			System.out.println(string);
			
		}
		File[] listFiles = f.listFiles();
		for (File file2 : listFiles) {
			System.out.println(file2);
			
		}
		
		System.out.println("baiya perf2");
		
		System.out.println("hello java");
		
		
		
		
		
	}

}
