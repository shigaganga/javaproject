package StringAssignments;

public class Q1Ocuurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="I Love Javaprogramming";
String str2="o";
String Newstr=str.replaceAll(" " , "");
int index1=Newstr.indexOf(str2);
System.out.println(index1);
int index2=Newstr.lastIndexOf(str2);
System.out.println(index2);
int occurance=(index2-index1)-1;
System.out.println("occurance is:"+occurance);
	}

}
