package classics;

import java.util.ArrayList;

public class ArraysIntersector {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {2,3,5,7};

        ArrayList<Integer> collector = new ArrayList<>();
        ArrayList<Integer> elegant = new ArrayList<>();

        //Brute force
        //O(m*n)
        for(int i: array1){
            for(int j: array2){
                if(i==j){
                    collector.add(j);
                }
            }
        }

        // Elegant Solution
        int i = 0 ;  int m = array1.length;
        int j = 0;   int n = array2.length;

        // O(m or n)
        while(i<m && j<n){
            if(array1[i]< array2[j]){
                i++;
            } else if (array2[j]<array1[i]){
                j++;
            }else {
                elegant.add(array1[i]);
                i++;
            }
        }

        System.out.println("The Intersection  " + collector);
        System.out.println("The Elegant Intersection  " + elegant);
    }
}
