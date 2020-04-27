package 教学.查找;

public class 二分查找 {
    public static void main(String[] args) {
        int[] arry = {1,2,3,3,4,5,7};
        set2Myself(arry,arry.length-1,0,3);


    }

    public static void  setMyself(int[] arry,int max, int min,int value){
        if(min > max){
            System.out.println("需要的数据不存在");
            return;
        }
         int mind = (max + min)/2;
         if (arry[mind] > value){
             max = min-1;
             setMyself(arry, max, min, value);
         }else if(arry[mind] < value){
             min = mind+1;
             setMyself(arry, max, min, value);
         }else if(arry[mind] ==value){
             System.out.println(value);
             System.out.println(mind);
         }

    }


    /**
     * 差值查找算法
     * @param arry
     * @param max
     * @param min
     * @param value
     */
    public static void  set2Myself(int[] arry,int max, int min,int value){
        if(min > max){
            System.out.println("需要的数据不存在");
            return;
        }
        //int mind = (max + min)/2;  min + 1/2(max-min)
        int mind = min + ((value-min)/(max-min))*(max-min);

        if (arry[mind] > value){
            max = min-1;
            set2Myself(arry, max, min, value);
        }else if(arry[mind] < value){
            min = mind+1;
            set2Myself(arry, max, min, value);
        }else if(arry[mind] ==value){
            System.out.println(value);
            System.out.println(mind);
        }

    }
}
