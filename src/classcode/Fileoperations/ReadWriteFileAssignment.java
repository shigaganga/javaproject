package classcode.Fileoperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFileAssignment {
	public static void main(String[] args) throws IOException{
		
		String userDir=System.getProperty("user.dir");
		String fileseperator=System.getProperty("file.separator");
		String filepath=userDir+fileseperator+"files"+fileseperator+"MyReadWriteFile.txt";
FileReader filereader=new FileReader(filepath);
BufferedReader bufferedReader=new BufferedReader(filereader);
String str;
while((str=bufferedReader.readLine())!= null) {
	System.out.println(str);
}
FileWriter filewriter=new FileWriter(filepath,true);
BufferedWriter bufferedWriter=new BufferedWriter(filewriter);
bufferedWriter.write("\n");
bufferedWriter.write("welcome to javascript");
bufferedWriter.write("\n");
bufferedWriter.write("javascript is a programming language");
bufferedWriter.close();
	}

}

