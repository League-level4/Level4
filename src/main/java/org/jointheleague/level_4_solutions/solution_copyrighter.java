package org.jointheleague.level_4.copyrighter;
/**
Copyright The League of Amazing Programmers 2013-2017
 *    Level 4
 *    Copyrighter
 *    Solution
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class Copyrighter {
    public static void main(String[] args) throws IOException {
        String currentDirectory = new java.io.File("src").getCanonicalPath();
        File currentDireFile = new File(currentDirectory);
        for (File file : currentDireFile.listFiles()) {
            FileWriter fw = new FileWriter(file, true);
            fw.append(" \n // Copyright JoonSpoon, " + Calendar.getInstance().get(Calendar.YEAR));
            fw.close();
        }
    }

}

