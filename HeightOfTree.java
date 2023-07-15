importjava.util.*;
public class HeightOfTree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
         return Math.max(lh, rh) + 1;




   }

    public static int count (Node root) {
        if(root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
   }

   public static int sum(Node root) {
        if(root ==null) {
            return 0;
            
        }

            int leftSum = sum(root.left);
            int rightSum  = sum(root.right);
            return leftSum + rightSum + root.data;

    }
    public static int daimeter(Node root) {
        if(root == null) {
            return 0;

        }

        int leftDiam = daimeter(root.left);
        int leftrHeight = height(root.left);
        int rightDiam = daimeter(root.right);
        int rightHeight  = height(root.right);
        int selfDiam = leftrHeight + rightHeight +1;
         return Math.max( selfDiam, Math.max(leftDiam, rightDiam));





    }
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter2(Node root){
        if(root== null) {
            return new Info(0,0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max( Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht +1 );
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }  
    
    

    public static boolean isIdentical(Node node, Node subRoot) {
        if(node == null && subRoot == null){
            return false;

        } else if(node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if(!isIdentical(node.left, subRoot. left)) {
            return false;
        }
        if(!isIdentical(node.right,  subRoot.right)){
            
        }

    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null) {
            return false;
        }
        if(root.data == subRoot.data) {
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }

         boolean leftAns = isSubtree(root.left, subRoot); // leftsubtree -> true
         boolean rightAns = isSubtree(root.right, subRoot);

         return leftAns || rightAns;
    }
    public static void main(String[] args) {
        /*
         *        1
         *       / \
         *      2   3
         *    /  \   /  \
         *   4    5  6   7
         *      
         * 
         *        
         * 
         */
          
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);

         //System.out.println(height(root));
        // System.out.println(count(root));
       // System.out.println(sum(root));
       // System.out.println(daimeter(root));

       //System.out.println(diameter2(root).diam);

       /**         2
        *        /   \
                4      5

        
        */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);


       System.out.println(isSubtree(root, subRoot));



        
        
    }
    
}

