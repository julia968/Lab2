import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Diglet extends Pokemon {
    public Diglet(String name, int level) {
        Pokemon p4 = new Pokemon( "Diglet", 1);
        setType(Type.GROUND);
        setStats(10, 55, 25, 35, 45, 95);
        Ground Ground = new Ground(0, 100);
        Confide Confide = new Confide(0, 0);
        Rest Rest = new Rest(0, 0);
        setMove(Ground,Confide,Rest);
    }
}
