package lab09;
import java.util.List;
import java.util.ArrayList;

public class ThirdPartyJavaApi {
    public void doSomething(List<String> words) {
        System.out.println("do something useful");
    }
     
    public List<String> getWordList() {
        List<String> words = new ArrayList<String>();
        words.add("java");
        words.add("loves");
        words.add("boilerplate");
        return words;
    }
}
