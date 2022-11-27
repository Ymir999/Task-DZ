package Expample3;

public class Grandparent {
    String name;
    int age;

    public Grandparent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printAge()
    {
        System.out.println("I am " + age + " years old ");
    }
    public void printWhoAreYou()
    {
        System.out.println("I am Grandparent, " + name);
    }
}
