package classcode.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(4);
		q.add(3);
		q.add(6);
		q.add(29);
		q.add(11);
		System.out.println(q);
	int qsize=q.size();
for(int i=0;i<qsize;i++) {
	System.out.println(q.poll());
}
	}

}
