import com.arrays.BestTimeBuySellStock;
import com.arrays.ContainsDuplicate;
import com.arrays.MajorityNumber;
import com.arrays.TwoSum;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Two sum example,
        /*TwoSum twoSum = new TwoSum();
        //var res = twoSum.twoSumBruteForce(new int[]{2,7,11,15}, 13);
        //var res = twoSum.twoSumBruteForce(new int[]{-2,-7,-1,-5, -6,-9}, -13);
        //var res = twoSum.twoSumHashMap(new int[]{2,7,11,15}, 15);
        var res = twoSum.twoSumHashMap(new int[]{-2,-7,-1,-5, -6,-9}, -13);
        System.out.println("["+res[0]+","+res[1]+"]");*/

        /*
        BestTimeBuySellStock btbs = new BestTimeBuySellStock();
        System.out.println("Profit is :"+ btbs.bestTimeToBuySellStock(new int[]{7,1,7,5,3,6,4}));
        */

        /*
        MajorityNumber mn = new MajorityNumber();
        System.out.println("Majority Number :"+mn.findMajorityNumber(new int[] {2,2,1,1,1,2,2}));
        System.out.println("Majority Number O1 :"+mn.findMajorityNumberOnO1(new int[] {2,2,1,1,1,2,2}));
         */

        // Contains Duplicate
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println("Duplicate: "+cd.containsDuplicateSort(new int[]{5,4,1,2,3,4,5}));
        System.out.println("Duplicate Hash: "+cd.containsDuplicateHashSet(new int[]{5,4,1,2,3}));
    }
}