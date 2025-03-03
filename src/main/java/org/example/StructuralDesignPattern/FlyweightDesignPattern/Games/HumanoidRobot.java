package org.example.StructuralDesignPattern.FlyweightDesignPattern.Games;

public class HumanoidRobot implements Robot {

    Image image;
    RobotType robotType;

    public HumanoidRobot(Image image, RobotType robotType) {
        this.image = image;
        this.robotType = robotType;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("The location is  x : " + x + "  y: " + y);
    }
}
