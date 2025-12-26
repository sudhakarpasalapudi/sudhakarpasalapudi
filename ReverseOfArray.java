import java.util.Arrays;
public class ReverseOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = new int[arr.length];
        int index=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            reversed[index++]=arr[i];
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Reversed array: " + Arrays.toString(reversed));
    }
}