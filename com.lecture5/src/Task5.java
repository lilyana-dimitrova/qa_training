import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList  = new LinkedList<>();
        linkedList.add(47);
        linkedList.add(1);
        linkedList.add(62);
        linkedList.add(4);
        linkedList.add(9);
        linkedList.add(22);

        System.out.println("Linked list before reversing: " + linkedList);
        reverseList(linkedList);
        System.out.println("Linked list after reversing: " + linkedList);
    }


    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {

        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);

        }
        return list;
    }

}
