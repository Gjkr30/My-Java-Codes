import java.util.*;
/**
 * ArrToSet
 */
public class ArrToSet {

     public static void main(String[] args) {
        String[] arr={"hello","world","welcome","hello"};
        ArrayList<Integer> tt = new ArrayList<>();
        tt.add(990);
        tt.add(458);
        tt.add(987);
        tt.add(458);
        Set<String> kk = new HashSet<>(Arrays.asList(arr));
        Set<Integer> pp = new HashSet<>(tt);
        System.out.println(kk);
        System.out.println(pp);
    }
}
