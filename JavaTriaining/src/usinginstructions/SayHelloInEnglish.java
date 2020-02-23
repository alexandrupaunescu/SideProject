/*
 * Class says hello in English language
 */
package usinginstructions;

/**
 *Class says hello in English language
 * @author Dinamo
 */
public class SayHelloInEnglish extends SayHello{

    @Override
    public void sayHello() {
        super.displayLine();
        System.out.println("Hello World!");
    }
    
}
