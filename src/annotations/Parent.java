package annotations;

public class Parent {

    public void theMethodToSayWhatItIs() {
        System.out.println("I am the parent");
    }

    @Deprecated
    public static void oldMethod() {
        System.out.println("old way of doing things.");
    }
    public static void newMethod() {
        System.out.println("new way of doing things");
    }
}
