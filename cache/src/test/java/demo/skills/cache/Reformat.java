package demo.skills.cache;

import org.junit.jupiter.api.Test;

import java.io.*;

public class Reformat {
    @Test
    public void reformat()  {
        try (FileInputStream fis = new FileInputStream("src/main/resources/fixed.json")) {
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            FileOutputStream fos = new FileOutputStream("src/main/resources/arrayed-fixed.json");
            PrintWriter out = new PrintWriter(new BufferedOutputStream(fos));

            String line;

            out.println("[");
            while ((line = in.readLine()) != null) {
                out.println(line + ",");
            }

            out.println("]");
            out.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
