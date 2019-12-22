/**
 * @program: 剑指offer
 * @description: 矩型覆盖
 * @author: tyq
 * @create: 2019-10-31 20:42
 **/
public class RectangleCover {
    public int RectCover(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        if(target==0){
            return 0;
        }
        return RectCover(target-1)+RectCover(target-2);
    }
}
