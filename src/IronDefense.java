import ru.ifmo.se.pokemon.*;

public class Steel extends StatusMove {
    public Steel(double pow, double acc) {

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
