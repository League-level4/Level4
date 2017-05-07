package org.jointheleague.level_4.file_encryptor;
/**
Copyright The League of Amazing Programmers 2013-2017
 *    Level 4
 *    File Encryptor
 *    Solution
 */

package file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEncryptor {

    public static File openSecretFile() {
        return new File("C:\\eclipse_indigo\\workspace\\advanced\\src\\stuff.txt");
    }

    public static String readOneLine(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        return scanner.nextLine();
    }

    public static String readFileContents(File file) throws FileNotFoundException {

        StringBuilder fileContents = new StringBuilder();
        Scanner scanner = new Scanner(file);

        try {
            while (scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine());
            }
            return fileContents.toString();
        } finally {
            scanner.close();
        }
    }

    public static String encrypt(String encryptMe) {
        StringBuffer result = new StringBuffer();
        char[] characters = encryptMe.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int characterAsInt = characters[i];
            int translatedCharacterAsInt = characterAsInt + 2;
            result.append((char) translatedCharacterAsInt);
        }
        return result.toString();
    }

    public static void saveStuffInAFile(String stuffToSave, File file) throws IOException {
        FileWriter fw = new FileWriter(file);
        fw.write(stuffToSave);
        fw.close();
    }

    public static File saveFile(String fileName) throws IOException {
        new FileWriter(fileName);
        return new File(fileName);
    }
    
    public static String decrypt(String encryptMe) {
        StringBuffer result = new StringBuffer();
        char[] characters = encryptMe.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int characterAsInt = characters[i];
            int translatedCharacterAsInt = characterAsInt - 2;
            result.append((char) translatedCharacterAsInt);
        }
        return result.toString();
    }

}


