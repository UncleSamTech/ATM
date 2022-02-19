public class RaoClass {
    private String name;
    private int age;
    private String complexion;
    private void OuterRaoMethod(){
        System.out.println("Hey I'm an outer method..can you access me..to bad for static guys");
    }

    public static class InnerRaoStaticClass{

        public static void displayRaoDoubt(){
            //age = 23;
            System.out.println("This is my doubt");
            //OuterRaoMethod();
        }
    }

    public class InnerNonStaticRaoClass{

        public void displayRaoDoubt(){
            age = 23;
            System.out.println("This is my doubt too");
            OuterRaoMethod();
        }
    }
}
