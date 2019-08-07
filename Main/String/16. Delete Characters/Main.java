import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnetr the string: ");
        str=sc.nextLine();
        System.out.println("\n\nEnter the position:");
        int pos = sc.nextInt();
        System.out.println("\n\nEnter the number of characters:");
        int n = sc.nextInt();
        String ns = new String();
        for(int i = 0 ; i < str.length(); i++)
            
        {
            if(i>=pos-1 && i<=pos-2+n)
            {
                continue;
            }
            ns = ns + str.charAt(i);

        }
        System.out.println("\n\nThe new string becomes "+ns);
    }
}