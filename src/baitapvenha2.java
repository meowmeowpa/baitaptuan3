public class baitapvenha2 {
    public static void main (String[] args){
        int[] arrayNumber={3,5,7,8,1,2,6};
        int value= 10;
        int [] newArray=new  int[arrayNumber.length +1];
        for (int i=0; i<arrayNumber.length; i++){
            newArray[1 + i]= arrayNumber[i];
        }
        newArray[0]=value;
        for (int i : newArray) {
            System.out.print(i + " ");
        }

    }
}
