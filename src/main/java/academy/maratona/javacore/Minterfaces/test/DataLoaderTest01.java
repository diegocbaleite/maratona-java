package academy.maratona.javacore.Minterfaces.test;

import academy.maratona.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.maratona.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader  fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
    }
}
