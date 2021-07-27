public class bt {
    Node root;
    public void addElem(int elem)
    {
        if(root==null)
        {
            Node n= new Node();
            n.data=elem;
            root=n;
        }
        else
        {
              position(root,elem);
        }
    }
    private Node position(Node root,int elem) {
        
        if (root==null)
        {
            Node n=new Node();
            n.data=elem;
            return n;
        }
        else if(elem<root.data)
        {
            
            root.left=position(root.left, elem);
           
        }
        else if(elem>root.data)
        {
            root.right=position(root.right, elem);
            
        }
        return root;
        

        
    }
    public void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println("data="+root.data+"height ="+root.height);
        preOrder(root.left);
        preOrder(root.right);
    }
    public int findHeight( Node root){ //FUNCTION TO FIND OUT HEIGHT OF A NODE WHEN REFERENCE TO THAT NODE PASSED
        if(root==null)
        {
            return 0;
        }
        int lHeight=findHeight(root.left);
        int rHeight=findHeight(root.right);
        root.height=max(lHeight,rHeight);
        return (root.height+1);
    }

    
    public int max(int a,int b)// TO FIND MAX OF TWO NUMBERS
    {
        if(a>b)
        {
            return a;
        }
        else
        return b;
    }


    
}
