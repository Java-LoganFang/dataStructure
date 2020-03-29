package 排序;

import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        int arry[] = {4,3,2,6,3,9};
        dubbo(arry);
        System.out.println(Arrays.toString(arry));

    }

    public static void dubbo(int arry[]){
        for (int i=0;i<arry.length-1;i++){
            int max = 0 ;
            int temp=0;
            for (int j = i+1;j<arry.length;j++){
                if (arry[i]>arry[j]){
                    temp = arry[i];
                    arry[i]=arry[j];
                    arry[j]=temp;
                }
            }

        }
    }
}
