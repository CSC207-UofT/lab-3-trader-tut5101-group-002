public class Dragon implements Tradable, Domesticatable, Drivable{

    private int speed;

    public Dragon() {
        this.speed = 31415926;
    }

    @Override
    public String sound() {
        return "~~~~~~~~.";
    }

    @Override
    public void upgradeSpeed() {
        this.speed *= 2;
    }

    @Override
    public void downgradeSpeed() {
        this.speed /= 2;
    }

    @Override
    public int getMaxSpeed() {
        return this.speed;
    }

    @Override
    public int getPrice() {
        return 1000000000;
    }

    @Override
    public String toString(){
        return "劳资是龙";
    }
}
