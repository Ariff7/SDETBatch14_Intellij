package Class18_This_AND_Inhertance;

public class CatTester {
    public static void main(String[] args) {
        Cat cat=new Cat("kitty",
                "Dsh",10,4);

        cat.printInfo();

        Cat cat2=new Cat("Chinki","Leo");
        cat2.printInfo();
    }
}
