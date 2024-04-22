import java.util.Arrays;
import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args){
        int[] array= { 1,2,3,4,5,6,7};
        int[] newarray =  new int[array.length - 1];
        System.out.println(" Mảng cần xóa");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử cần xóa :");
        int x= scanner.nextInt();
        for(int i = 0, k = 0; i< array.length; i++){
            if (array[i] != x){
                newarray[k] = array[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(newarray));
    }
}
