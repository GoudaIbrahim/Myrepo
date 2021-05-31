import jdk.incubator.vector.VectorOperators.Test;

public class MyString {
    public static String betterString(String s1,String s2, Bipredict<String,String> p){
        return p.test(s1, s2)?s1:s2;
    }
    public static boolean whichLarger(String s1, String s2){
        return s1.length()>s2.length();
    }
    
}
