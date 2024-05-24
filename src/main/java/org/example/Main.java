package org.example;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File gamesDir = new File("Games");
        if (gamesDir.mkdir()) {
            System.out.println("Каталог Games успешно создан");
        }
        File srcDir = new File("Games/src");
        if (srcDir.mkdir()) {
            System.out.println("Каталог src успешно создан");
        }
        File resDir = new File("Games/res");
        if (resDir.mkdir()) {
            System.out.println("Каталог res успешно создан");
        }
        File tempDir = new File("Games/temp");
        if (tempDir.mkdir()) {
            System.out.println("Каталог temp успешно создан");
        }
        File saveGamesDir = new File("Games/savegames");
        if (saveGamesDir.mkdir()) {
            System.out.println("Каталог savegames успешно создан");
        }
        File mainDir = new File("src/main");
        if (mainDir.mkdir()) {
            System.out.println("Каталог main успешно создан");
        }
        File testDir = new File("src/test");
        if (testDir.mkdir()) {
            System.out.println("Каталог test успешно создан");
        }

        File mainFail = new File("main/Main.java");
        if (mainFail.createNewFile()) {
            System.out.println("Файл был создан");
        }

        File utilsFail = new File("main/Utils.java");
        if (mainFail.createNewFile()) {
            System.out.println("Файл был создан");
        }


        File drawablesDir = new File("res/drawablesDir");
        if (drawablesDir.mkdir()) {
            System.out.println("Каталог drawablesDir успешно создан");
        }
        File vectorsDir = new File("res/vectors");
        if (vectorsDir.mkdir()) {
            System.out.println("Каталог vectors успешно создан");
        }
        File iconsDir = new File("res/icons");
        if (iconsDir.mkdir()) {
            System.out.println("Каталог icons успешно создан");
        }

        File tempFail = new File("temp/temp.txt");
        if (mainFail.createNewFile()) {
            System.out.println("Файл был создан");
        }
    }
}