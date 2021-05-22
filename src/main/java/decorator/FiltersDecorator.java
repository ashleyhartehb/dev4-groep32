package decorator;

public abstract class FiltersDecorator extends Effect {
    protected Effect effect;
    protected FiltersDecorator(Effect effect) {this.effect = effect; }

    protected String filter() { return effect.filter();}
}
