import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(double pow, double acc) {

        super(Type.PSYCHIC,pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().turns(2);
        e.sleep(p);
        p.addEffect(e);

    }

    protected String describe() {
        return "does Rest";
    }
}
