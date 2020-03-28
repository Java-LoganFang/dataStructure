package 递归;

public class 八皇后问题 {
    int max = 8;
    //定义一维数组表示棋盘
    int[] arry = new int[max];

    static int count = 0;


    public static void main(String[] args) {
        八皇后问题 queer = new 八皇后问题();
        queer.chexk(0);
        System.out.printf("一共有%d种解法",count);
    }


    //判断第n个皇后之前的所有皇后的位置是否正确
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (arry[n]==arry[i] || Math.abs(n-i)==Math.abs(arry[n]-arry[i])){
                return false;
            }
        }
        return true;
    }

    //开始回溯  n表示第n个皇后   for循环表示从第一个开始  循环输出
    private void chexk(int n){
        if (n==max){
            printArry();
            count ++;
            return;
        }
        for (int i=0;i<max;i++){
            arry[n]=i;
            if (judge(n)){
                chexk(n+1);
            }
        }
    }



    //显示结果
    private void printArry(){
        for (int i = 0;i<max;i++){
            System.out.print(arry[i]);
        }
        System.out.println();


    }
}
