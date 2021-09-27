public class Raptor implements Tradable, Drivable {
    private int maxSpeed;
    private int price;

    /**
     * Constructor of the class
     */
    public Raptor() {
        this.maxSpeed = 1;
        this.price = 1000000000;
    }

    /**
     * Get the price of a Raptor
     * @return the price of the Raptor instance
     */
    @Override
    public int getPrice() { return this.price;}

    /**
     * Increase the price by 10 million
     */
    public void increasePrice() { this.price += 10000000; }

    /**
     * Decrease the price by 10 million
     */
    public void decreasePrice () { this.price -= 10000000; }

    /**
     * Increase the maximum speed of this Raptor.
     **/
    @Override
    public void upgradeSpeed() {
        if (this.maxSpeed < 299792358) {
            this.maxSpeed += 100;
        }
    }

    /**
     * Decrease the maximum speed of this Raptor.
     **/
    @Override
    public void downgradeSpeed() {
        if (this.maxSpeed > 100) {
            this.maxSpeed -= 100;
        }
    }


    /**
     * Return the maximum speed of this Raptor.
     *
     * @return    The current maximum speed of this Raptor.
     **/
    @Override
    public int getMaxSpeed() { return this.maxSpeed; }

}
