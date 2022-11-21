import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class MegaDrain extends SpecialMove {
    public MegaDrain(double pow, double acc) {
        super(Type.GRASS, pow, acc);

    }
    protected String describe() {
        return "does MegaDrain";
    }
}
