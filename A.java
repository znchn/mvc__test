import java.util.Arrays;

public class A{
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        for (int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }
}