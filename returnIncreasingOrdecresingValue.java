
// Monotonic ArrayList

import java.util.ArrayList;

public class returnIncreasingOrdecresingValue {

    public static boolean isMonotonic(ArrayList<Integer> list){

        boolean increasing = true;
        boolean decreasing = true;
        for (int i=1; i<list.size(); i++){
            if (list.get(i)>list.get(i-1)){
                decreasing = false;
            }
            if (list.get(i)<list.get(i-1)){
                increasing = false;
            }
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(9);
        list.add(4);
        System.out.println(isMonotonic(list));
    }
}
