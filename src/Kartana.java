import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kartana extends Pokemon {
    public Kartana(String name, int level) {
        Pokemon p3 = new Pokemon("Kartana", 1);
        setType(Type.GRASS, Type.STEEL);
        setStats(59, 181, 131, 59, 31, 109);
        IronDefense ironDefense = new IronDefense(0, 0);
        MegaDrain megaDrain = new MegaDrain(40, 100);
        BrutalSwing BrutalSwing = new BrutalSwing(60, 100);
        FlameCharge FlameCharge = new FlameCharge(50, 100);
        setMove(ironDefense, megaDrain, BrutalSwing, FlameCharge);
    }

}