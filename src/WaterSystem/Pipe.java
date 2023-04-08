package WaterSystem;

import Elements.Element;
import Elements.ActiveElement;

public class Pipe extends Element {
    private ActiveElement incomingObject;
    private ActiveElement outgoingObject;

    public void setIncomingAE(ActiveElement ae) {

    }

    public void setOutgoingAE(ActiveElement ae) {

    }

    @Override
    public boolean canAccept() {

        return false;
    }

    public Pipe splitPipe() {

        return new Pipe();
    }
}
