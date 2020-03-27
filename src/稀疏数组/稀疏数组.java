package 稀疏数组;

public class 稀疏数组 {
    /**
     * 棋盘大小为11*11
     * 0 代表没有棋子   1代表黑  2代表蓝
     */
    public static void main(String[] args) {
        int arry1[][]= new  int[11][11];
        arry1[1][2]=1;
        arry1[2][3]=2;
        System.out.println("原始的二维数组");
        for (int[] i :arry1 ){
            for (int attems: i){
                System.out.printf("%d  ",attems);

            }
            System.out.println();
        }

        //判断稀疏数组值的个数
        int num =0;
        for(int i =0;i<11;i++){
            for (int j=0;j<11;j++){
                if (arry1[i][j]!=0){
                    num=num+1;
                }
            }
        }
        //给稀疏数组赋值
        int sparearrays[][]=new int[num+1][3];
        sparearrays[0][0]=11;
        sparearrays[0][1]=11;
        sparearrays[0][2]=num;

        int count =1;
        for(int i =0;i<11;i++){
            for (int j=0;j<11;j++){
                if (arry1[i][j]!=0){
                    sparearrays[count][0]=i;
                    sparearrays[count][1]=j;
                    sparearrays[count][2]=arry1[i][j];
                    count=count+1;
                }
            }
        }



        System.out.println("稀疏数组");
        for (int[] i :sparearrays ){
            for (int attems: i){
                System.out.printf("%d  ",attems);

            }
            System.out.println();
        }







    }
}
