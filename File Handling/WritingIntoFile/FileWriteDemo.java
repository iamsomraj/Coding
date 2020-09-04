import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class FileWriteDemo {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("\nEnter a file name for a new text file:");
      System.out.println("\nUsing an existing file name will result into overwrite the previous file content\n");
      String fileName = scanner.nextLine();
      System.out.println("\nEnter something to write into the " + fileName + ".txt file:\n");
      String fileContent = scanner.nextLine();
      try {
         FileWriter fileWriter = new FileWriter(fileName + ".txt");
         for (int i = 0; i < fileContent.length(); i++) {
            fileWriter.write(fileContent.charAt(i));
         }
         System.out.println("File Writing Succesful!");
         fileWriter.flush();
         fileWriter.close();
      } catch (IOException e) {
         System.out.println("Something went wrong while creating the file:");
      }
      scanner.close();
   }
}