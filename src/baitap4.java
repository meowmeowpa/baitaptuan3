import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 6, 78,};
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println(" phan tu nho nhat trong mang la:" + minValue);
    }
}
