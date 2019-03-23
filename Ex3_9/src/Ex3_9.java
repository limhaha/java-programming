import java.util.Scanner;

public class Ex3_9 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			System.out.println("Type letters");
			String s1, firstOut, s2;
			
			s1 = keyboard.nextLine();
			
			if (s1.equals("quit"))
				break;
			
			firstOut = s1.substring(1);
			
			int i = firstOut.length();
			
			int k;
		    s2 = null;
            s2 = new String();

            for (k = 0;k < i; k++) {
                  
                   if(s2.length() == 0)
                  s2 = firstOut.substring(i-1);
               else
               s2 = s2 + firstOut.substring(i-(k+1), i-k);       
            }
            
            if(firstOut.compareToIgnoreCase(s2) == 0) {
            	System.out.println("Word matches property!");
            }
            else
            	System.out.println("Word NOT matches property!");
         }
         
   }

}