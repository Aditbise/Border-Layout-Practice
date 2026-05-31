import java.util.*;

class main{
    public static void main(String ar[]){

        //ArrayList - Resizable array, maintains insertion order, allows duplicates and null values
        ArrayList<Integer> alist=new ArrayList<>();
        alist.add(1);    //to add value
        int a1=alist.get(0);    //to access value
        alist.set(1,99); //to update value
        alist.remove(0); //automatically finds and remove value
        int length=alist.size(); //to get the length of list
        boolean statement=alist.contains(20); //to check if value is in list or not
        
        //LinkedList - Doubly-linked list, best for frequent insertions/deletions at both ends
        LinkedList<Integer> llist=new LinkedList<>();
        llist.add(1);   
        int a=llist.get(0);    
        llist.set(1,99);
        llist.remove(0);
        length=llist.size(); 
        boolean statement=llist.contains(20);


        //HashSet - Unordered, stores unique elements only, uses hashing for fast lookups
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.remove(1);
        statement=hs.contains(20);
        length=hs.size();
        
        //TreeSet - Sorted, unique elements, implements NavigableSet with O(log n) operations
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.remove(1);
        statement=hs.contains(20);
        length=hs.size();
        
        //LinkedHashSet - Maintains insertion order while keeping elements unique like HashSet
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(1);
        lhs.remove(1);
        statement=hs.contains(20);
        length=hs.size();
        

        //HashMap - Unordered key-value pairs, allows null keys and values, O(1) average lookup
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Apple");
        hm.remove(1); //remove key
        hm.get(1); //get value
        boolean tfkey=hm.containsKey(1);
        boolean tfvalue=hm.containsValue("Apple");
        int size=hm.size();
        
        //TreeMap - Sorted by natural key order, NavigableMap with O(log n) performance
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(1,"Apple");
        tm.remove(1);
        tm.get(1);
        tfkey=tm.containsKey(1);
        tfvalue=tm.containsValue("Apple");
        size=tm.size();
        
        //LinkedHashMap - Maintains insertion order of key-value pairs like insertion-order map
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(1,"Banana");
        lhm.remove(1);
        lhm.get(1);
        tfkey=lhm.containsKey(1);
        tfvalue=lhm.containsValue("Apple");
        size=lhm.size();


        //Queue - FIFO (First-In-First-Out), add elements at rear, remove from front
        Queue<Integer> q=new LinkedList<>();
        q.add(11);
        q.peek(); //see front
        q.poll(); //remove front
        int qsize=q.size();
        
        //PriorityQueue - Elements retrieved based on priority, min-heap by default
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(11);
        pq.peek(); //see front
        pq.poll(); //remove front
        int qsize=pq.size();
        

        //Deque - Double-ended queue, add/remove from both front and rear
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(12);
        dq.addLast(23);
        dq.removeFirst();
        dq.removeLast();
        dq.peekFirst();
        dq.peekLast();


        //Stack - LIFO (Last-In-First-Out), push/pop from same end, legacy class
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.pop(); //remove top
        s.peek(); //see top 
        s.isEmpty();


        //Vector - Legacy synchronized ArrayList, thread-safe but slower than ArrayList
        Vector<Integer> v=new Vector<>();
        v.add(1);
        v.get(0);
        v.remove(0);
        size=v.size();


    }
}