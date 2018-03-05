package com.file.seacher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            System.err.println("Ожидаются 2 параметра: базовый путь поиска и фраза поиска!");
            return;
        }

        String path = args[0];
        String phrase = args[1];

        //Создаем нашу реализацию FileVisitor'a.
        //Передаем фразу поиска и объект реализующий FoundFilePrinter
        FilePhraseSearcher filePhraseSearcher = new FilePhraseSearcher(phrase,
                new ConsoleFoundFilePrinter());

        //бежим по базовому пути
        Files.walkFileTree(Paths.get(path),
                filePhraseSearcher);

    }

}
