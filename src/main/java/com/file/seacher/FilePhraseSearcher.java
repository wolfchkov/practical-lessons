package com.file.seacher;

import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Реализация FileVisitor'a.
 * метод visitFile будет вызван для каждого файла из
 * базового католога, включая подкатологи
 */
public class FilePhraseSearcher extends SimpleFileVisitor<Path> {

    private final String phrase;
    private final FoundFilePrinter foundFilePrinter;

    public FilePhraseSearcher(String phrase, FoundFilePrinter foundFilePrinter) {
        this.phrase = phrase;
        this.foundFilePrinter = foundFilePrinter;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        //открываем файл на чтение
        //используем LineNumberReader чтобы получить номер читаемой строки
        try (LineNumberReader reader = new LineNumberReader(Files.newBufferedReader(file));) {
            String line;
            boolean notPrinted = true;
            //цикл по всем строкам в текстовом файле
            while ((line = reader.readLine()) != null) {
                //встретили фразу?
                if (line.contains(phrase)){
                    //еще не печатали путь к файлу?
                    if(notPrinted) {
                        //напечатаем
                        foundFilePrinter.printFilePath(file.toAbsolutePath().toString());
                        //больше не будем печатать
                        notPrinted = false;
                    }
                    //выводим на печать номер строки и саму строку
                    foundFilePrinter.printLine(reader.getLineNumber(), line);
                }
            }
        }
        //говорим что продолжаем бежать по файлам
        return FileVisitResult.CONTINUE;
    }



}
