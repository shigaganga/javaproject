package classcode.Collection;


import java.util.Stack;

/*  Last in First out
 *  
 * 
 */
public class StackConcept {
	
	public static void main(String[] args) {
		
	 Stack<String> stk = new Stack<String>();
	 
	 stk.add("Hema");
	 stk.add("Sita");
	 stk.add("teena");
	 stk.add("Sujatha"); 
	 stk.push("Prajwal");

	
	 int stksize= stk.size();
	 
	 for (int i=0; i<stksize; i++) {
		 System.out.println(stk.pop());
	 }
		
	}

}
