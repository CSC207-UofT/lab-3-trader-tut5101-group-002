public class Husky implements Tradable, Drivable, Domesticatable{
    private String name;
    private int maxSpeed;

    public Husky() {
        this.name = "Noname";
        this.maxSpeed = 10;
    }

    public Husky(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    @Override
    public String sound() {
        return "Wow";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 2000;
    }

}
