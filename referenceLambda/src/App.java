public class App {
    public static void main(String[] args) throws Exception {
        String s1 = "hello world";
        String s2 = "hello world war z ";
        Bipredict p;
        String longer = MyString.betterString(s1, s2,(a1,a2)->MyString.whichLarger(s1, s2) ); 
        System.out.println(longer);
    }
}
