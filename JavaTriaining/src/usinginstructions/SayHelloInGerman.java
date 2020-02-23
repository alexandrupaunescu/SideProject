/*
 * Class says hello in German language
 */
package usinginstructions;

/**
 *Class says hello in German language
 * @author Dinamo
 */
public class SayHelloInGerman extends SayHello{

    @Override
    public void sayHello() {
        super.displayLine();
        System.out.println("Hallo Welt!");
    }
    
}
