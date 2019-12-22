import Search.BinarySearch;
import Sort.MergeSort;
import Sort.QuickSort;

public class Main {

    public static void main(String[] args) {
//        testBinarySerch();
//        testMergeSort();
        testQuickSort();
    }

    public static void testBinarySerch(){
        int []arr={1,2,3};
        BinarySearch binarySearch=new BinarySearch();
        int res=binarySearch.solution(arr,-1);
        System.out.print("result="+res+"\n");
    }

    public static void testMergeSort(){
        int []arr={3,2,1,5,-1,0};
        MergeSort mergeSort=new MergeSort();
        mergeSort.solution(arr,0,arr.length);
        displayArray(arr);
    }

    public static void displayArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void testQuickSort(){
        int []arr={3,2,1,5,-1,0,111,-10};
        QuickSort quickSort=new QuickSort();
        quickSort.quickSortSolution(arr,0,arr.length-1);
        displayArray(arr);
    }

}

