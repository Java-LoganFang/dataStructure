package 教学.堆栈;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 逆波兰计算器 {
    public static void main(String[] args) {
        String suffixExpression = "30 4 + 5 * 6 -";
        List<String> list= new ArrayList<String>();
        for (String str: suffixExpression.split(" ")){
            list.add(str);
        }
        System.out.println(list);
        System.out.println(caculate(list));
    }

    public static  int caculate(List<String> ls){
        Stack<Integer> ns = new Stack<Integer>();
        for (String i : ls){
            if (i.matches("\\d+")){
                ns.push(Integer.parseInt(i));
            }else {
                int num2 = ns.pop();
                int num1 = ns.pop();

                int res = 0;
                if (i.equals("+")){
                    res = num1+num2;
                }else if(i.equals("-")){
                    res = num1-num2;
                }else if (i.equals("*")){
                    res=num1*num2;
                }else if(i.equals("/")){
                    res=num1/num2;
                }else {
                    throw new  RuntimeException("运算结果有误");
                }
                ns.push(res);
            }
        }
        return ns.pop();
    }
}
