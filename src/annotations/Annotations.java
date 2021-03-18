package annotations;

import java.util.ArrayList;
import java.util.List;

public class Annotations {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.oldMethod();
        p.newMethod();
        Child c = new Child();
        c.theMethodToSayWhatItIs();


    }

    @SuppressWarnings({"unchecked", "deprecation"})
    public static void doRiskyThings() {
        Child c = new Child();
        c.oldMethod(); // deprecated static access
        List<Integer> l = new ArrayList();
    }

}
