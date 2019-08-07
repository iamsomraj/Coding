import java.util.*;
class Main
{
    public static void main(String args[])
    {
        String s = new String();
        Scanner c = new Scanner(System.in);
        System.out.println("\n\nEnter the String: ");
        s= c.nextLine();
        String sub = new String();
        System.out.flush();
        System.out.println("\n\nEnter the Sub string: ");
        sub = c.nextLine();
        
        
        System.out.println("\n\nEnter the position : ");
        int pos = c.nextInt();
        String n = new String();
        
        for(int i = 0; i<s.length(); i++)
        {
            n = n + s.charAt(i);
            if(i==pos-1)
            {
                n = n + sub;
            }
        }
        System.out.println("\n\nThe new string becomes "+n);
    }
}