package 链表;

import java.util.Stack;

public class 单链表 {
    public static void main(String[] args) {
        HerolistManager herolistManager=new HerolistManager();
        herolistManager.heroadd(new Herosex(1,"1","1"));
        herolistManager.heroadd(new Herosex(3,"3","3"));
        herolistManager.heroadd(new Herosex(2,"2","2"));
        herolistManager.heroadd(new Herosex(2,"2","2"));

        herolistManager.show();
        herolistManager.lixu();
    }

}


class Herosex{
    public int id;
    public String name;
    public String secondName;
    public Herosex nexthero;

    public Herosex(int id, String name, String secondName) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Herosex{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", nexthero=" + nexthero +
                '}';
    }
}


class HerolistManager{
    private Herosex head = new Herosex(0,"","");


    //添加数组。顺序添加
    public void heroadd(Herosex herosex){
        /**
         * 1 列表为空
         * 2 已经有了
         */
        boolean whether = false;
        Herosex temp = head;
        while (true){

            if (temp.nexthero==null){
                break;
            }
            if (temp.nexthero.id==herosex.id){
                whether=true;
                break;
            }if (temp.nexthero.id>herosex.id){
                break;
            }
            temp=temp.nexthero;
        }
        if (whether){
            System.out.println("人物已经存在");
        }else {
            herosex.nexthero=temp.nexthero;
            temp.nexthero=herosex;

        }
    }


    //显示数组
    public void show(){
        Herosex temp=head;
        while (true){

            if (temp.nexthero==null){
                System.out.println("循环结束");
                break;
            }
            System.out.println(temp);
            temp=temp.nexthero;
        }
    }


    //链表的逆序
    public void lixu(){
        Herosex temp=head;
        Stack<Herosex> stack = new Stack<Herosex>();
        while (true){

            if (temp.nexthero==null){
                System.out.println("循环结束");
                break;
            }
            System.out.println(temp);
            stack.push(temp);
            temp=temp.nexthero;
        }
        while(stack.isEmpty()){
            temp.nexthero=stack.pop();
        }
    }

    //计算链表中的最大值
    public int maxid(){
        Herosex temp=head;
        int maxid=0;
        int index=0;
        int number=0;

        while (true){

            if (temp.nexthero==null){
                System.out.println("循环结束");
                break;
            }
            if (temp.id>maxid){
                maxid=temp.id;
                index=number;
            }
            System.out.println(temp);

            temp=temp.nexthero;
            number=number+1;
        }
        return index;
    }

    //个算法将所有小于零的节点移到所有大于等于零的节点的前面。
    public void  storing(){

        Herosex temp=head;
        while (true){

            if (temp.nexthero==null){
                System.out.println("循环结束");
                break;
            }
            if (temp.id>temp.nexthero.id){
                int x;
                x=temp.id;
                temp.id=temp.nexthero.id;
                temp.nexthero.id=x;

            }
            System.out.println(temp);
            temp=temp.nexthero;
        }

    }



}
