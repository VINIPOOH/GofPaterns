package mediator;

import mediator.Colleague;

public abstract class Mediator {

    public abstract void send(String message, Colleague sender);
}

