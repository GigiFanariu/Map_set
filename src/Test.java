import java.util.*;

public class Test {
    public static void main(String[] args) {

        Map<String, Integer> months = new LinkedHashMap<>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);

        Set<String> monthKeys = months.keySet();
        System.out.println("Set of months key:" + monthKeys);

        Collection<Integer> values = months.values();
        List<Integer> cardinalMonth = new ArrayList<>(values);
        System.out.println("cardinalMonth: " + cardinalMonth);

        Integer[] cardinalMonthArray = new Integer[values.size()];
        values.toArray(cardinalMonthArray);
        System.out.println("cardinalMonthArray: " + Arrays.toString(cardinalMonthArray));
    }
}
