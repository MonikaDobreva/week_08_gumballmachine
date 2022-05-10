package gumballmachine;

/**
 * Implements GumballState behaviors.
 *
 * @author Pieter van den Hombergh
 */
enum StateEnum implements GumballState {

    /**
     * NO_COIN only reacts tho insertCoin and will go to hasCoin.
     */
    NO_COIN( "You must put in a coin before you can continue" ) {
        // TODO Implement state NO_COIN
        
    },

    /**
     * HAS_COIN reacts to draw and ejectCoint.
     *
     * draw(...) dispenses one ball and outputs the result to the machine's
     * output. If machine is now empty, go to SOLD_OUT, else if winner then go
     * to WINNER else to NO_COIN.
     * ejectCoin(...) goes to NO_COIN.
     * </ul>
     */
    HAS_COIN( "You should draw to get your ball" ) {
        // TODO Implement state HAS_COIN
        
    },

    /**
     * SOLD_OUT reacts only to refill and with that goes to NO_COIN.
     */
    SOLD_OUT( "Machine is empty, waiting for refill" ) {
        //TODO Implement state SOLD_OUT
        
    },

    /**
     * WINNER reacts only to draw and goes to either SOLD_OUT or NO_COIN.
     */
    WINNER( "You should draw once more to get an extra ball" ) {
        //TODO Implement state WINNER 
        
    };
    
    /**
     * Stores per state the reason why some operations are not supported.
     */
    final String reason;

    /**
     * Enum value constructor taking the reason string.
     *
     * @param reason for unsupported operations in this state.
     */
    private StateEnum( String reason ) {
        this.reason = reason;
    }

    /**
     * Getter for reason.
     *
     * @return the reason.
     */
    @Override
    public String reason() {
        return reason;
    }
}
