package 教学.二叉树;

public class 二叉树查询与删除 {

    public static void main(String[] args) {
        BinaryTree2 binaryTree = new BinaryTree2();

        HeroNode2 root = new HeroNode2(1,"松江");
        HeroNode2 node2 = new HeroNode2(2,"无用");
        HeroNode2 node3 = new HeroNode2(3,"卢俊义");
        HeroNode2 node4 = new HeroNode2(4,"林冲");
        HeroNode2 node5 = new HeroNode2(5,"关胜");
        root.setLeft(node2);
        root.setRigth(node3);
        node3.setRigth(node4);
        node3.setLeft(node5);


        binaryTree.setRoot(root);


        binaryTree.TreeFindeLeft(5);

        binaryTree.TreeDeleteRight(5);



        binaryTree.TreeFindMind(5);
        binaryTree.TreeFindRight(5);


    }
}




/**
 * 二叉树节点
 */
class BinaryTree2{
    private HeroNode2 root;

    public void setRoot(HeroNode2 root) {
        this.root = root;
    }


    public void TreeDeleteRight(int no){
        if (root==null){
            System.out.println("空树");
        }else {
            if (this.root.id==no){
                this.root=null;
            }else {
                this.root.deleateLeft(no);
            }
        }
    }

    public void TreeFindeLeft(int no){
        if (this.root==null){
            System.out.println("树为空");
        }else {
            System.out.println(this.root.FindInLeft(no));
        }
    }

    public void TreeFindMind(int no){
        if (this.root==null){
            System.out.println("树为空");
        }else {
            System.out.println(this.root.FindInMind(no));
        }
    }

    public void TreeFindRight(int no){
        if (this.root==null){
            System.out.println("树为空");
        }else {
            System.out.println(this.root.FindInRight(no));
        }
    }



}

/**
 * 英雄节点
 */
class HeroNode2{
    public int id;
    public String name;
    public HeroNode2 left;
    public HeroNode2 rigth;
    public HeroNode2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public HeroNode2() {

    }

    public void setLeft(HeroNode2 left) {
        this.left = left;
    }

    public void setRigth(HeroNode2 rigth) {
        this.rigth = rigth;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    //前序删除
    public void deleateLeft(int no){
        if ( this.left!=null && this.left.id==no){
                this.left=null;
        }
        if (this.rigth!=null && this.rigth.id==no){
            this.rigth=null;
        }

        if (this.left!=null){
            this.left.deleateLeft(no);
        }
        if (this.rigth!=null){
            this.rigth.deleateLeft(no);
        }

    }

    //中序删除
    public void deleateMind(int no){

    }

    //后续删除
    public void deleateRigtht(int no){

    }


    /**
     * 前序查找
     */

    public HeroNode2 FindInLeft(int no){
        System.out.println("进入前序遍历");
        if (this.id==no){
            return this;
        }
        HeroNode2 heroNode2 = null;
        if (this.left!=null){
            heroNode2=this.left.FindInLeft(no);
        }
        if (heroNode2!=null){
            return heroNode2;
        }
        if (this.rigth!=null){
            heroNode2=this.rigth.FindInLeft(no);
        }
        return heroNode2;
    }



    public HeroNode2 FindInMind(int no){


        HeroNode2 heroNode2 = null;
        if (this.left!=null){
            heroNode2=this.left.FindInMind(no);
        }
        if (heroNode2!=null){
            return heroNode2;
        }

        System.out.println("进入中序遍历");
        if (this.id==no){
            return this;
        }


        if (this.rigth!=null){
            heroNode2=this.rigth.FindInMind(no);
        }
        return heroNode2;
    }




    public HeroNode2 FindInRight(int no){



        HeroNode2 heroNode2 = null;
        if (this.left!=null){

            heroNode2=this.left.FindInRight(no);
        }

        if (heroNode2!=null){

            return heroNode2;
        }

        if (this.rigth!=null){

            heroNode2=this.rigth.FindInRight(no);
        }

        if (heroNode2!=null){

            return heroNode2;
        }


        System.out.println("进入后续遍历");
        if (this.id==no){

            return this;
        }

        return heroNode2;
    }




}
