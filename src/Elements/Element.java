package Elements;

import Players.Player;

import java.util.List;

public abstract class Element {

    private List<Player> players;
    private boolean isWorking;
    // in the documentation isWorking seems to be a final value as it doesn't matter
    // if it works or not?
    // however there is a setIsWorking() that's gonna change it, so please check
    // this out, thank you!
    private boolean hasWater;

    public boolean canAccept() {
        return true;
    }

    public void accept(Player p) {

    }

    public void remove(Player p) {

    }

    public void setIsWorking(boolean b) {

    }

    public void setHasWater(boolean b) {

    }
}