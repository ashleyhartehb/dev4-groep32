package decorator;

public class ColorEdit extends Effect {
    public ColorEdit() { setDescription("Edit color value picture to"); }

    @Override
    protected double colorValue() { return 1.0; }

}
