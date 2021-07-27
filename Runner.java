public class Runner {
    public static void main(String[] args) {
        bt n=new bt();
        n.addElem(10);
        n.addElem(20);
        n.addElem(5);
        n.addElem(100);
        n.addElem(700);
        // n.preOrder(n.root);
        int height=n.findHeight(n.root);
        n.preOrder(n.root);
        System.out.println("height="+(height-1));
    }
    
}
