package education.cursor.milestone1;

public class MilestoneMain1 {

    public static void main(String[] args) {

        Functional1<String, Number> concatenation = (element1, element2) -> element1 + element2.toString();
        System.out.println(concatenation.concatenate("abc", 123));

    }
}
