package lesson1;


public class Main {

    public static void main(String[] args) {

        Course c = new Course(new String[]{"Lake", "Fire", "Barrier"});

        Cat cat = new Cat("Catty", new String[]{"Kitty", "Pretty", "Hotty", "Rocky"});

        Bear bear = new Bear("Grizzy", new String[]{"Pandy", "Barney", "Bobo", "Twinky"});

        Elephant elephant = new Elephant("Elly",new String[]{"Angel", "Shad", "Mike", "Ketty"});

        Team team = new Team("Challenge", new String[]{"Cat", "Bear", "Elephant"});

        System.out.println("Победила команда " + c.doIt(team));
        

    }
}
