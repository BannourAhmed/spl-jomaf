package WaterSystem;

import Elements.ActiveElement;

import java.util.List;

public class Cistern extends ActiveElement {

    public static final boolean isWorking = true;
    public static final boolean hasWater = true;
    private List<Pipe> connectedPipes;
    private int score; // We would need a new type/class named Score if we want it to have a special
                       // type

    public int checkPipes() {

        return 0;
    }

    public Pipe createPipe() {

        return new Pipe();
    }

    public Pump createPump() {

        return new Pump() {
        };
    }

    public void step() {

    }
}
