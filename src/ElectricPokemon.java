public class ElectricPokemon extends PokemonSuper{

    private int electricPower;
    private boolean waterResistant;
    public ElectricPokemon(String name, int healthPoints, String sound, String food, int electricPower, boolean waterResistant) {
        super(name, healthPoints, sound, food);
        this.electricPower = electricPower;
        this.waterResistant = waterResistant;
    }

    public void speak() {
        System.out.println(this.getName() + " is saying: " + this.getSound());
    }

    public void electricWeb() {
        System.out.println(this.getName() + " is generating an electric web slowing down his opponents.");
    }
    public void thunderBolt() {
        System.out.println(this.getName() + " is shocking you with " + this.getElectricPower() + " points.");
    }
    @Override
    public void attack() {
        this.thunderBolt();
    }

    public int getElectricPower() {
        return electricPower;
    }

    public boolean isWaterResistant() {
        return waterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        this.waterResistant = waterResistant;
    }

    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }
}
