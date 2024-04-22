import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args){
        int[] array1= {1,2,3};
        int[] array2= {4,5,6,7};
        int[] array3 = new int[array1.length + array2.length];
       int index3 = 0;
       for(int i=0; i<array1.length;i++){
           array3[index3]=array1[i];
           index3++;
       }
       for (int j=0; j <array2.length;j++){
           array3[index3]=array2[j];
           index3++;
       }
       for(int i : array3){
           System.out.print(i +" ");
       }

    }
}
  