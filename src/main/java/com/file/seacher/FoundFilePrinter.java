package com.file.seacher;

/**
 * Интерфейс для вывода пути файла в котором нашли строку
 * а также номера строки и ее содержимого
 */
public interface FoundFilePrinter {

    /**
     * Печать пути к файлу
     * @param pathtoFile путь к файлу
     */
    void printFilePath(String pathtoFile);

    /**
     * Печать номера строки и ее сожержимого
     * @param number номер строки
     * @param line содержимое строки
     */
    void printLine(int number, String line);
}
