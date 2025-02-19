package org.example.FlyweightDesignPattern.Games;

public class DogRobot implements Robot{
    Image image;
    RobotType robotType;

    public DogRobot(Image image, RobotType robotType) {
        this.image = image;
        this.robotType = robotType;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("The location is  x : " + x + "  y: " + y);
    }
}
