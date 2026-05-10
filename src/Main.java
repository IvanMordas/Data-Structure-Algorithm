import linkedlist.LinkedList;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        List<Integer> nums = Arrays.asList(4, 5, 7, 2);
//        StringBuffer sb = new StringBuffer("Java Code");
//        nums.stream().filter(n -> n >= 5).forEach(n -> System.out.print(n));
//        nums.forEach(System.out::println);

        LinkedList linkedList = new LinkedList(1);
        linkedList.append(5);
        linkedList.append(7);
        linkedList.append(9);
        linkedList.append(3);

        System.out.println(linkedList.insert(1,2));

        linkedList.printList();
    }
}