import java.util.HashMap;
public class subInteger {
    static int[] S = {32,3};
    static int[] T = {1,2,3,52,32,54};

    public static void main(String[] args) {
        System.out.println(subInteger(S, T));
    }

    public static boolean subInteger(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return false;
        }

        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int element : arr2) {
            map.put(element, Boolean.TRUE);
        }

        for (int element : arr1) {
            if (!map.containsKey(element)) {
                return false;
            }
        }

        return true;
    }
}

