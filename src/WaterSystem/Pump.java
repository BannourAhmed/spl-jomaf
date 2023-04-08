package WaterSystem;

import Elements.ActiveElement;

import java.util.ArrayList;
import java.util.List;

public abstract class Pump extends ActiveElement {

    public static final float tankCapacity = 0;
    private float tankVolume;

    private int workingTime;

    private List<Pipe> pipes;

    private int maxPipes;

    public void removePipe(Pipe p) {

    }

    public void addPipe(Pipe p) {

    }

    @Override
    public boolean canAccept() {
        return true;
    }

    public void setDirection() {

    }

    public Boolean getHasWater() {
        return false;
    }

    public void setHasWater(Boolean hasWater) {

    }

    public ArrayList<Pipe> getConnectedPipes() {

        return new ArrayList<Pipe>();
    }

    public void step() {
    }
}
