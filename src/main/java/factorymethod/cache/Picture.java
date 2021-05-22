package factorymethod.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Picture {
    private final double timestamp;
    private final String topic;
    private final String username;
    private final String description;
    private final String resolution;

    private static final Map<String, Picture> pictures = new HashMap<>();

    private Picture(double timestamp, String topic, String username, String description, String resolution) {
        this.timestamp = timestamp;
        this.topic = topic;
        this.username = username;
        this.description = description;
        this.resolution = resolution;
    }

    public static Picture getPictureByTopic(Double timestamp, String topic, String username, String description, String resolution)
    {
        if (topic == null || topic.equals("")) return null;
        if (username == null || username.equals("")) return null;
        if (description == null || description.equals("")) return null;
        if (resolution == null || resolution.equals("")) return null;
        String key = timestamp + topic + username + description + resolution;
        Picture picture = pictures.get(key);
        if (picture == null) {
            picture = new Picture(timestamp, topic, username, description, resolution);
            pictures.put(key, picture);
        }
        return picture;
    }

    public static Picture getDefaultPicture()
    {
        return getPictureByTopic(0.0, "Code snippets", "Bart", "Picture of patterns", "1080p");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof  Picture)) return false;
        Picture picture = (Picture) o;
        return Objects.equals(topic, picture.topic) && Objects.equals(timestamp, picture.timestamp) && Objects.equals(username, picture.username) && Objects.equals(description, picture.description) && Objects.equals(resolution, picture.resolution);
    }

    @Override
    public int hashCode() { return Objects.hash(timestamp, topic, username, description, resolution);}

}
