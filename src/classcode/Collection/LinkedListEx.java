package classcode.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q=new LinkedList<String>();
		q.add("shiga");
		q.add("ashi");
		q.add("shaju");
		q.add("mhilna");
		q.add("beena");
		//q.add(Null);
	int qsize=q.size();
for(int i=0;i<qsize;i++) {
	System.out.println(q.poll());
}
}
}
