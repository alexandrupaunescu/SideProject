/*
 * Test final classes
 */
package usinginstructions;

/**
 *Test final classes
 * @author Dinamo
 */
public class TestFinalClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrozenClass fz = new FrozenClass();
      boolean response = fz.checkValidity("12qq33");
        System.out.append("Key is valid: "+response);
    }
    
}
