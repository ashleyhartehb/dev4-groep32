package decorator;

public class Desaturate extends FiltersDecorator{
    public Desaturate(Effect effect) {
        super(effect);
        super.setDescription(", desaturate");
    }
    @Override
    protected double colorValue() { return super.colorValue() + 2.0; }

    public String getDescription() { return super.effect.getDescription() + super.getDescription(); }

}
