package classcode.Fileoperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfile {
public static void main(String[] args) throws IOException {
	String userDir=System.getProperty("user.dir");//define filepath of properies file
	//System.out.println(userDir);
	String fileseperator=System.getProperty("file.separator");
	//System.out.println(fileseperator);
	String filepath= userDir+fileseperator+"files"+fileseperator+"appProperties.properties";
	//System.out.println(filepath);
	//convert this string filepath in to file object
	FileInputStream fileinput=new FileInputStream(filepath);//instead of filewriter in txt file
	//create an object of propery file to convert this as a property file
	Properties prop=new Properties();
	prop.load(fileinput);
//fetch data from properyfile
	System.out.println(prop.getProperty("url"));
	System.out.println(prop.getProperty("username"));

}
}
