package projectdavid;
import java.util.LinkedList;
import java.util.Queue;

public class MyClass {

    public static void main(String[] args){

    	Queue<String> line1 = new LinkedList<>();
    	Queue<String> line2 = new LinkedList<>();
    	
    	char let = 'A';
    	int time = 0;
    	int rn;
    	
    	line1.add("" + let + let + let);
    	let++;
    	line2.add("" + let + let + let);
    	
    	while (time < 40)
    	{	
    		rn = (int)(Math.random() * 6);
    		 if (rn == 0 || rn == 1 || rn == 2) {
                 let++;
                 String person = "" + let + let + let;

                 if (Math.random() < 0.5) {
                     line1.add(person);
                 } else {
                     line2.add(person);
                 }
             }
             if (rn == 3 || rn == 4) {
                 if (!line1.isEmpty()) {
                     line1.poll();
                 }
             }
             if (rn == 5 || rn == 6) {
                 if (!line2.isEmpty()) {
                     line2.poll();
                 }
             }
             System.out.println("Time " + time);
             System.out.println("Queue 1: " + line1);
             System.out.println("Queue 2: " + line2);
             time++;
    		
    	}

    }
}
