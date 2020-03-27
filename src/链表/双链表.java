package 链表;


public class 双链表 {
    public static void main(String[] args) {
        HeroMan herolistManager = new HeroMan();
        HeroMan.heroadd2(new Hero(1, "1", "1"));
        HeroMan.heroadd2(new Hero(3, "3", "3"));
        HeroMan.heroadd2(new Hero(2, "2", "2"));
        HeroMan.heroadd2(new Hero(2, "2", "2"));
        HeroMan.herrobyid(new Hero(4, "4", "4"), 2);
        HeroMan.deleatebyid(2);
        HeroMan.selectMax();
    }

}


class Hero {
    public Hero onhero;
    public int id;
    public String name;
    public String secondName;
    public Hero nexthero;

    public Hero(int id, String name, String secondName) {
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

class HeroMan {
    private static Hero head = new Hero(0, "", "");


    //添加数组。顺序添加
    public static void heroadd2(Hero herosex) {
        /**
         * 1 列表为空
         * 2 已经有了
         */
        boolean whether = false;
        Hero temp = head;
        while (true) {

            if (temp.nexthero == null) {
                break;
            }
            if (temp.nexthero.id == herosex.id) {
                whether = true;
                break;
            }
            if (temp.nexthero.id > herosex.id) {
                break;
            }
            temp = temp.nexthero;
        }
        if (whether) {
            System.out.println("人物已经存在");
        } else {
            herosex.onhero = temp;
            herosex.nexthero = temp.nexthero;
            temp.nexthero = herosex;

        }
    }


    //在指定位置插入数据
    public static void herrobyid(Hero herosex, Integer id) {

        /**
         * 1 列表为空
         * 2 已经有了
         */
        int index = 0;
        boolean whether = false;
        Hero temp = head;
        while (true) {

            if (index == id) {
                Hero num1 = temp.onhero;
                Hero num2 = temp;
                num1.nexthero = herosex;
                herosex.onhero = num1;
                herosex.nexthero = num2;
                num2.onhero = herosex;

            }
            index = index + 1;
        }
    }


    //删除指定元素
    public static void deleatebyid(Integer id) {

        /**
         * 1 列表为空
         * 2 已经有了
         */
        int index = 0;
        boolean whether = false;
        Hero temp = head;
        while (true) {

            if (index == id) {
                if (temp.nexthero == null) {
                    temp.onhero.nexthero = null;
                } else {
                    Hero num1 = temp.onhero;
                    Hero num2 = temp.nexthero;
                    num1.nexthero = num2;
                    num2.onhero = num1;

                }
            }
            index = index + 1;
        }
    }


    //查询最大节点的序号
    public static int selectMax() {
        Hero temp = head;
        int maxid = 0;
        int index = 0;
        int number = 0;

        while (true) {

            if (temp.nexthero == null) {
                System.out.println("循环结束");
                break;
            }
            if (temp.id > maxid) {
                maxid = temp.id;
                index = number;
            }
            System.out.println(temp);

            temp = temp.nexthero;
            number = number + 1;
        }
        return index;

    }

    //删除重复节点
    public static void deleteMore(){
        Hero temp = head;
        while (true) {

            if (temp.nexthero == null) {
                System.out.println("循环结束");
                break;
            }
            if (temp.id == temp.nexthero.id) {
                Hero num1 = temp.onhero;
                Hero num2 = temp.nexthero;
                num1.nexthero = num2;
                num2.onhero = num1;
            }
            System.out.println(temp);
            temp = temp.nexthero;
        }
    }

    //合并两个节点
//    public static void thoToone(){
//        Hero temp1 = head1;
//        Hero temp2 = head2;
//
//        while (true) {
//
//            //合并两个列表
//            if (temp1.nexthero == null) {
//                temp1.nexthero=temp2;
//                System.out.println("循环结束");
//                break;
//            }
//            temp1 = temp1.nexthero;
//        }
//
//        while (true){
//            Hero a = temp1;
//            if (a.nexthero==null){
//                System.out.println("循环结束");
//                break;
//            }else {
//                Hero b = a;
//                while (true){
//                    if (b.nexthero==null){
//                        break;
//                    }else if (a.id>b.id){
//                        Hero on1 = a.onhero;
//                        Hero next1 = a.nexthero;
//                        Hero on2 = b.onhero;
//                        Hero next2 = b.nexthero;
//                        on1.nexthero=b;
//                        b.nexthero=next1;
//                        b.onhero=on1;
//                        next1.onhero=b;
//                        on2.nexthero=a;
//                        a.nexthero=next2;
//                        a.onhero=on2;
//                        on2.onhero=a;
//                    }
//                    b=b.nexthero;
//
//
//                }
//            }
//
//
//            a=a.nexthero;
//
//        }
//    }

}


