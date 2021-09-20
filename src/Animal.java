public class Animal {
    // position of animals
    private int xCoordinate;
    private int yCoordinate;

    public Animal(int xInitialCoordinate, int yInitialCoordinate) {
        setXCoordinate(xInitialCoordinate);
        setYCoordinate(yInitialCoordinate);
    }

    public int getXCoordinate() { return xCoordinate; }
    public int getYCoordinate() { return yCoordinate; }

    private void setXCoordinate(int xCoordinate) { this.xCoordinate = xCoordinate; }
    private void setYCoordinate(int yCoordinate) { this.yCoordinate = yCoordinate; }

    public void move(int xAmountOfChange, int yAmountOfChange) {

    }

}
