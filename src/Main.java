import java.util.*;

public class Main {
            public static void main(String[] args) {
                task1();
                task2();
                task3();
                task4();
            }

                public static void task1() {
                    System.out.println(" задача 1 ");
                List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

                for (Integer num : nums) {
                    if (num % 2 != 0) {
                        System.out.println(num);
                    }
                }
            }
                 public static void task2() {
                     System.out.println(" задача 2 ");
                     List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

                     Set<Integer> evenNums = new TreeSet<>();

                     for (Integer num : nums) {
                         if (num % 2 == 0) {
                             evenNums.add(num);
                         }
                     }
                     for (Integer num : evenNums) {
                         System.out.println(num);
                     }
                 }
                 public static void task3() {
                     System.out.println(" задача 3 ");
                     List<String> words = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "orange", "apple"));

                     Set<String> uniqueWords = new HashSet<>(words);

                     for (String word : uniqueWords) {
                         System.out.println(word);
                     }
                 }
                 public static void task4() {
                     System.out.println(" задача 4 ");
                     List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

                     Map<String, Integer> wordCounts = new HashMap<>();

                     for (String word : words) {
                         if (!wordCounts.containsKey(word)) {
                             wordCounts.put(word, 1);
                         } else {
                             wordCounts.put(word, wordCounts.get(word) + 1);
                         }
                     }

                     for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                         System.out.println("Слово \"" + entry.getKey() + "\" встречается " + entry.getValue() + " раз(а)");
                     }
                 }
        }
