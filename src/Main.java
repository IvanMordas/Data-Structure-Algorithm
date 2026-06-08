import hashtable.HashTable;
import task.StackArrayList;


public class Main {

    public static String reverseString(String str) {
        StackArrayList<Character> stackArrayList = new StackArrayList<>();

        for (Character ch : str.toCharArray()) {
            stackArrayList.push(ch);
        }
        String result = "";
        while (!stackArrayList.isEmpty()) {
            result = result + stackArrayList.pop();
        }
        return result;
    }

    public static boolean isBalancedParentheses(String str) {
        StackArrayList<Character> stackArrayList = new StackArrayList<>();
        if (str.isEmpty()) {
            return true;
        }
        int counter = 0;

        for (Character ch : str.toCharArray()) {
            if (ch == '(') {
                stackArrayList.push(ch);
                counter++;
            } else {
                if (counter == 0) {
                    return false;
                }
                stackArrayList.pop();
                counter--;
            }
        }
        return counter == 0 ? true : false;
    }

    public static void sortStack(StackArrayList stack) {
        StackArrayList<Integer> tempStack = new StackArrayList<>();
        Integer tempInt = 0;

        while (tempInt != null) {
            tempInt = (Integer) stack.pop();

            if (tempStack.peek() != null && tempInt != null && tempInt < tempStack.peek()) {
                while (tempStack.peek() != null && tempInt != null && tempInt < tempStack.peek()) {
                    stack.push(tempStack.pop());
                }

                tempStack.push(tempInt);
            } else {
                tempStack.push(tempInt);
            }

        }

        while (!tempStack.isEmpty()) {
            if (tempStack.peek() != null) {
                stack.push(tempStack.pop());
            } else {
                tempStack.pop();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        List<Integer> nums = Arrays.asList(4, 5, 7, 2);
//        StringBuffer sb = new StringBuffer("Java Code");
//        nums.stream().filter(n -> n >= 5).forEach(n -> System.out.print(n));
//        nums.forEach(System.out::println);

        HashTable hashTable = new HashTable();

        hashTable.set("nails", 100);
        hashTable.set("tile", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);
        hashTable.printTable();
        System.out.println(hashTable.keys());


    }
}