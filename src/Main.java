import linkedList.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        List<Integer> nums = Arrays.asList(4, 5, 7, 2);
//        StringBuffer sb = new StringBuffer("Java Code");
//        nums.stream().filter(n -> n >= 5).forEach(n -> System.out.print(n));
//        nums.forEach(System.out::println);

        LinkedList linkedList = new LinkedList(1);
        linkedList.append(2);


        System.out.println(linkedList.hasLoop());




    }
}