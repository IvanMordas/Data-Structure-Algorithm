import task.StackArrayList;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static boolean itemInCommon(int[] array1, int[] array2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array1.length; i++) {
            map.put(i, array1[i]);
        }

        for (int i : array2) {
            if (map.containsValue(i)) {
                return true;
            }
        }
        return false;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 1) + 1);
        }

        return map.entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

    }

    public static Character firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (str.isEmpty()) {
            return null;
        }
        char[] chars = str.toCharArray();
        for (Character c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c : chars) {
            if (map.get(c).equals(1)) {
                return c;
            }
        }
        return null;
    }

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

    public static String sortString(String str) {
        return Arrays.stream(str.split(""))
                .sorted()
                .collect(Collectors.joining());
    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strings) {
            String sortedString = sortString(str);
            map.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) throws InterruptedException {
//        List<Integer> nums = Arrays.asList(4, 5, 7, 2);
//        StringBuffer sb = new StringBuffer("Java Code");
//        nums.stream().filter(n -> n >= 5).forEach(n -> System.out.print(n));
//        nums.forEach(System.out::println);

        int[] array1 = {};
        int[] array2 = {1, 2, 3};
//        System.out.println(itemInCommon(array1, array2));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        String[] inputStrings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(inputStrings));


    }
}