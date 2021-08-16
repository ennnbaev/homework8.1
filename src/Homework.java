import java.util.ArrayList;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        List<String> example=new ArrayList<>();
        example.add("Hello");
        example.add("my");
        example.add("name");
        example.add("is");
        example.add("Danil");
        System.out.println(backwards(example));
    }
    public static List backwards(List<String>example){
        List<String>result=new ArrayList<>();
        for(int i=example.size()-1;i>=0;i--){
            result.add(example.get(i));
        }
        return result;
    }
}
