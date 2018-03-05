package com.file.seacher;

public class ConsoleFoundFilePrinter implements FoundFilePrinter {

    @Override
    public void printFilePath(String pathtoFile) {
        System.out.println(pathtoFile);
    }

    @Override
    public void printLine(int number, String line) {
        System.out.printf("\t%d: %s%n", number, line);
    }
}
