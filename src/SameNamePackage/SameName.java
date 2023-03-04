package SameNamePackage;

public class SameName {
    public String name;
    public int age;

    public SameName(String name, int age) {
        this(18);
        this.name = name;
    }

    public SameName(int age) {
        this.age = age;
    }
}
