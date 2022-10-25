package studiesroom;

public class Director implements Runnable {

    static private final int NUM_OF_ROUNDS = 3;
    static public enum STATE {
        OUTSIDE, WAITING, INSIDE
    }

    private int rounds = 0;
    private STATE state;

    public Director(){
        this.state = STATE.OUTSIDE;
    }

    @Override
    public void run() {
        while(rounds < NUM_OF_ROUNDS) {
            // TODO all of this
            switch(state){
                case WAITING:
                    break;
                case INSIDE:
                    break;
                default:
                    // Default case is being outside.
            }
        }
    }
    
}
