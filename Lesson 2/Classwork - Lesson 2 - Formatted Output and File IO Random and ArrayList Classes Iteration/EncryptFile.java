import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class EncryptFile
{
     //returns one line of encrypted text
     public static String encrypt(String msg, String cw)
     {
          String encryptedMessage = new String();
          msg = msg.toUpperCase();
          cw = cw.toUpperCase();
          for (int i = 0; i<msg.length(); i++)
          {
               char ch =  msg.charAt(i);
               int shift =  (cw.charAt(i%cw.length())-'A');
               int oldPositionInAlphabet = ch -'A';
               int newPositionInAlphabet = (oldPositionInAlphabet + shift)%26;
               encryptedMessage = encryptedMessage + (char)(newPositionInAlphabet+'A');
          }
          return encryptedMessage;
     }

     public static void main (String args []) throws IOException
     {
          //Instantiate a Scanner object for keyboard input
          Scanner keyboard = new Scanner(System.in);
          System.out.printf("Enter Unencrypted file name: ");
          String unencryptedFileName = keyboard.next();

          File inputFile = new File(unencryptedFileName);

          if (!inputFile.exists())
          {
               System.out.printf("Error: file %s not found.\n", unencryptedFileName);
               System.exit(0);
          }
          Scanner inputReader = new Scanner(inputFile);
          //Open a new file for output
          System.out.printf("Enter Encrypted file name: ");
          String encryptedFile = keyboard.next();
          File outputFile= new File(encryptedFile);
		  PrintWriter outputWriter = new PrintWriter(outputFile);

          System.out.printf("Enter Codeword: ");
          String codeWord = keyboard.next();
          while( inputReader.hasNext()) //encrypt the file line by line
          {
               String line = inputReader.nextLine();
               String encryptedLine = encrypt(line, codeWord);
               outputWriter.printf("%s\n", encryptedLine);
          }
          inputReader.close();
          outputWriter.close();
     }
}
