package org.example.StructuralDesignPattern.FlyweightDesignPattern.Games;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<RobotType, Robot> cache;

    public RobotFactory() {
        this.cache = new HashMap<>();
    }

    Robot createRobot(RobotType robotType) {
        if (cache.get(robotType) != null) {
            System.out.println("CACHE HIT !!!!");
            return cache.get(robotType);
        }
        System.out.println("CACHE MISS !!!");
        switch (robotType) {
            case HUMANOID -> {
                Image image = new Image();
                Robot humanoid = new HumanoidRobot(image, robotType);
                cache.put(robotType, humanoid);
                return humanoid;
            }
            case DOG -> {
                Image image = new Image();
                Robot dog = new DogRobot(image, robotType);
                cache.put(robotType, dog);
                return dog;
            }
            default -> {
                return null;
            }
        }
    }
}
