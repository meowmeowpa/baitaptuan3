import java.util.Arrays;

public class baitapvenha3 {
    public static void main(String[] args){
        int [] arrayNumber={1,2,3,4};
        int  value=8;
        int index=2;
        int []newArray= new int [arrayNumber.length+1];
        for (int i =0; i< index; i++){
          newArray[i]= arrayNumber[i];
        }
        System.out.println(Arrays.toString(newArray));
        newArray[index]= value;
        for (int i= index; i< arrayNumber.length; i++){
            newArray[i+1] = arrayNumber[i];
        }
        for (int i : newArray){
            System.out.print( i+ " ");
        }
    }
}
