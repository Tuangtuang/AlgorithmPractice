import java.util.ArrayList;

/**
 * @program: 剑指offer
 * @description: 数组中只出现一次的数字
 * @author: tyq
 * @create: 2020-05-23 16:57
 **/
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array.length <= 1) {
            return;
        }
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            res ^= array[i];
        }
        int oneIndex = -1;
        while (res != 0) {
            oneIndex++;
            if ((res & 1) != 1) {
                res = res >> 1;
            } else {
                break;
            }
        }
        int num = (int) Math.pow(2, oneIndex);
        ArrayList<Integer> group1 = new ArrayList<>();
        ArrayList<Integer> group2 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & num) == num) {
                group1.add(array[i]);
            } else {
                group2.add(array[i]);
            }
        }
        res = group1.get(0);
        for (int i = 1; i < group1.size(); i++) {
            res ^= group1.get(i);
        }
        num1[0] = res;
        res = group2.get(0);
        for (int i = 1; i < group2.size(); i++) {
            res ^= group2.get(i);
        }
        num2[0] = res;
        return;
    }
}
