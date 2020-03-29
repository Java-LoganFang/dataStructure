package 排序;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 800w 条   一秒
 * 8000w 条   十一秒
 */
public class 快速排序 {

    public static void main(String[] args) {
        //int arr[] = {-9,78,0,23,-567,70};
        int arr[] = new int[80000000];
        for (int i = 0; i < 80000000; i++) {
            arr[i] = (int) (Math.random() * 800000000);
        }

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(date);
        System.out.println("排序前的时间是" + date1Str);


        KuickSort(arr,0,arr.length-1);

        Date date1 = new Date();
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str1 = simpleDateFormat.format(date1);
        System.out.println("排序前的时间是" + date1Str1);


        //System.out.println(Arrays.toString(arr));

    }


    public static void KuickSort(int arry[], int left, int rigth) {
        int l = left;
        int r = rigth;
        int temp = 0;
        int pivot = arry[(l + r) / 2];
        while (l < r) {

            while (arry[l] < pivot) {
                l+=1;
            }
            while (arry[r]>pivot){
                r-=1;
            }
            if (l>=r){
                break;
            }

            //交换两个数
            temp = arry[l];
            arry[l]=arry[r];
            arry[r]=temp;

            if (arry[l]==pivot){
                r-=1;
            }
            if (arry[r]==pivot){
                l+=1;
            }
        }

        //如果l==r,必须l++,r--,否则出现栈溢出
        if (l==r){
            l +=1;
            r -=1;
        }
        //向左递归
        if (left<r){
            KuickSort(arry,left,r);
        }

        if (rigth>l){
            KuickSort(arry,l,rigth);
        }


    }


}



