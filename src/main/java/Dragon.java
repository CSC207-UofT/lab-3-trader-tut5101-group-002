public class Dragon implements Tradable, Domesticatable, Drivable{

    private int Speed;

    public Dragon() {
        this.Speed = 31415926;
    }

    @Override
    public String sound() {
        return "~~~~~~~~.";
    }

    @Override
    public void upgradeSpeed() {
        this.Speed *= 2;
    }

    @Override
    public void downgradeSpeed() {
        this.Speed /= 2;
    }

    @Override
    public int getMaxSpeed() {
        return this.Speed;
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
