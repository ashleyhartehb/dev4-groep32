package decorator;

public abstract class Effect {
    protected String description;

    protected void setDescription(String description)
    { this.description = description; }

    protected String getDescription()
    { return description; }

    protected abstract String filter();
}
