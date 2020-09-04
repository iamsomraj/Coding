import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * CopyFileDemo
 */
public class CopyFileDemo {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      try {
         // First File Creation
         System.out.println("\nEnter the name of the first file: \n");
         String fileName1 = scanner.nextLine();
         fileName1 = fileName1 + ".txt";
         System.out.println("\nEnter the content of the first file\n");
         String fileContent1 = scanner.nextLine();
         FileWriter fileWriterOne = new FileWriter(fileName1);
         for (int i = 0; i < fileContent1.length(); i++) {
            fileWriterOne.write(fileContent1.charAt(i));
         }
         fileWriterOne.flush();
         fileWriterOne.close();

         // First File Read
         FileReader fileReaderOne = new FileReader(fileName1);
         int ch1;
         fileContent1 = "";
         while ((ch1 = fileReaderOne.read()) != -1) {
            fileContent1 += String.valueOf((char) ch1);
         }
         fileReaderOne.close();

         // Second File Creation and Write
         String fileName2 = fileName1.substring(0, fileName1.length() - 4) + "-copy" + ".txt";
         FileWriter fileWriterTwo = new FileWriter(fileName2);
         for (int i = 0; i < fileContent1.length(); i++) {
            fileWriterTwo.write(fileContent1.charAt(i));
         }
         fileWriterTwo.flush();
         fileWriterTwo.close();

         // Second File Read
         FileReader fileReaderTwo = new FileReader(fileName2);
         int ch2;
         fileContent1 = "";
         System.out.println("The contents of " + fileName2 + " are displayed below:");
         while ((ch2 = fileReaderTwo.read()) != -1) {
            System.out.print((char) ch2);
         }
         fileReaderTwo.close();
      } catch (Exception e) {
         System.out.println("Something went wrong");
      }
      scanner.close();

   }
}