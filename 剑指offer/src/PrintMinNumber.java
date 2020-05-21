import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: 剑指offer
 * @description: 把数组排成最小的数
 * @author: tyq
 * @create: 2020-05-20 19:52
 **/
public class PrintMinNumber {
    public String PrintMinNumber(int[] numbers) {
        if (numbers.length == 0) {
            return "";
        }
        if (numbers.length == 1) {
            return numbers[0] + "";
        }
        String[] numberString = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numberString[i] = numbers[i] + "";
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        };
        Arrays.sort(numberString, comparator);
        String res = "";
        for (int i = 0; i < numberString.length; i++) {
            res += numberString[i];
        }
        return res;
    }
}
