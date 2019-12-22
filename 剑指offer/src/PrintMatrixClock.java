import java.util.ArrayList;

/**
 * @program: 剑指offer
 * @description: 顺时针打印矩阵
 * @author: tyq
 * @create: 2019-11-01 16:22
 **/
public class PrintMatrixClock {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int [][]record=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                record[i][j]=0;
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        int i=0,j=0;

        record[0][0]=1;
        result.add(matrix[0][0]);
        while(CanMoveRight(i,j,rows,cols,record)==true){
            j++;record[i][j]=1;result.add(matrix[i][j]);
        }
        while (CanMoveRight(i,j,rows,cols,record)||CanMoveLeft(i,j,rows,cols,record)||CanMoveUp(i,j,rows,cols,record)||CanMoveDown(i,j,rows,cols,record)){
            while (CanMoveUp(i,j,rows,cols,record)){
                i--;record[i][j]=1;result.add(matrix[i][j]);
            }
            while (CanMoveDown(i,j,rows,cols,record)){
                i++;record[i][j]=1;result.add(matrix[i][j]);
            }
            while (CanMoveLeft(i,j,rows,cols,record)){
                j--;record[i][j]=1;result.add(matrix[i][j]);
            }
            while (CanMoveRight(i,j,rows,cols,record)){
                j++;record[i][j]=1;result.add(matrix[i][j]);
            }
        }
        return result;
    }

    public boolean CanMoveDown(int i, int j, int rows,int cols,int [][]record){
        if(i<rows&&i>=0){
            if(i+1<rows){
//                System.out.print(i+1+" "+j+" ");
                if(record[i+1][j]==0){
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public boolean CanMoveUp(int i, int j, int rows,int cols,int [][]record){
        if(i<rows&&i>0){
            if(i-1>=0){
                if(record[i-1][j]==0){
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public boolean CanMoveRight(int i, int j, int rows,int cols,int [][]record){
        if(j<cols&&j>=0){
            if(j+1<cols){
                if(record[i][j+1]==0){
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }
    }


    public boolean CanMoveLeft(int i, int j, int rows,int cols,int [][]record){
        if(j<cols&&j>0){
            if(j-1>=0){
                if(record[i][j-1]==0){
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
