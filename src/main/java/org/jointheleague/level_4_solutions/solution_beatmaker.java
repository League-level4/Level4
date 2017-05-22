package org.jointheleague.level_4.beatmaker;
/**
Copyright The League of Amazing Programmers 2013-2017
 *    Level 4
 *    Beatmaker
 *    Solution
 */

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class RappersDelight {
    public static void main(String[] args) {

        ArrayList<Beatmaker> musicians = new ArrayList<Beatmaker>();
        musicians.add(new KanyeWest());
        musicians.add(new DJShadow());
        musicians.add(new DrDre());

        for (Beatmaker beatmaker : musicians) {

            Method[] methods = beatmaker.getClass().getMethods();
            System.out.println(beatmaker.getClass().getSimpleName() + " knows how to ");
            for (int i = 0; i < methods.length; i++) {
                if (!(methods[i].getDeclaringClass().isInstance(new Object())))     // 3
                    System.out.println(methods[i].getName());                         // 2
            }
        }
    }

}

class Beatmaker {
    public void makeBeats() {
        System.out.println("Bdb - ts - ts - b - kch - ts - ts - b - ts - kch - ts - b - kch - ts - kch - kch");
    }
}

class KanyeWest extends Beatmaker {

    RappingAbility rapskills = new RappingAbility();

    public void spitRhymes() {
        rapskills.spitRhymes();
    }
}

class DJShadow extends Beatmaker {}

class DrDre extends Beatmaker {

    RappingAbility rapskills = new RappingAbility();

    public void spitRhymes() {
        rapskills.spitRhymes();
    }
}

class RappingAbility {
    public void spitRhymes() {
        try {
            Runtime.getRuntime().exec("say All agree that I am the best rapper, All the others should drive a tractor.");
        } catch (IOException e) {
        }
    }
}

