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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof  Picture)) return false;
    }

}
