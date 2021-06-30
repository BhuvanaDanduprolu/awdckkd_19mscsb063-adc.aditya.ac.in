import java.io.*; 
class Count
{
static int countEvenOdd(int n)
{
    int even = 0;
    int odd = 0;
    while (n > 0)
    {
        int rem = n % 10;
        if (rem % 2 == 0)
            even++;
        else
            odd++;
        n = n / 10;
    }
    System.out.println ( "Even count : " + even);
    System.out.println ( "Odd count : " + odd);
    if (even % 2 == 0 &&
         odd % 2 != 0)
        return 1;
    else
        return 0;
}
    public static void main (String[] args)
    {
    int n;
    n = 123456;
    int t = countEvenOdd(n);
     
    if (t == 1)
        System.out.println ( "YES" );
    else
        System.out.println( "NO") ;
         
    }
}