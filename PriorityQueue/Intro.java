import java.util.PriorityQueue;
public class Intro{
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(9);
        pq.add(5);
        //pq.remove(2);
        while(!pq.isEmpty()){
            System.out.print(pq.peek());
            pq.remove();
        }
    }
}
