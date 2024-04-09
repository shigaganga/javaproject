package StringAssignments;

public class Q5CaseIntCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello Java 8";
		int uppercase=0;
		int lowercase=0;
		int num=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
				lowercase++;
			
			if(ch>='A'&&ch<='Z')
				uppercase++;
			
			if(ch>='1'&&ch<='9')
				num++;
		}
		System.out.println("total no of uppercases of this string: "+uppercase);
		System.out.println("total no of lowecases of this string: "+lowercase);
		System.out.println("total no of integer numbers of this string: "+num);
		


	}

}
