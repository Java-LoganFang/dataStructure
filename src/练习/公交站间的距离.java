package 练习;

/**
 * 环形公交路线上有 n 个站，按次序从 0 到 n - 1 进行编号。我们已知每一对相邻公交站之间的距离，distance[i] 表示编号为 i 的车站和编号为 (i + 1) % n 的车站之间的距离。
 *
 * 环线上的公交车都可以按顺时针和逆时针的方向行驶。
 *
 * 返回乘客从出发点 start 到目的地 destination 之间的最短距离。
 *
 *  
 *
 */
public class 公交站间的距离 {
    public static void main(String[] args) {
       int[] distance = {3,6,7,2,9,10,7,16,11};
        //int[] distance={7,10,1,12,11,14,5,0};
        int start = 6;
        int destination = 2;
        System.out.println(number(distance,start,destination));

    }

    public static int number(int[] distance, int start, int destination){
        int number1 = 0;
        int number2 = 0;

        if (start<destination){

            for (int i =0;i<distance.length;i++){
                if (i<start || i>=destination){
                    number1 = number1+distance[i];
                }else {
                    number2 = number2 + distance[i];
                }
            }

        }else {
            for (int i =0;i<distance.length;i++){
                if (i<destination || i>=start){
                    number1 = number1+distance[i];
                }else {
                    number2 = number2 + distance[i];
                }
            }
        }


        return Math.min(number1,number2);
    }
}
