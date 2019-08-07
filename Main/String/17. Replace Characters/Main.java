import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        
        System.out.println("\n\nEnter the String:");
        str= sc.nextLine();
        
      
        System.out.println("\n\nEnter 1. Beginning 2. Ending 3.Position:");
        int ch = sc.nextInt();
        
        sc.nextLine();

        
        String chr = new String();
        System.out.println("\n\nEnter the character which will replace:");
        chr=sc.nextLine();



        String n = new String();
      
        switch(ch)
        {
            case 1:
                for(int i = 0 ; i<str.length(); i++)
                {
                    if(i==0)
                    {
                        n = n + chr;
                    }
                    else
                    {
                        n = n + str.charAt(i);
                    }
                }

                break;
            case 2:
                
                for(int i = 0 ; i<str.length(); i++)
                {
                    if(i==str.length()-1)
                    {
                        n = n + chr;
                    }
                    else
                    {
                        n = n + str.charAt(i);
                    }
                }
                break;
            case 3:
                System.out.println("\n\nEnter the position: ");
                int pos = sc.nextInt();
                for(int i = 0 ; i<str.length(); i++)
                {
                    if(i==pos-1)
                    {
                        n = n + chr;
                    }
                    else
                    {
                        n = n + str.charAt(i);
                    }
                }
                break;
        }
        
        System.out.println("\n\nThe new string becomes "+n);

        
    }
}