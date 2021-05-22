package factorymethod.cache;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class PictureTest {
    @Test
    void createIllegalPicture() {
        Picture picture = Picture.getPictureByTopic(3.0, null, null, null, null);
        if (picture != null) {

        }
    }

    @Test
    void factoryMethods(){
        Picture aPicture = Picture.getPictureByTopic(5.0, "Javascript", "CodeGuru", "Objects in js", "1440p");
        //assertEquals(aPicture);
    }
}
