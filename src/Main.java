public class Main {
    public static void main(String[] args) {
        // Create rabbit object and snake object, with initial positions
        Animal rabbit = new Animal(1,1);
        Animal snake = new Animal(10,10);

        rabbit.speak("I am the Rabbit, my initial position is: " + rabbit.getXCoordinate() + ", " + rabbit.getYCoordinate());
        snake.speak("I am the Snake, my initial position is: " + snake.getXCoordinate() + ", " + snake.getYCoordinate() + "\n");

        //the state of the rabbit
        boolean isRabbitAlive = true;
        while (isRabbitAlive) {
            //if the snake and rabbit within 1 square of each other, only the snake is going to move
            if (Math.abs(snake.getXCoordinate()-rabbit.getXCoordinate()) == 1 && Math.abs(snake.getYCoordinate()-rabbit.getYCoordinate()) == 1) {
                rabbit.speak("Noooooo Please don't eat me!!");
                snake.move(-1, -1);
                snake.speak("I am the Snake, I'm now standing on square " + snake.getXCoordinate() + ", " + snake.getYCoordinate());
                snake.speak("Ahhrrrrrrr I'm eating you ha ha!");
                isRabbitAlive = false;
            }
            else { //the snake and rabbit is moving and saying their positions
                rabbit.move(1, 0);
                rabbit.speak("I am the Rabbit, I'm now standing on square " + rabbit.getXCoordinate() + ", " + rabbit.getYCoordinate());
                snake.move(0, -1);
                snake.speak("I am the Snake, I'm now standing on square " + snake.getXCoordinate() + ", " + snake.getYCoordinate());
            }
        }
    }
}
