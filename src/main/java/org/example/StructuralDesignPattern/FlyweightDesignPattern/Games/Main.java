package org.example.StructuralDesignPattern.FlyweightDesignPattern.Games;

public class Main {
    public static void main(String[] args){
        RobotFactory robotFactory=new RobotFactory();
        Robot humanoid=robotFactory.createRobot(RobotType.HUMANOID);
        humanoid.display(2,3);
        Robot humanoid1=robotFactory.createRobot(RobotType.HUMANOID);
        humanoid1.display(4,3);

        Robot dog= robotFactory.createRobot(RobotType.DOG);
        dog.display(1,1);
        Robot dog1= robotFactory.createRobot(RobotType.HUMANOID);
        dog1.display(2,8);
        dog1.display(10,11);
    }
}
