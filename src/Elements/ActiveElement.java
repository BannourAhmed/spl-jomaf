package Elements;

import Players.Player;

public abstract class ActiveElement extends Element {

    public boolean canAccept() {
        return true;
    };
    // if we add abstract after public, we will have to implement it in Cistern and
    // Spring
    // Since this is not used there, it it overridden in Pipe and Pump only.

    public void accept(Player p) {
        if (canAccept()) {

        }
    }

    public void remove(Player p) {

    }
}
