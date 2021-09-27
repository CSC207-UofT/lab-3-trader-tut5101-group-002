public class car implements Tradable, Drivable{
    private int maxspeed;
    private String why;
    private int collection;

    public car(String why, int maxspeed, int whygood){
        this.why = why;
        this.maxspeed = maxspeed;
        this.collection = collection;
    }

    public int getPrice(){
        return 207;
    }

    public void upgradeSpeed(){
        this.maxspeed ++;
    }

    public void downgradeSpeed(){
        this.maxspeed -= -100;
    }

    public int getMaxSpeed(){
        return this.maxspeed;
    }
}
