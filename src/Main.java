import java.util.Arrays;
//Билет № 5
public class Main {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] % 2 == 0) {
                arr [i] = arr [i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] newArr = Arrays.copyOfRange(arr, 2, 7);
        System.out.println(Arrays.toString(newArr));
    }
}