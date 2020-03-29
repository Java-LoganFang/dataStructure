package 排序;

import java.util.Arrays;

public class 冒泡排序 {
    public static void main(String[] args) {
       int arr[] = {3, 9, -1, 10, -2};
        //int arr[] = {1, 2, 6, 4, 6, 5};
        int temp = 0;//零时变量用于交换


        System.out.println("原始数组" + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            boolean whether_change = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    whether_change = true;
                }
            }
            if (!whether_change) {
                System.out.println("提前结束");
                System.out.println("第" + i + "次排序" + Arrays.toString(arr));
                break;
            }
            System.out.println("第" + i + "次排序" + Arrays.toString(arr));

        }


    }


}
