package DynamicProcess;

/**
 * @program: algorithm_class
 * @description: 最长公共子序列
 * @author: tyq
 * @create: 2019-11-02 19:34
 **/
public class LCSlength {
    public int getLCSlength(String x,String y,int [][]record){
        int rows=x.length()+1;
        int cols=y.length()+1;
//        用result来记录结果
//        用record来记录是那种方式得到的最大字段和
        int [][]result=new int[rows][cols];
//        如果有一个String长度是0，那么最大子段和一定是0
        for(int i=0;i<rows;i++){
            result[i][0]=0;
        }
        for(int j=0;j<cols;j++){
            result[0][j]=0;
        }
//        开始计算最大字段和
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    result[i][j]=result[i-1][j-1]+1;
                    record[i][j]=1;
                }else {
                    if(result[i-1][j]>=result[i][j-1]){
                        result[i][j]=result[i-1][j-1];
                        record[i][j]=2;
                    }else {
                        result[i][j]=result[i][j-1];
                        record[i][j]=3;
                    }
                }
            }
        }
        displayLCS(record,rows-1,cols-1,x,y);
        System.out.println();
        return result[rows-1][cols-1];

    }

//    输出最大字段和
    public void displayLCS(int [][]record,int i,int j,String x,String y){
        if(i==0||j==0){
            return;
        }
        if(record[i][j]==1){
            displayLCS(record,i-1,j-1,x,y);
            System.out.print(x.charAt(i-1)+" ");
        }else if(record[i][j]==2){
            displayLCS(record,i-1,j,x,y);
        }else {
            displayLCS(record,i,j-1,x,y);
        }
    }
}
