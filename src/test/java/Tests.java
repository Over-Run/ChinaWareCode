import org.junit.jupiter.api.Test;
import org.overrun.chinawarecode.api.Loader;

public class Tests {
    @Test
    public void a() {
        Loader.load();
        for (String code : Loader.getCodes()) {
            System.out.println(code);
        }
    }
}
