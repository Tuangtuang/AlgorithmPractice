/**
 * @program: 剑指offer
 * @description: 第一个只出现一次的字符
 * @author: tyq
 * @create: 2020-05-21 19:44
 **/
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if (str.length() == 1) {
            return 0;
        }
        if (str.length() == 0) {
            return -1;
        }
        int[] alphabet = new int[52];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            int index = -1;
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else {
                index = str.charAt(i) - 'A' - 6;
            }
            System.out.println(index);
            if (alphabet[index] == -1) {
                alphabet[index] = i;
            } else {
                alphabet[index] = -2;
            }
        }
        int first = str.length() - 1;
        boolean exist = false;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != -1 &&alphabet[i] != -2 && alphabet[i] <= first) {
                first = alphabet[i];
                exist = true;
            }
        }
        if (exist) {
            return first;
        }
        return -1;
    }
}
