import java.util.Scanner;
class XorE
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y = n^(n+1);
    int k = (n+2)^(n+3);
    if(y==k)
      System.out.println("yes");
    else
      System.out.println("no");
  }
}
