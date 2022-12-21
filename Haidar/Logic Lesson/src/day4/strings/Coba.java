package day4.strings;

import java.util.Scanner;

public class Coba {
   public static void main(String[] args)  {
      int passwordLength=8, upChars=0, lowChars=0;
      int special=0, digits=0;
      char ch;
      Scanner s = new Scanner(System.in);
	      
      System.out.print("Enter the Password: ");
      String password = s.nextLine();
	      
      int total = password.length();
      if(total<passwordLength)
      {
         System.out.println("\nThe Password is invalid!");
         return;
      }
      else
      {
         for(int i=0; i<total; i++)
         {
            ch = password.charAt(i);
            if(Character.isUpperCase(ch))
               upChars = 1;
            else if(Character.isLowerCase(ch))
               lowChars = 1;
            else if(Character.isDigit(ch))
               digits = 1;
            else
               special = 1;
         }
      }
      if(upChars==1 && lowChars==1 && digits==1 && special==1)
         System.out.println("\nThe Password is Strong.");
      else
         System.out.println("\nThe Password is Weak.");
   }
}
