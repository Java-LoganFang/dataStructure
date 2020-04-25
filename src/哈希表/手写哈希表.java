package 哈希表;

public class 手写哈希表 {
    public static  void main(String[] args) {
        EmpLinkedList[] empLinkedLists = new EmpLinkedList[3];
        for(int i=0;i<empLinkedLists.length;i++){
            empLinkedLists[i] = new EmpLinkedList();
        }
        table table = new table(empLinkedLists);

        Emp stu1 = new Emp(1,"1");
        table.add(stu1);
        Emp stu14 = new Emp(1,"1");
        table.add(stu14);
        Emp stu2 = new Emp(2,"2");
        table.add(stu2);
        Emp stu3 = new Emp(3,"3");
        table.add(stu3);

        table.show2();


    }



    static class table{
        private EmpLinkedList[] empLinkedLists;
        public void add(Emp emp){
            int id = emp.id%3;
            empLinkedLists[id].add2(emp);
        }


        public void show2(){
            for (EmpLinkedList i : empLinkedLists){
                i.show();
            }
        }

        public table(EmpLinkedList[] empLinkedLists){
            this.empLinkedLists=empLinkedLists;
        }
    }


    //员工
    static class Emp{
        public int id;
        public String name;
        public Emp next;
        public Emp(int id,String name){
            super();
            this.id=id;
            this.name=name;
        }
    }

    //链表
    static class EmpLinkedList{
        private Emp head;


        public EmpLinkedList(){
            super();
        }


        //添加
        public void add2(Emp emp){
            Emp temp = head;
            if (head==null){
                head=emp;
                return;
            }
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=emp;
        }


        //显示
        public void show(){
            if (head==null){
                System.out.println("链表为空!");
                return;
            }
            System.out.println(head.id);
            Emp temp = head;
            while (temp.next!=null){
                System.out.println(temp.id);
                temp = temp.next;
            }


        }

    }

}
