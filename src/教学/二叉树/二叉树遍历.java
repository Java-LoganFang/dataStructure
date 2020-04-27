package 教学.二叉树;

public class 二叉树遍历 {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        HeroNode root = new HeroNode(1,"松江");
        HeroNode node2 = new HeroNode(2,"无用");
        HeroNode node3 = new HeroNode(3,"卢俊义");
        HeroNode node4 = new HeroNode(4,"林冲");
        HeroNode node5 = new HeroNode(5,"关胜");
        root.setLeft(node2);
        root.setRigth(node3);
        node3.setRigth(node4);
        node3.setLeft(node5);


        binaryTree.setRoot(root);


        System.out.println("左遍历");
        binaryTree.BindaryTreeleftShow();


        System.out.println("中遍历");
        binaryTree.BindaryTreeMindShow();


        System.out.println("开始删除");
        binaryTree.TreeDeleteRight(3);


        System.out.println("右遍历");
        binaryTree.BindaryTreeRightShow();
    }


}


/**
 * 二叉树节点
 */
class BinaryTree{
    private HeroNode root;

    public void setRoot(HeroNode root) {
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




    public void BindaryTreeleftShow(){
        if (this.root==null){
            System.out.println("二叉树为空");
        }else {
            root.showLeft();
        }
    }


    public void BindaryTreeMindShow(){
        if (this.root==null){
            System.out.println("二叉树为空");
        }else {
            root.showMind();
        }
    }

    public void BindaryTreeRightShow(){
        if (this.root==null){
            System.out.println("二叉树为空");
        }else {
            root.showRigth();
        }
    }

}

/**
 * 英雄节点
 */
class HeroNode{
    public int id;
    public String name;
    public HeroNode left;
    public HeroNode rigth;
    public HeroNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public void setRigth(HeroNode rigth) {
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
        if (this.left!=null && this.left.id==no){
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

    //向左遍历
    public void showLeft(){
        System.out.println(this);
        if (this.left!=null){
            this.left.showLeft();
        }
        if (this.rigth!=null){
            this.rigth.showLeft();
        }
    }


    //中序遍历
    public void showMind(){
        if (this.left!=null){
            this.left.showMind();
        }
        System.out.println(this);
        if (this.rigth!=null){
            this.rigth.showMind();
        }
    }


    //向右遍历
    public void showRigth(){
        if (this.rigth!=null){
            this.rigth.showRigth();
        }
        if (this.left!=null){
            this.left.showRigth();
        }
        System.out.println(this);
    }
}