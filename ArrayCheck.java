import java.util.List;
import java.util.ArrayList;
class ArrayCheck{
    public static void main(String[] args) {
        // int[] arr = new int[0];
        // for(Integer i:arr)
        //     System.out.print(i+" ");
        // System.out.println();
        // fun(arr);
        // for(Integer i:arr)
        //     System.out.print(i+" ");

        List<Integer> cc = new ArrayList<>();
        for(Integer i:cc)
        {
            System.out.print(i+" ");
            System.out.print("NoWau");
        }
        System.out.print("Nothing");

    }
    public  static void fun(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
            arr[i]=i;
    }
}
