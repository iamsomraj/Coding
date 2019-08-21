import java.util.*;
class Main
{
    public static boolean check(char ch, String str)
    {
        for(int i = 0; i<str.length(); i++)
        {
            if(ch==str.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        String str = new String();
        System.out.println("\nEnter the string: \n");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        
        String dup = new String();
        
        for(int i=0; i<str.length(); i++)
        {
            if(check(str.charAt(i),dup))
               {
                   dup = dup + str.charAt(i);
               }
        }
        
        System.out.println("\n\nduplicate free string is \n"+dup);
    }
    
}