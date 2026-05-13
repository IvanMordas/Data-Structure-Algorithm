import linkedList.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        List<Integer> nums = Arrays.asList(4, 5, 7, 2);
//        StringBuffer sb = new StringBuffer("Java Code");
//        nums.stream().filter(n -> n >= 5).forEach(n -> System.out.print(n));
//        nums.forEach(System.out::println);

        //1 -> 2 -> 3 -> 1 -> 4 -> 2 -> 5

        //3 -> 8 -> 5 -> 10 -> 2 -> 1 x: 5

        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);



        linkedList.swapPairs();

        linkedList.printList();


//        System.out.println(linkedList.findKthFromEnd(6).value);





    }
}