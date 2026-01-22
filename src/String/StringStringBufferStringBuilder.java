package String;

public class StringStringBufferStringBuilder {
    public static void main(String[] args) {
        String str="Hello";
       //str.concat(" World");
        //str+=" World";
        System.out.println(str);
// StringBuilder (mutable)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // sb = "Hello World"

// StringBuffer (thread-safe)
        StringBuffer sbf = new StringBuffer("Hi");
        sbf.append(" There"); // sbf = "Hi There"
    }
}
