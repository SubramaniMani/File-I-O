package learn__io_file;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pratice_java {

	public static void main(String[] args) throws IOException 
	{
		/*
		 * File file = new File("/home/subramani/Documents/GIT//Subramani");
		 * 
		 * file.mkdir();
		 * 
		 * System.out.println(file.exists());
		 */
		
		/*
		 * File file1 = new
		 * File("/home/subramani/Documents/GIT//Subramani//object//Subramani.txt");
		 * 
		 * file1 . mkdirs();
		 * 
		 * System.out.println(file1.exists());
		 */
		
		
		/*
		 * File file1 = new
		 * File("/home/subramani/Documents/GIT//Subramani//object//mani.txt"); try {
		 * System.out.println(file1.createNewFile()); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		/*
		 * File file1 = new
		 * File("/home/subramani/Documents/GIT//Subramani//object//mani.txt");
		 * 
		 * System.out.println(file1.delete());
		 */
		
		/*
		 * File file1 = new File("/home/subramani/Documents/GIT");
		 * 
		 * 
		 * String [] str = file1.list();
		 * 
		 * for(int i =0; i<str.length; i++) {
		 * 
		 * if(str[i].charAt(0)=='U') System.out.println(str[i]); }
		 */
		
		/*
		 * File file = new File("/home/subramani/Documents/GIT");
		 * 
		 * File[] str = file.listFiles();
		 * 
		 * for(int i=0; i<str.length; i++) { System.out.println(str[i]); }
		 */
		
		/*
		 * File file = new File("/home/subramani/Documents/GIT/Subramani/object");
		 * 
		 * File[] str = file.listFiles();
		 * 
		 * for(File e : str) { if(e.isFile()); System.out.println(e);
		 * 
		 * }
		 */
		
		/*
		 * File file = new
		 * File("/home/subramani/Documents/GIT/Subramani/object/Subramani.txt");
		 * 
		 * file . createNewFile();
		 * 
		 * File newname = new
		 * File("/home/subramani/Documents/GIT/Subramani/object/mani.txt");
		 * 
		 * System.out.println(file . renameTo(newname));
		 * 
		 * System.out.println(file.getName());
		 * 
		 * System.out.println(newname.getName());
		 */
		
		/*File file = new File("/home/subramani/Documents/GIT/Subramani/object");
		
		File [] f1 = file.listFiles();
		
		for(File e  : f1)
		{
			if(e . isFile())
			{
				String filename = e.getName();
				
				int dot = filename .lastIndexOf(".");
				
				String last = filename . substring(dot+1);
				
				if(last.equals("html"))
				{
					System.out.println(filename);
				}*/
		
		/*
		 * File file = new
		 * File("/home/subramani/Desktop/Subramani/Suvetha/Nivetha.txt");
		 * 
		 * file.createNewFile();
		 * 
		 * FileWriter wtr = new FileWriter(file);
		 * 
		 * wtr .write("Subramani ILU Suvetha"); wtr.flush(); wtr.close();
		 * 
		 * FileReader fr = new FileReader(file);
		 */
		
		/*
		 * int output = fr.read();
		 * 
		 * while(output!=-1) {
		 * 
		 * System.out.print((char) output);
		 * 
		 * output = fr.read(); }
		 */
		
		
		/*
		 * char [] ch = new char[(int)file.length()];
		 * 
		 * System.out.println(ch.length); // text length
		 * 
		 * fr.read(ch);
		 * 
		 * for(char obj : ch)
		 * 
		 * System.out.print(obj);
		 */
		
		
		File file = new File("/home/subramani/Desktop/Subramani/Suvetha/Nivetha.txt");
		
		FileWriter fw;
		
		fw = new FileWriter(file , true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Subramani");
		bw.newLine();
		bw.write("Suvetha");
		bw.newLine();
		bw.write("Nivetha");
		bw.flush();
		bw.close();
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br .readLine();
		
		int linecount = 0;
		int count = 0;
		
		
		while(line != null)
		{
			String  [] sentence = line.split("[.]");
		    count = count+ sentence.length;
		    
			linecount++;
			System.out.println(line);
			
			
			line=br.readLine();	
		}
		
		System.out.println(linecount);
		System.out.println("sentence_count===>"+"  " + count);
		
		
	}
		}


