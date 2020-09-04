import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Source {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("\nEnter a file name for a new text file:\n");
      String fileName = scanner.nextLine();
      System.out.println("\nEnter Something To Write Into A File:\n");
      String fileContent = scanner.nextLine();
      try {
         FileWriter fileWriter = new FileWriter(fileName + ".txt");
         for (int i = 0; i < fileContent.length(); i++) {
            fileWriter.write(fileContent.charAt(i));
         }
         System.out.println("File Writing Succesful!");
         fileWriter.close();
      } catch (IOException e) {
         System.out.println("Something went wrong while creating the file:");
      }
      scanner.close();
   }
}