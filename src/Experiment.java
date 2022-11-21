import ru.ifmo.se.pokemon.*;

public class Experiment{
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("First", 1);
        Pokemon p2 = new Pokemon("Second", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}