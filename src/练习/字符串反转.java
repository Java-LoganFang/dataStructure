package 练习;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class 字符串反转 {
    public static void main(String[] args) {
        String str = "Douyu";


        Stack<Character> list= new Stack<Character>();

        for (char i:str.toCharArray()){

            list.push(i);
        }


        String res="";
        while (list.isEmpty()==false){
            res=res+list.pop().toString();
        }





    }
}
