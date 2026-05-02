import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> nums = Arrays.asList(4, 5, 7, 2);
        StringBuffer sb = new StringBuffer("Java Code");
        nums.stream().filter(n -> n >= 5).forEach(n -> System.out.print(n));
        nums.forEach(System.out::println);
    }
}