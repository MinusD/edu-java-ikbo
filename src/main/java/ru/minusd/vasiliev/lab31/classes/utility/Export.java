package ru.minusd.vasiliev.lab31.classes.utility;

import ru.minusd.vasiliev.lab31.classes.items.MenuItem;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Export {
    public static void saveToFile(Object obj, Path path) {
        var file = path.toFile();
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (var writer = new FileWriter(file, false)) {
            if (obj instanceof MenuItem) {
                writer.write(((MenuItem) obj).getSerializedString());
            } else {
                writer.write(obj.toString());
            }
            writer.flush();
            System.out.println("Saved to file " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
