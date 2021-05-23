package factorymethod.cache;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PictureTest {
    @Test
    void createIllegalPicture() {
        Picture picture = Picture.getPictureByTopic(3.0, null, null, null, null);
        if (picture != null) {

        }
    }

    @Test
    void factoryMethods(){
        Picture aPicture = Picture.getPictureByTopic(5.0, "Javascript", "Stack", "Objects in js", "1440p");
        Picture anotherPicture = Picture.getPictureByTopic(17.0, "Java", "CodeGuru", "Objects in java", "1080p");

        assertEquals(anotherPicture, aPicture);
    }
}
