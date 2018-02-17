import java.util.*;
public class HelloWorld {
    public static void main(String args[]){
// ------------------Stack-----------------------------------
//        Stack s = new Stack();
//        int i = 0;
//        s.push(i);
//        s.push(++i);
//        s.push(++i);
//
//        s.push("Aditya");
//
//        s.add(1,"sunny");
//
//        System.out.println(s);
// -----------------------Array-------------------------------
//        int[] arr = {1,2,3,4};
//        int [] arr2 = arr.clone();
//
//        arr[1] = -1;
//        System.out.println(arr2[1]);

// ------------------Queue------------------------------------


//        System.out.println(Integer.MIN_VALUE);
//        int n = 5;
//        int res = ((n*n)+n)/2;
//
//        System.out.println(res);
//---------------------------duplicate element in array--------------------------------
//        HashSet s = new HashSet();
//
//        int[] arr = {1,2,3,3,4,5,5,6,7,8};
//
//        for(int i : arr){
//            if(!s.add(i)){
//                System.out.println("duplicate elemet is :"+ i);
//            }
//        }


        HashMap hm = new HashMap();

        hm.put(1,"Aditya");
        hm.put(2,"Aakash");
        hm.put(3,"Parag");
        hm.put(4,"Arvind");

        Iterator it = hm.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey()+"--"+ pair.getValue());
            it.remove();
        }

    }
}
