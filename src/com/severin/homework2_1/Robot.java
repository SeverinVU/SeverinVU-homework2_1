package com.severin.homework2_1;

public class Robot implements Run, Jump{

    public int distance = 5500;
    public int high = 6;


    @Override
    public void noJump() {
        System.out.println("Cant jump more than" + high + "meters");
    }

    @Override
    public void noRun() {
        System.out.println("Cant кгт more than" + distance + "meters");
    }

    @Override
    public void run() {
        System.out.println("Successfully overcome");
    }
    @Override
    public void jump() {
        System.out.println("Successfully overcome");
    }
}
