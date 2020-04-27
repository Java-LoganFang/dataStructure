package 教学.递归;

public class 迷宫回溯 {
    public static void main(String[] args) {
        int[][] map =new int[8][7];
        //上下全部为1
        for (int i = 0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;
        }
        //左右全部为1
        for (int i=0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;
        }
        //设置挡板
        map[3][1]=1;
        map[3][2]=1;

        //输出地图
        for(int i = 0;i<8;i++){
            for (int b=0;b<7;b++){
                System.out.print(map[i][b]+" ");
            }
            System.out.println();
        }


        setWay(map,1,1);
        System.out.println();
        //输出地图
        System.out.println("变形之后的地图");
        for(int i = 0;i<8;i++){
            for (int b=0;b<7;b++){
                System.out.print(map[i][b]+" ");
            }
            System.out.println();
        }



    }

    /**
     * 约定
     *   1 map 表示附图
     *   2 ij 表示起始位置 (1,1)
     *   3 如果可以到 map[6][5]标志可以找到
     *   4 约定 1 表示墙  2  表示可以走   3  表示走过不同   0  表示没有走过
     *   5  确定策略 下-》右-》上-》左
     */
    public static  boolean setWay(int[][] map,int i ,int j){
        if (map[6][5]==2){
            //表示已经找到出口
            return true;
        }else {
            if (map[i][j]==0){
//                map[i][j]=2;
//                if (setWay(map,i+1,j)){ //下
//                    return true;
//                }else if(setWay(map,i,j+1)){//右
//                    return true;
//                }else if(setWay(map,i-1,j)){ //上
//                    return true;
//                }else if(setWay(map,i,j-1)){ //左
//                    return true;
//                }else {
//                    map[i][j]=3;
//                    return false;

                map[i][j]=2;
                if (setWay(map,i,j+1)){//右
                    return true;
                }else if(setWay(map,i+1,j)){ //下
                    return true;
                }else if(setWay(map,i,j-1)){ //左
                    return true;
                }else if(setWay(map,i-1,j)){ //上
                    return true;
                }else {
                    map[i][j]=3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}
