/*
 * Class says hello in Romanian language
 */
package usinginstructions;

/**
 *Class says hello in Romanian language
 * @author Dinamo
 */
public class SayHelloInRomanian extends SayHello{

    @Override
    public void sayHello() {
        super.displayLine();
        System.out.println("Salut Lume!");
    }
    
}
