package University.labs.laba6;

import com.google.gson.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TheMain {
    private static final String NAMEOFFILE = "d:\\labJson.json";

    public static void main(String[] args) {
        Mattrix modifiedMatrix = null;
        Author author = new Author("Serovin", "Robinson", 21, Author.Sex.MALE);
        Mattrix myCollection = new Mattrix(author);
        myCollection.setLength(5);
        myCollection.setWidth(5);
        MinMaxList collectionMixMax = new MinMaxList();
        myCollection.getRandomMatrix();
        myCollection.printMatrix();


        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String toFileJson = gson.toJson(myCollection);

        try (FileWriter fileW = new FileWriter(NAMEOFFILE)) {
            fileW.write(toFileJson);
        } catch (IOException ex) {
            Logger.getLogger(TheMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedReader readerF = new BufferedReader(new FileReader(NAMEOFFILE));
            modifiedMatrix = gson.fromJson(readerF, Mattrix.class);
        } catch (IOException ex) {
            Logger.getLogger(TheMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (myCollection.equals(modifiedMatrix)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
    }
}
