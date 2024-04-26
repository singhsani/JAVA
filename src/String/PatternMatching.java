package String;

public class PatternMatching {
    /**
     * pattern maching without any library
     *
     * @param str
     * @param s
     * @return
     */
    public static boolean isPatternMatch(String str,String s){
        int cur=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==s.charAt(cur)){
                cur++;
                if(cur==s.length())
                    return true;
            }else{
                cur=0;
            }
        }
        return false;
    }

    /**
     * using inbuild method
     * @param str
     * @param s
     */
    public static boolean isPatternMatchUsingLibrary(String str,String s){
       return str.contains(s);
    }

    public static void main(String[] args) {
        System.out.println(isPatternMatchUsingLibrary("Ram is goodboy","db"));
        String str="Hello";
        System.out.println(str.startsWith("H",4));
    }
}
