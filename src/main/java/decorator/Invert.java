package decorator;

public class Invert extends FiltersDecorator{
    public Invert(Effect effect) {
        super(effect);
        super.setDescription(", invert");
    }
    @Override
    protected double colorValue() { return super.colorValue() + 0.5; }

    public String getDescription() { return super.effect.getDescription() + super.getDescription(); }
}
