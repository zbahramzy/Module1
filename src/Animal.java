public class Animal {
    // position of animals
    private int xCoordinate;
    private int yCoordinate;

    // constructor, initialises animal position
    public Animal(int xInitialCoordinate, int yInitialCoordinate) {
        setXCoordinate(xInitialCoordinate);
        setYCoordinate(yInitialCoordinate);
    }

    // getters, return current animal position
    public int getXCoordinate() { return xCoordinate; }
    public int getYCoordinate() { return yCoordinate; }
    // setters, update animal position
    private void setXCoordinate(int xCoordinate) { this.xCoordinate = xCoordinate; }
    private void setYCoordinate(int yCoordinate) { this.yCoordinate = yCoordinate; }

    // animal speak method
    public void speak(String sentence) {
        if (sentence.equalsIgnoreCase("rabbit position")){
            System.out.println("I am the Rabbit, I'm now standing on square " + getXCoordinate() + ", " + getYCoordinate());
        }
        else if (sentence.equalsIgnoreCase("rabbit please")) {
            System.out.println("Noooooo Please don't eat me!!");
        }
        else if (sentence.equalsIgnoreCase("snake position"))
        {
            System.out.println("I am the Snake, I'm now standing on square " + getXCoordinate() + ", " + getYCoordinate());
        }
        else if (sentence.equalsIgnoreCase("snake eat")) {
            System.out.println("Ahhrrrrrrr I'm eating you ha ha!");
        }
    }

    // animal move method
    public void move(int xChange, int yChange) {
        // establish game borders
        if (((this.xCoordinate+xChange)>=1 && (this.xCoordinate+xChange)<=10) && ((this.yCoordinate+yChange)>=1 && (this.yCoordinate+yChange)<=10)) {
            // establish allowable move, cannot move animal by more than 1 in x and y direction
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