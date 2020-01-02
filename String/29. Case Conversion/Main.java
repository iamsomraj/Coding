class Main
{
    public static void main(String args[])
    {
        String s = "SoMrAjMukhERjEE";
        String n = new String();
        for(int i=0; i < s.length(); i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i) <= 'Z')
            {
                n = n + (char)(s.charAt(i) + ('a'-'A') );
            }
            else if(s.charAt(i)>='a' && s.charAt(i) <= 'z')
            {
                    n = n + (char)(s.charAt(i) - ('a'-'A') );
            }
            else
            {
                n = n + s.charAt(i);
            }
        }
        
        System.out.println(n);
    }
}