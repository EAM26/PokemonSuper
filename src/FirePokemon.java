public class FirePokemon extends PokemonSuper{

    private int heat;
    private boolean burnImunity;

    public FirePokemon(String name, int healthPoints, String sound, String food, int heat, boolean burnImunity) {
        super(name, healthPoints, sound, food);
        this.heat = heat;
        this.burnImunity = burnImunity;

    }

    @Override
    public void attack() {

    }
}
