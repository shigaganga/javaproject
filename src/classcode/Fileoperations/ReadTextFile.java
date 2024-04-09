package classcode.Fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class ReadTextFile {

	public static void main(String[] args) throws IOException{
	//String filepath="C:\\Users\\shiga\\OneDrive\\Desktop\\myReadfile.txt";
//String filepath="C:\\Users\\shiga\\feb2024Workspace\\Feb2024\\files\\myReadfile.txt";
	//you can avoid hardcoded filepath using use.dir and fileseprator	
		String userDir=System.getProperty("user.dir");
		String fileseperator=System.getProperty("file.separator");
		System.out.println(fileseperator);
		System.out.println(userDir);
		//String filepath=userDir+"\\files\\myReadfile.txt";
		String filepath=userDir+fileseperator+"files"+fileseperator+"myReadfile.txt";
		System.out.println(filepath);
FileReader filereader=new FileReader(filepath);
BufferedReader bufferedReader=new BufferedReader(filereader);
/*System.out.println(bufferedReader.readLine());//read and deleted
System.out.println(bufferedReader.readLine());
System.out.println(bufferedReader.readLine());
System.out.println(bufferedReader.readLine());*///now there is noline
String str;
while((str=bufferedReader.readLine())!= null) {
	System.out.println(str);
}
	}

}
