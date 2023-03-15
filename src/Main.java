import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PokemonSuper> pokemons = new ArrayList<>();
        pokemons.add(new FirePokemon("Charmander", 39, "char-MAN-der", "apples", 100, true));
        System.out.println(pokemons.get(0).getName());
        pokemons.get(0).eat();
    }
}
