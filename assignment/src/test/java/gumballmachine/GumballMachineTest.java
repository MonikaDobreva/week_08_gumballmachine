package gumballmachine;

import java.io.PrintStream;
import java.util.concurrent.TimeUnit;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;
import org.mockito.junit.jupiter.MockitoExtension;
import util.StringOutput;

/**
 * Verify that API messages are properly forwarded to the state. Test all
 * methods that have a concrete implementation in this class.
 *
 * @author Pieter van den Hombergh
 */
@ExtendWith(MockitoExtension.class)
public class GumballMachineTest {

    /**
     * Mock the GumballState as DOC when testing the Gumball machine (SUT).
     */
    @Mock
    GumballState state;

    /**
     * Make sure the context calls exit on the old state.
     */
    @Test
    public void changeStateCallsExit() {
        // Create a Gumball machine instance, passing the mocked state.
        // Let the machine change its state to the same 'old' state.
        // Verify that the exit method is invoked on that state.

        // TODO 05 Test that exit is invoked on the old state
        fail( "changeStateCallsExit not implemented yet" );
    }

    /**
     * Make sure that the constructor enters the initial state.
     */
    @Test
    public void constructorCallsEnter() {
        // The enter method on the initial state should be invoked at creation 
        // of a machine instance.
        // TODO 06 Test that constructor enters the initial state
        fail( "constructorCallsEnter not implemented yet" );
    }

    /**
     * Ensure method forward from draw to draw(Context).
     */
    @Test
    public void drawCallsDrawWithContext() {

        // An invokation of draw() on the machine should result in an invokation
        // of draw(<Context>) on the initial state.
        // TODO 07 Test method forward from draw to draw(Context)
        fail( "drawCallsDrawWithContext not implemented yet" );
    }

    /**
     * Ensure method forward from ejectCoin to ejectCoin(Context).
     */
    @Test
    public void ejectCoinCallsEjectCoinWithContext() {

        // Invokation() of ejectCoin should result in an invokation
        // of ejectCoin(<Context>) on the initial state.
        // TODO 08 Test method forward from ejectCoin to ejectCoin(Context)
        fail( "ejectCoinCallsEjectCoinWithContext not implemented yet" );
    }

    /**
     * Ensure method forward from insertCoin to insertCoin(Context).
     */
    @Test
    public void insertCoinCallsInsertCoinOnContext() {

        // Invokation() of insertCoin should result in an invokation
        // of insertCoin(<Context>) on the initial state.
        // TODO 09 Test method forward from insertCoin to insertCoin(Context)
        fail( "insertCoinCallsInsertCoinOnContext not implemented yet" );
    }

    /**
     * Ensure method forward from refill(int) insertCoin(Context,int).
     */
    @Test
    public void refillCallsRefillWithContextAndCount() {

        // Test that if refill is invoked on a machine with a certain number of
        // balls as parameter, that refill is invoked on the initial state 
        // with that same numer as parameter.
        // TODO 10 Test method forward from refill(int) to insertCoin(Context,int)
        fail( "refillCallsRefillWithContextAndCount not implemented yet" );
    }

    /**
     * ToString is not empty.
     */
    @Test
    public void toStringTest() {
        // TODO 11 Test that toString on a machine object is not empty 
        fail( "toStringTest not implemented yet" );
    }

    /**
     * Assert that the default constructor called by the static method in the
     * API interface produces something useful.
     */
    @Test
    public void defaultMachinePerApiCall() {

        // Create a machine using the GumballAPI. Cast it to the implementation
        // type and test it the default initial state is SOLD_OUT.
        // TODO 12 Test the default constructor goes to initial state
        fail( "defaultMachinePerAPICall not implemented yet" );
    }

    /**
     * Test if this is a fair machine, as in you win once in a while. Add a
     * plenty balls and have plenty coins ready and try until you are winner.
     * This method has a timeout of 500 milliseconds because we are not very
     * patient when unit testing.
     */
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    @Test
    public void isThereEverAWinner() {

        // Create a machine with enough balls. Insert coins and draw gumballs in
        // a loop. Make sure that at least once your machine will answer positively
        // on isWinner(). The test will finish after a first winner case.
        // TODO 13 Test this is a fair machine, as in you win once in a while
        fail( "isThereEverAWinner not implemented yet" );
    }

    /**
     * Ensure that setOutput indeed sets the output that is returned by
     * getOutput.
     */
    @Test
    void setOutputHasEffect() {
        // TODO 14 Test set output by using a StringOutput instance
        fail( "setOutputHasEffectnot implemented yet" );
    }

    /**
     * Coverage, ensure that a machine is empty after the last ball is drawn.
     */
    @Test
    void machineWithOneBallIsEmptyAfterDispense() {
       
        // isEmpty() should be true in initial state,
        // it should be false after a refill with 1 ball, 
        // and it should be true after dispense again.
        // Use assertSoftly.
        
        // TODO 15 Test ensure that a machine is empty after the last ball is drawn
        fail( "machineWithOneBallIsEmptyAfterDispense not implemented yet" );
    }
}
