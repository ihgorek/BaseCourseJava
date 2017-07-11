/**
 * Created by ihgorek on 7/7/17.
 */
import java.math.*;
public class OOP_Basic_3_3 {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1,1);
        ComplexNumber b = new ComplexNumber(1,1);
        System.out.println(a.equals(b));
        System.out.println(b.hashCode()==a.hashCode());
    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        int new_y,new_x,initial_x,initial_y;
        new_y = Math.abs(Math.abs(toY) - Math.abs(robot.getY()));
        new_x = Math.abs(Math.abs(toX) - Math.abs(robot.getX()));
        initial_x = robot.getX();
        initial_y = robot.getY();
        if (robot.getDirection().equals(Robot.Direction.DOWN)){
            robot.turnLeft();
            robot.turnLeft();
        }
        else if (robot.getDirection().equals(Robot.Direction.LEFT)){
            robot.turnRight();
        }
        else if (robot.getDirection().equals(Robot.Direction.RIGHT)){
            robot.turnLeft();
        }
        if (toY < robot.getY()){
            robot.turnLeft();
            robot.turnLeft();
        }
        for (int i = 0; i < new_y; i++){
            robot.stepForward();
        }
        if (toX >= initial_x && toY >= initial_y){
            robot.turnRight();
        }
        if (toX < initial_x && toY >= initial_y){
            robot.turnLeft();
        }
        if (toX > initial_x && toY < initial_y){
            robot.turnLeft();
        }
        if (toX <= initial_x && toY < initial_y){
            robot.turnRight();
        }
        for (int i = 0; i < new_x; i++){
            robot.stepForward();
        }

    }
}
