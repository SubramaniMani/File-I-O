package learn__io_file;

/*import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;*/
import java.io.*;

public class File_IO_demo {

	public static void main(String[] args) throws IOException {
		
		//File note = new File ("/home/subramani/Documents/CSS/subramai.txt");
		File note = new File ("/home/subramani/Documents/GIT/subramani.txt");
		note.createNewFile();
		System.out.println(note.canWrite());
		System.out.println(note.canRead());
		System.out.println(note.getName());
		System.out.println(note.isFile());
		//System.out.println(note.isDirectory());
	   // System.out.println(note.getPath());
	   //System.out.println(note.delete());
	   //System.out.println(note1.delete());
	    
	 FileWriter pen = new FileWriter(note); 
	 
	 BufferedWriter bw = new BufferedWriter(pen);
	// pen.write('a');
	// pen.write('b');
	 //pen.write('c');
	 //pen.write('d');
	 //pen.flush();
	// pen.close();
	 
	 bw.write("Subramani ");
	 bw.write("Swetha");
	 bw.flush();
	 bw.close();
	 
	 FileReader reader = new  FileReader(note);
	 
	 BufferedReader br = new BufferedReader(reader);
	 
	 String line = br .readLine();
	 while(line!=null)
	 {
	 System.out.println(line);
	 line = br.readLine();
	 }
	 
	 
	/* int ch = reader.read();
	 while(ch!=-1)
	 {
		 System.out.println((char)ch);
		 ch = reader.read();
	 }*/
	 
	    
	}

}
