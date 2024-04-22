
public class baitapvenha4 {
    public static void main(String[] args) {
        int[] arrayNumber = {2, 3, 4, 5, 6};
        int[] newArray = new int[arrayNumber.length - 1];
        for (int i = 0; i < arrayNumber.length - 1; i++) {
            newArray[i] = arrayNumber[i];

        }
        for (int i : newArray) {
            System.out.print(i + " ");
        }

    }
}
