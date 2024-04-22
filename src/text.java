import java.util.Arrays;

public class text {
    public static void main(String[] args) {
        int [] array= {2,3,4,5};
        int[] newArray = new int[array.length - 1];
        for (int i =0; i< array.length - 1; i++){
            newArray[i]= array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
