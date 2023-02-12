import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class video1_Stream {
    public static void change(String m){
        System.out.println(m.toUpperCase());
    }
    static void converter(int arg){
        System.out.println(Math.abs(arg));
    }
    void doAction(){
        List<Integer> num = Arrays.asList(10, -20, 3, -9, 4, -9);
        num.forEach(video1_Stream::converter);
    }
    public static void main(String[] args){
        ArrayList<String> lang = new ArrayList<String>();
        lang.add("Java");
        lang.add("CSharp");
        lang.add("Python");
        lang.add("PHP");
        lang.forEach(video1_Stream::change);

        video1_Stream ob = new video1_Stream();
        ob.doAction();

        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> mls =myList.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(mls);
    }
}
