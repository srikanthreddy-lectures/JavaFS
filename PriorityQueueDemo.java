public class PriorityQueueDemo {
    public static void main(String[] args) {
       PriorityQueue<Integer> pq1=new PriorityQueue<>(new Comparator<Integer>() {
           @Override
           public int compare(Integer x, Integer y) {
               return Integer.compare(y,x);
           }
       });
       pq1.add(11);
        pq1.add(2);
        pq1.add(8);
        pq1.add(15);
        pq1.add(1);

        pq1.forEach(a-> System.out.print(a+" "));
        System.out.println("");
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
        System.out.println(pq1.poll());
    }
}
