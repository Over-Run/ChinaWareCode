import org.junit.jupiter.api.Test;
import org.overrun.chinawarecode.api.Loader;

import java.io.File;

public class Tests {
    @Test
    public void a() {
        File file = new File(System.getProperty("user.dir"), "test");
        Loader.load(file);
        for (String code : Loader.getCodes()) {
            System.out.println(code);
        }
    }
}
