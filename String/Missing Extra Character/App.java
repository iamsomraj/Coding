import java.util.*;

class App {
   static String findExtraCharcter(char[] strA, char[] strB) {
      LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
      for (int i = 0; i < strB.length; i++) {
         linkedHashMap.put(String.valueOf(strB[i]), 0);
      }
      for (int i = 0; i < strA.length; i++) {
         linkedHashMap.put(String.valueOf(strA[i]), 0);
      }
      for (int i = 0; i < strB.length; i++) {
         int number = linkedHashMap.get(String.valueOf(strB[i]));
         linkedHashMap.put(String.valueOf(strB[i]), number + 1);
      }
      for (int i = 0; i < strA.length; i++) {
         int number = linkedHashMap.get(String.valueOf(strA[i]));
         linkedHashMap.put(String.valueOf(strA[i]), number - 1);
      }
      for (Map.Entry<String, Integer> map : linkedHashMap.entrySet()) {
         if (map.getValue() != 0) {
            return map.getKey();
         }
      }
      return "NA";
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String input[] = sc.nextLine().split(" ");
      if (input[0].equals(input[1])) {
         System.out.println("NA");
         return;
      }
      String first = input[0];
      String second = input[1];
      System.out.println(findExtraCharcter(first.toCharArray(), second.toCharArray()));
   }

}