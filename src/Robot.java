/**
 * Created by ihgorek on 7/7/17.
 */
public class Robot {
    int x;
    int y;
    Direction dir;

    public Robot (int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public Direction getDirection() {
        // текущее направление взгляда
        return dir;
    }

    public int getX() {
        // текущая координата X
        return x;
    }

    public int getY() {
        return y;
        // текущая координата Y
    }

    public void turnLeft() {
        if      (dir == Direction.UP)    {dir = Direction.LEFT;}
        else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
        else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
        else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
        else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
        else if (dir == Direction.LEFT)  {dir = Direction.UP;}
        else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        if (dir == Direction.UP)    {y++;}
        if (dir == Direction.DOWN)  {y--;}
        if (dir == Direction.LEFT)  {x--;}
        if (dir == Direction.RIGHT) {x++;}
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
