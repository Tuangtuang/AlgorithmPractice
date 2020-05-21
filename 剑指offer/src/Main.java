import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        testStringReplace();
//        createLinkedList();
//        testReverPrintLinkedList();
//        reconstructTreeTest();
//        testMinNumberRotateArray();
//        testFibo();
//        testFrog();
//        testNumberOfOne();
//        testReorderArray();
//        testFindkTh();
//        testReverLink();
//        testMergeList();
//        testMirrorTree();
//        testPrintMatrix();
//        testBinaryTreePrint();
//        testVerifySquenceOfBST();
//        test_MoreThanHalfNum_Solution();
        test_PrintMinNumber();
    }

    /**
    * @Description: 矩阵查找测试函数
    * @Param: []
    * @return: void
    * @Author: tyq
    * @Date: 2019-10-31
    */
    static void testMatrixFind(){
        int [][]arr={
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };
        int target=7;
        MatrixFind matrixFind=new MatrixFind();
        System.out.println(matrixFind.FindTwoDimension(target,arr));
    }

    static void testStringReplace(){
        StringBuffer test=new StringBuffer("Happy New Year ");
        ReplaceSpace replaceSpace=new ReplaceSpace();
        System.out.println(replaceSpace.replaceSpace(test));

    }

    static ListNode createLinkedList(){
        ListNode listNode=new ListNode(0);
        ListNode p=listNode;
        for(int i=1;i<=10;i++){
            p.next=new ListNode(i);
            p=p.next;
        }

        return listNode;
    }

    static void testReverPrintLinkedList(){
        ListNode test=createLinkedList();
        ListNode t=test;
        while (t!=null){
            System.out.print(t.val+" ");
            t=t.next;
        }
        ReversePrintLinkedList reversePrintLinkedList=new ReversePrintLinkedList();
        ArrayList<Integer> temp=reversePrintLinkedList.printListFromTailToHead(test);
        for(int i=0;i<temp.size();i++){
            System.out.print(temp.get(i)+" ");

        }
    }

    static void displayTree(TreeNode node,int level){
        if(node!=null){
            displayTree(node.right,level+1);
            System.out.println();
            for(int i=0;i<level-1;i++){
                System.out.print(" ");
            }
            System.out.print(node.val);
            displayTree(node.left,level+1);
        }
    }

    static void reconstructTreeTest(){
        int []pre={1,2,4,7,3,5,6,8};
        int []in={4,7,2,1,5,3,8,6};
        ReconstructBinaryTree reconstructBinaryTree=new ReconstructBinaryTree();
        TreeNode root=reconstructBinaryTree.reConstructBinaryTree(pre,in);
        displayTree(root,1);
    }


    static void testMinNumberRotateArray(){
        int []test={3,4,5,1,2};
        MinNumberInRotateArray minNumberInRotateArray=new MinNumberInRotateArray();
        int res=minNumberInRotateArray.minNumberInRotateArray(test);
        System.out.println(res);

    }

    static void testFibo(){
        Fibonacci fibonacci=new Fibonacci();
        System.out.println(fibonacci.fibonacci(4));
    }

    static void testFrog(){
        JumpFrog jumpFrog=new JumpFrog();
        System.out.println(jumpFrog.JumpFloorII(1));
    }

    static void testNumberOfOne(){
        NumberOfOne numberOfOne=new NumberOfOne();
        int res=numberOfOne.NumberOf1(-2147483648);
        System.out.println(res);
    }

    static void  testReorderArray(){
        int []array={0,1,2,3,4,5,6,7,8,9};
        ReOrderArray reOrderArray=new ReOrderArray();
//        reOrderArray.reOrderArray(array,0,array.length-1);
        reOrderArray.reOrderArrayPos(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    static void testFindkTh(){
        ListNode head=createLinkedList();
        FindKthToTail findKthToTail=new FindKthToTail();
        ListNode res=findKthToTail.findKthToTail(head,12);
        System.out.print(res.val+" ");
    }

    static void displayLinkedList(ListNode head){
        ListNode p=head;
        while (p!=null){
            System.out.print(p.val+" ");
            p=p.next;
        }
    }

    static void testReverLink(){
        ListNode head=createLinkedList();
        displayLinkedList(head);
        System.out.println();
        ReverseList reverseList=new ReverseList();
        ListNode newHead=reverseList.reverseList(head);
        displayLinkedList(newHead);
    }

    static void testMergeList(){
        ListNode head1=createLinkedList();
        displayLinkedList(head1);
        System.out.println();
        ListNode head2=createLinkedList();
        displayLinkedList(head2);
        System.out.println();
        ListMerge listMerge=new ListMerge();
        ListNode res=listMerge.Merge(head1,head2);
        displayLinkedList(res);
    }

    static void testMirrorTree(){
        int []pre={1,2,4,7,3,5,6,8};
        int []in={4,7,2,1,5,3,8,6};
        ReconstructBinaryTree reconstructBinaryTree=new ReconstructBinaryTree();
        TreeNode root=reconstructBinaryTree.reConstructBinaryTree(pre,in);
        displayTree(root,1);
        MirrorBinaryTree mirrorBinaryTree=new MirrorBinaryTree();
        mirrorBinaryTree.Mirror(root);
        System.out.println("***************");
        displayTree(root,1);
    }

    static void testPrintMatrix(){
        int [][]arr={
                {1},
                {2},
                {4},
                {6}
        };
        PrintMatrixClock printMatrixClock=new PrintMatrixClock();
        ArrayList<Integer> res=printMatrixClock.printMatrix(arr);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }

    }

    static void testBinaryTreePrint(){
//        int []pre={1,2,4,7,3,5,6,8};
//        int []in={4,7,2,1,5,3,8,6};
//        ReconstructBinaryTree reconstructBinaryTree=new ReconstructBinaryTree();
//        TreeNode root=reconstructBinaryTree.reConstructBinaryTree(pre,in);
//        displayTree(root,1);
        PrintBinaryTree printBinaryTree=new PrintBinaryTree();
        printBinaryTree.PrintFromTopToBottom(null);
    }

    static void testVerifySquenceOfBST(){
        int []temp={4,8,5,6};
        BSTreeVerify bsTreeVerify=new BSTreeVerify();
        boolean res=bsTreeVerify.VerifySquenceOfBST(temp);
        System.out.println(res);
    }

    static void test_MoreThanHalfNum_Solution(){
        int[] temp=new int[]{1,2,3,2,2,2,5,4,2};
        MoreThanHalfNum moreThanHalfNum = new MoreThanHalfNum();
        int res=moreThanHalfNum.MoreThanHalfNum_Solution(temp);
        System.out.println(res);
    }

    static void test_PrintMinNumber(){
        int[] temp=new int[]{3,32,321};
        PrintMinNumber printMinNumber=new PrintMinNumber();
        System.out.println(printMinNumber.PrintMinNumber(temp));
    }
}
