import java.io.FileReader;
import java.util.*;

class FileReadDemo {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("\nEnter the text file (.txt) name to read:\n");
      String fileName = scanner.nextLine();
      try {
         FileReader fileReader = new FileReader(fileName + ".txt");
         System.out.println(fileName + ".txt :-\n");
         int ch;
         while ((ch = fileReader.read()) != -1) {
            System.out.print((char) ch);
         }
         fileReader.close();
      } catch (Exception e) {
         System.out.println("Something went wrong while reading this file:");
      }
      scanner.close();
   }
}
