package classics;

import java.util.LinkedList;
import java.util.List;

public class MergeListAmazon {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();

        List<Integer> elegant = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list2.add(2);
        list2.add(3);
        list2.add(4);

        // Brute Force
        List<Integer> merge = new LinkedList<>(list);
        for (int n : list2) {
            if (!merge.contains(n)) {
                merge.add(n);
            }
        }

        System.out.println("The Merged List  " + merge);

        // Elegant Solution
        int i = 0;
        int m = list.size();
        int j = 0;
        int n = list2.size();

        // O(m or n)
        while (i < m && j < n) {
            if (list.get(i) < list2.get(j)) {
                i++;
            } else if (list2.get(j) < list.get(i)) {
                j++;
            } else {
                elegant.add(list.get(i));
                i++;
            }
        }

        list.removeAll(elegant);
        list.addAll(list2);
        System.out.println("The elegant List  "+ list);
    }
}
