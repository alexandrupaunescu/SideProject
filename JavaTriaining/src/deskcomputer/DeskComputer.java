/*
 * Class Desk Computer as the encapsulation an add components.
 */
package deskcomputer;

/**
 * Class Desk Computer as the encapsulation an add components.
 * @author Dinamo
 */
class DeskComputer {
    // create the keyboard of Desk Computer whit 15 Buttons
    DeskComputerButton[] keybord = {
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_0),
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_1),  
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_2),  
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_3),  
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_4),  
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_5),  
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_6),  
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_7),  
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_8),  
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_9),  
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_PLUS),
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_MINUS),
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_MULTIPLY),
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_DIVIDE),
      new DeskComputerButton(DeskComputerButton.ButtonMarkups.KEY_EQUAL),    
    };
    // create display of desk computer
    DeskComputerDisplay cd = new DeskComputerDisplay();

    public DeskComputerDisplay getCd() {
        return cd;
    }
    // ALU
     private ALU alu = new ALU(this);
    
    // method push key
     public void pushKey(DeskComputerButton.ButtonMarkups pushedButtonMarkup){
         for(DeskComputerButton currentButton:keybord)
             if(currentButton.getMarkup() == pushedButtonMarkup)
                alu.pushKey(currentButton);
        
        }
         
}
