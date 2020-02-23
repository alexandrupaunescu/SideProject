/*
 * Testing test computer simulating an add opreations
 */
package deskcomputer;

/**
 ** Testing test computer simulating an add opreations
 * @author Dinamo
 */
public class TestDeskComputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a DeskComputer Object
        DeskComputer dc = new DeskComputer();
        //Push the desk computer keys to introduce first operand
        dc.pushKey(DeskComputerButton.ButtonMarkups.KEY_1);
        dc.pushKey(DeskComputerButton.ButtonMarkups.KEY_2);
        dc.pushKey(DeskComputerButton.ButtonMarkups.KEY_3);
        // introduce the operatin.
        dc.pushKey(DeskComputerButton.ButtonMarkups.KEY_PLUS);
        //introduce second operand
        dc.pushKey(DeskComputerButton.ButtonMarkups.KEY_3);
        dc.pushKey(DeskComputerButton.ButtonMarkups.KEY_2);
        dc.pushKey(DeskComputerButton.ButtonMarkups.KEY_1);
        // introduce =
        dc.pushKey(DeskComputerButton.ButtonMarkups.KEY_EQUAL);
    }
    
}
