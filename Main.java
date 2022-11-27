package Expample3;

public class Main {
    public static void main(String[] args) {

        Grandparent grandfather = new Grandparent("Bryce Cusland", 54);
        grandfather.printAge();
        grandfather.printWhoAreYou();
        Grandparent grandmother = new Grandparent("Eleanor Cusland", 46);
        grandmother.printAge();
        grandmother.printWhoAreYou();


        Parent father = new Parent("Aedan Cousland", 31);
        father.printAge();
        father.printWhoAreYou();
        Parent mother = new Parent("Leliana", 29);
        mother.printAge();
        mother.printWhoAreYou();


        Child son = new Child("Adrien Bryce Cousland", 4);
        son.printAge();
        son.printWhoAreYou();
        son.laugh();



    }

}
