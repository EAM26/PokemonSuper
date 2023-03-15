import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FirePokemon fp = new FirePokemon("Charmander", 39, "char-MAN-der!", "apples", 100, true);
        fp.attack();
        fp.eat();
        fp.speak();
        System.out.println("**************");
        WaterPokemon wp = new WaterPokemon("Squirtle", 44, "Squirt-le!", "fish", 100, true);
        wp.attack();
        wp.eat();
        wp.speak();
        System.out.println("**************");
        GrassPokemon gp = new GrassPokemon("Bulbasaur", 45, "Bul-ba-saur!", "leaves", 20, true);
        gp.attack();
        gp.eat();
        gp.speak();
        System.out.println("**************");
        ElectricPokemon ep = new ElectricPokemon("Pikachu", 35, "PI-ka-chu!", "berries", 50, true);
        ep.attack();
        ep.eat();
        ep.speak();
        System.out.println("**************");
        HybridePokemon hp = new HybridePokemon("Jantje", 100, "JAN-TJEEEEE!", "Ice-Cubes", 50, true, 100);
        hp.attack();
        hp.eat();
        hp.speak();





    }
}
