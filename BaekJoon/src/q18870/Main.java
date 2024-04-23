package q18870;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int arr[] = new int[num];
      int sorted[] = new int[num];
      HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
      for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
         sorted[i] = arr[i];
      }
      sc.close();
      Arrays.sort(sorted);
      int rank = 0;
      for (int v : sorted) {
         if (!rankMap.containsKey(v)) {
            rankMap.put(v, rank);
            rank++;
         }
      }

      for (int value : arr) {
         System.out.print(rankMap.get(value) + " ");
      }

   }
}