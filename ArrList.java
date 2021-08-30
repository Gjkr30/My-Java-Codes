import java.util.*;
class ArrList
{
  public static void main(String[] args) {
      ArrayList<Integer> tt = new ArrayList<>();
      tt.add(56);
      tt.add(97);
      tt.add(86);
      tt.add(95);
      sum(tt);
  }
  private static void sum(ArrayList<Integer> tt)
  {
      List<ArrayList<Integer>> pp = new ArrayList<ArrayList<Integer>>();
      for(int i=0;i<tt.size();i++)
      {
          pp.add(tt);
      }
      System.out.println(pp);
  }
}
