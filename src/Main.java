import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Task 1.");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        System.out.println("Task 2.");
        List<Integer> nums = new ArrayList<>(List.of(8, 5, 6, 3, 4, 4, 5, 5, 6, 7));
        TreeSet<Integer> numsOutput = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                numsOutput.add(num);
            }
        }
        System.out.println(numsOutput);
    }

    public static void task3() {
        System.out.println("Task 3.");
        List<String> words = new ArrayList<>(List.of("Lorem", "Lorem", "ipsum", "dolor", "sit", "amet", "dolor"));
        Set<String> wordsOutput = new HashSet<>(words);
        System.out.println(wordsOutput);
    }

    public static void task4() {
        System.out.println("Task 4.");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        List<String> stringsForCount = new ArrayList<>(strings);
        Set<String> results = new HashSet<>(strings);
        int count;
        for (String result : results) {
            count = 0;
            while(stringsForCount.contains(result)) {
                stringsForCount.remove(result);
                count++;
            }
            System.out.println(result + ": " + count);
        }
    }
}