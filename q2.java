public class ReversingString{
    public static String reversingStr(String str) {
        char[] strArr = str.toCharArray();
        int start = 0;
        int finish = str.length() -1;
        while(start < finish){
            char temp = strArr[start];
            strArr[start] = strArr[finish];
            strArr[finish] = temp;
            start++;
            finish--;
        }
        return new String(strArr);
    }
    public static void main(String[] args){
        String str = "lorem ipsum";
        System.out.println(reversingStr(str));
    }
}