package state;

public class StateExample {

    public static void main(String[] args) {
        StateContext context = new StateContext();
        context.heat();
        context.heat();
        context.heat();
        context.freeze();
        context.freeze();
        context.freeze();
        // OUTPUT:
        // Heating solid substance...
        // Changing state to liquid...
        // Heating liquid substance...
        // Changing state to gaseous...
        // Heating gaseous substance...
        // Nothing happens.
        // Freezing gaseous substance...
        // Changing state to liquid...
        // Freezing liquid substance...
        // Changing state to solid...
        // Freezing solid substance...
        // Nothing happens.
    }

}

