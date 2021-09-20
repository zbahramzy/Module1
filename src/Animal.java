public class Animal {
    // position of animals
    private int xCoordinate;
    private int yCoordinate;

    // constructor
    public Animal(int xInitialCoordinate, int yInitialCoordinate) {
        setXCoordinate(xInitialCoordinate);
        setYCoordinate(yInitialCoordinate);
    }

    // getters,
    public int getXCoordinate() { return xCoordinate; }
    public int getYCoordinate() { return yCoordinate; }
    // setters,
    private void setXCoordinate(int xCoordinate) { this.xCoordinate = xCoordinate; }
    private void setYCoordinate(int yCoordinate) { this.yCoordinate = yCoordinate; }

    public void speak(String sentence) {
        System.out.println(sentence);
    }

    public void move(int xChange, int yChange) {
        if (((this.xCoordinate+xChange)>=1 && (this.xCoordinate+xChange)<=10) && ((this.yCoordinate+yChange)>=1 && (this.yCoordinate+yChange)<=10)) {
            if ((xChange <= 1 && xChange >= -1) && (yChange <= 1 && yChange >= -1) && xChange != 0 || yChange != 0) {
                setXCoordinate(this.xCoordinate + xChange);
                setYCoordinate(this.yCoordinate + yChange);
            }
            else {
                System.out.println("Invalid move!");
            }
        }
        else {
            System.out.println("Border reached!");
        }
    }
}
