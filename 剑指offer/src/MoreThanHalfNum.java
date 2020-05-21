/**
 * @program: 剑指offer
 * @description: 数组中出现次数超过一半的数字
 * @author: tyq
 * @create: 2020-05-20 19:21
 **/
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int soldier = array[0];
        int time = 1;
        for (int i = 1; i < array.length; i++) {
            if (soldier != array[i]) {
                time--;
            } else {
                time++;
            }
            if (time == 0) {
                soldier = array[i];
                time = 1;
            }
        }
        time=0;
        for (int i = 0; i < array.length; i++) {
            if(soldier==array[i]){
                time++;
            }
        }
        if(time>array.length/2){
            return soldier;
        }
        return 0;
    }
}
