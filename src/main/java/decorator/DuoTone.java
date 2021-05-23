package decorator;

public class DuoTone extends FiltersDecorator {
    public DuoTone(Effect effect) {
        super(effect);
        super.setDescription(", duotone");
    }
    @Override
    protected double colorValue() { return super.colorValue() + 1.0; }

    public String getDescription() { return super.effect.getDescription() + super.getDescription(); }
}
