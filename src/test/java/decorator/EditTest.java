package decorator;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

public class EditTest {
    @Test
    void createEffect() {
        Effect effect = new ColorEdit();
        effect = new DuoTone(effect);
        effect = new Desaturate(effect);
        effect = new Invert(effect);
        System.out.println(effect.getDescription() + effect.colorValue() + effect.colorValue());
    }
}
