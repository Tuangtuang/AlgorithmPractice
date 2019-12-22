/**
 * @program: 剑指offer
 * @description: 替换空格
 * @author: tyq
 * @create: 2019-10-31 16:29
 **/
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        String temp=str.toString();
        String result=temp.replace(" ","%20");
        return result;
    }
}
