import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int sh1A = sc.nextInt();
         int priceA = sc.nextInt();
         int shB = sc.nextInt();
         int priceB = sc.nextInt();
         sc.close();
         double SingA = (double)priceA/sh1A;
         double SingB =(double) priceB/shB;
         if(SingA>SingB)
         {
             int dizzy = num/shB;
             int rem = num%shB;
             if(rem==0)
                System.out.println(dizzy*priceB);
            else
            {
                if((rem % sh1A)==0)
                {
                    System.out.println(dizzy*priceB + rem/sh1A * priceA);
                }
                else
                {
                    while( rem%sh1A !=0)
                    {
                        dizzy--;
                        rem=rem+shB;
                    }
                    System.out.println(dizzy*priceB + rem/sh1A * priceA);
                }
            }
         }
         else
         {
            int dizzy = num/sh1A;
            int rem = num%sh1A;
            if(rem==0)
               System.out.println(dizzy*priceA);
           else
           {
               if((rem % shB)==0)
               {
                   System.out.println(dizzy*priceA + rem/shB * priceB);
               }
               else
               {
                   while( rem%shB !=0)
                   {
                       dizzy--;
                       rem=rem+sh1A;
                   }
                   System.out.println(dizzy*priceA + (rem/shB) * priceB);
               }
           }
        }
    }
}
