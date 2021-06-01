import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static boolean isAlphabet(List str)
    {
        return (str.stream().allMatch(s->Character.isLetter((char) s )));
    }
    public static List convert(String str){
        List<Character> characterList = new ArrayList<Character>();
        char arrayChar[] = str.toCharArray();
        for (char aChar : arrayChar) 
        {
            characterList.add(aChar); //  autoboxing 
        }
        return characterList;
        
    }
    public static void main(String[] args) throws Exception {
        String abc = "gouda1";
        String abcd = "gouda";
        List<Character> test1 = convert(abc);
        List<Character> test2 = convert(abcd);
        if (isAlphabet(test1)) {
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }
        if (isAlphabet(test2)) {
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }
        
    }
}
