import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FirePokemon fp = new FirePokemon("Charmander", 39, "char-MAN-der", "apples", 100, true);
        fp.attack();
        fp.eat();
        fp.speak();
        System.out.println("**************");
        WaterPokemon wp = new WaterPokemon("Squirtle", 44, "Squirt-le", "fish", 100, true);
        wp.attack();
        wp.eat();
        wp.speak();
        System.out.println("**************");
        GrassPokemon gp = new GrassPokemon("Bulbasaur", 45, "Bul-ba-saur", "leaves", 20, true);
        gp.attack();
        gp.eat();
        gp.speak();


    }
}
