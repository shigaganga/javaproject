package classcode.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q=new PriorityQueue<String>();
		q.add("shiga");
		q.add("ashi");
		q.add("shaju");
		q.add("mhilna");
		q.add("beena");
	int qsize=q.size();
for(int i=0;i<qsize;i++) {
	System.out.println(q.poll());
}
}
}