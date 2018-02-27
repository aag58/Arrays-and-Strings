import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {

        public static int[] intersection(int[] nums1, int[] nums2) {


            Set<Integer> hs1 = new HashSet<>();
            Set<Integer> intersect = new HashSet<>();

            for(int i=0; i< nums1.length; i++){
                hs1.add(nums1[i]);
            }

            for(int i=0; i< nums2.length; i++){
                if(hs1.contains(nums2[i])){
                    intersect.add(nums2[i]);
                }
            }

            int[] res = new int[intersect.size()];
            int i =0;
            for(Integer val : intersect){
                res[i++] = val;
            }
            return res;
        }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,3,4};
        int[] arr2 = {5,7,12,45,2,7};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
        }
}
