import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sf=new Scanner(System.in);
        int n=sf.nextInt();
        String a=sf.next();
        int one=0,zero=0;
        for(int i=0;i<a.length();i++)
        {
            if(Character.getNumericValue(a.charAt(i))==1)
                one++;
            else if(Character.getNumericValue(a.charAt(i))==0)
                zero++;
        }
        if(one<zero)
            System.out.println(n-(2*one));
        else
            System.out.println(n-(2*zero));
    }
}
