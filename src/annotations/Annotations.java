package annotations;

public class Annotations {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.oldMethod();
        p.newMethod();
        Child c = new Child();
        c.theMethodToSayWhatItIs();
    }
}
