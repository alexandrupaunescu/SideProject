/*
 * Defines the desk calculator button
 */
package deskcomputer;

/**
 * Defines the desk calculator button
 * @author Dinamo
 */
class DeskComputerButton {
        public static enum ButtonMarkups {
        KEY_0,
        KEY_1,
        KEY_2,
        KEY_3,
        KEY_4,
        KEY_5,
        KEY_6,
        KEY_7,
        KEY_8,
        KEY_9,
        KEY_PLUS,
        KEY_MINUS,
        KEY_MULTIPLY,
        KEY_DIVIDE,
        KEY_EQUAL, 
    };
    
    private ButtonMarkups markup;

    public ButtonMarkups getMarkup() {
        return markup;
    }
    
    public DeskComputerButton(ButtonMarkups markup){
        
        this.markup = markup;
    }
}
