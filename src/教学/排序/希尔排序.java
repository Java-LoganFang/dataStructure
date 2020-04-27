package 教学.排序;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 希尔排序交换法   8W数据五秒
 *
 *
 * 希尔排序移位法   8W数据一秒不到
 * 希尔排序移位法   80W数据一秒不到
 * 希尔排序移位法   800W数据2秒
 */
public class 希尔排序 {
    public static void main(String[] args) {
//int arry[] = {8, 9, 1, 7, 2, 3, 5, 4, 6,0};
        int arry[] = new int[8000000];
        for (int i = 0; i < 8000000; i++) {
            arry[i] = (int) (Math.random() * 800000000);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(date);
        System.out.println("排序前的时间是" + date1Str);


        shellSort2(arry);


        Date date1 = new Date();
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是" + date1Str1);


        System.out.println("希尔排序" + Arrays.toString(arry));


    }

    //交换法  希尔排序
    public static void shellSort(int[] arry) {

        int time = arry.length;
        while (time != 1) {
            time = time / 2;
            //System.out.println(time);
            int temp = 0;
            for (int i = time; i < arry.length; i++) {
                for (int j = i - time; j >= 0; j -= time) {
                    if (arry[j] > arry[j + time]) {
                        temp = arry[j];
                        arry[j] = arry[j + time];
                        arry[j + time] = temp;
                    }
                }
            }
        }


    }


    //交换法法  希尔排序
    public static void shellSort2(int[] arry) {

        int time = arry.length;
        while (time != 1) {
            time = time / 2;
            //System.out.println(time);
            int temp = 0;
            for (int i = time; i < arry.length; i++) {


                int insertValue = arry[i];
                int insertIndex = i - time;
                while (insertIndex >= 0 && insertValue > arry[insertIndex]) {
                    arry[insertIndex + time] = arry[insertIndex];
                    insertIndex = insertIndex - time;
                }
                arry[insertIndex + time] = insertValue;


            }
        }


    }


}
