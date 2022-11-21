import ru.ifmo.se.pokemon.*;

public class IronDefense extends StatusMove {
    public IronDefense(double pow, double acc) {

        super(Type.STEEL, pow, acc);
    }
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.DEFENSE, 2);
        p.addEffect(e);
    }
    protected String describe() {
        return "does Steel";
    }
}
