package classcode.Fileoperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String userDir=System.getProperty("user.dir");
		String fileseperator=System.getProperty("file.separator");
		System.out.println(fileseperator);
		//String filepath=userDir+"\\files"+"\\myWriteFile.txt";
	String filepath=userDir+fileseperator+"files"+fileseperator+"myWriteFile.txt";
		System.out.println(filepath);
		FileWriter filewriter=new FileWriter(filepath);
		BufferedWriter bufferedWriter=new BufferedWriter(filewriter);
		bufferedWriter.write("welcome to java");
		bufferedWriter.write("\n");
		bufferedWriter.write("java is a programming language");
      bufferedWriter.close();
      
}
}