import java.util.LinkedList;

public class collectionsprog {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("vikki");
        list.add("Tamil");
        list.add("Tarun");
        list.add("Hemanth");
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list);
       list.addFirst("lal");
       list.addLast("Raji");
       System.out.println(list);

    }
}
