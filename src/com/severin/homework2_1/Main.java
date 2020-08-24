package com.severin.homework2_1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        public static void main (String[]args){
            Random random = new Random();

            int a = random.nextInt(8);
            int b = random.nextInt(6000);

            Human human = new Human();
            Cat cat = new Cat();
            Robot robot = new Robot();
            Wall wall = new Wall(a);
            Track track = new Track(b);

            Objects[] objects = new Objects[3];
            {
                new Human();
                new Cat();
                new Robot();
            }

            Barriers[] barrier = new Barriers[2];
            {
                new Wall(a);
                new Track(b);
            }

            for (int i = 0; i < 4; i++) {
                if (objects[i].distance) {
                }
            }

        }
    }
}
