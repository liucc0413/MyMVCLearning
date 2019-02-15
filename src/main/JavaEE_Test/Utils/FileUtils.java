package Utils;

import java.io.*;

public class FileUtils {

    public byte[] getBytes (File file) throws Exception {
        BufferedInputStream in = null;

            in = new BufferedInputStream(new FileInputStream(file));
           byte[] b = new byte[in.available()];
            in.read(b);
            return b;

    }
}
