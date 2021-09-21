public class Main {
    public static void main(String[] args) {
        // Create rabbit object and snake object, with initial positions
        Animal rabbit = new Animal(1,1);
        Animal snake = new Animal(10,10);

        rabbit.speak("rabbit position");
        snake.speak("snake position");
        System.out.println();

        //the state of the rabbit
        boolean isRabbitAlive = true;
        while (isRabbitAlive) {
            //if the snake and rabbit within 1 square of each other, only the snake is going to move
            if (Math.abs(snake.getXCoordinate()-rabbit.getXCoordinate()) == 1 && Math.abs(snake.getYCoordinate()-rabbit.getYCoordinate()) == 1) {
                rabbit.speak("rabbit please");
                snake.move(-1, -1);
                snake.speak("snake position");
                snake.speak("snake eat");
                isRabbitAlive = false;
            }
            else { //the snake and rabbit is moving and saying their positions
                rabbit.move(1, 0);
                rabbit.speak("rabbit position");
                snake.move(0, -1);
                snake.speak("snake position");
            }
        }
    }
}