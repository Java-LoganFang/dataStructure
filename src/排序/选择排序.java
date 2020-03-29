package 排序;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 8w数据  9秒
 */
public class 选择排序 {
    public static void main(String[] args) {
//        int arry[] = {4,3,2,6,3,9};

        int arr[] = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 80000000);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(date);
        System.out.println("排序前的时间是" + date1Str);
        dubbo(arr);
        //System.out.println(Arrays.toString(arry));

        Date date1 = new Date();
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是" + date1Str1);


    }

    public static void dubbo(int arry[]) {
        for (int i = 0; i < arry.length - 1; i++) {
            int max = 0;
            int temp = 0;
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[i] > arry[j]) {
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }

        }
    }
}
