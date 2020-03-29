package 排序;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 8W条数据  1秒
 */
public class 插入排序 {
    public static void main(String[] args) {
        //int arry[] = {3, 2, 2, 1, 5};
        int arry[] = new int[80000];
        for (int i=0;i<80000;i++){
            arry[i] = (int)(Math.random()*80000000);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(date);
        System.out.println("排序前的时间是"+date1Str);




        for (int i = 1;i<arry.length;i++){
            int insertValue = arry[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertValue > arry[insertIndex]) {
                arry[insertIndex + 1] = arry[insertIndex];
                insertIndex--;
            }
            arry[insertIndex+1]=insertValue;
        }
        System.out.println(Arrays.toString(arry));





        Date date1 = new Date();
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是"+date1Str1);
    }
}
