package JavaHackathon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Q31ReverseFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String userDir=System.getProperty("user.dir");
		String fileseperator=System.getProperty("file.separator");
		String filepath=userDir+fileseperator+"files"+fileseperator+"Q31Readfile.txt";
		String filepath2=userDir+fileseperator+"files"+fileseperator+"Q31Reversewritefile.txt";
FileReader filereader=new FileReader(filepath);
BufferedReader bufferedReader=new BufferedReader(filereader);
String str;
//while((str=bufferedReader.readLine())!= null) {
//	System.out.println(str);
//	}
FileWriter filewriter=new FileWriter(filepath2);
BufferedWriter bufferedWriter=new BufferedWriter(filewriter);
//Read all lines from the readfile in to a list
ArrayList <String> lines= new ArrayList<String>();
String line;
while((line=bufferedReader.readLine())!= null) {
	lines.add(line);	
}
Collections.reverse(lines);
//write the reversedfile to writefile
for(String revLine:lines) {
	bufferedWriter.write(revLine);
	bufferedWriter.newLine();
}
bufferedReader.close();
bufferedWriter.close();
System.out.println("reversed content of output writefile check files");
	}}
