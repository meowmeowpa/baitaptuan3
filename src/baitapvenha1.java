import java.util.Scanner;

public class baitapvenha1 {
    public static void main(String[] args) {
        int[] arrayNumber = {3, 5, 7, 8, 1, 2, 6};
        int value = 10;
        int[] newArray = new int[arrayNumber.length + 1];
//        sao chép các phần tử mảng ban đầu sang mảng mới
        for (int i = 0; i < arrayNumber.length; i++) {
            newArray[i] = arrayNumber[i];
        }
//         thêm giá trị mới vào cuối mảng
        newArray[newArray.length - 1] = value;
        for (int i : newArray) {
            System.out.print(i);
        }
    }
}



