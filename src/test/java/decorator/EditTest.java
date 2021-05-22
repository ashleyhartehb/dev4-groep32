package decorator;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

public class EditTest {
    @Test
    void createEffect() {
        Effect effect = new DuoTone();
        System.out.println(effect.getDescription());
    }
}
