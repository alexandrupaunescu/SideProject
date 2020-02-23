/*
 * Abstract class for saying hello :)
 */
package usinginstructions;

/**
 *
 * @author Dinamo
 */
public abstract class SayHello {
    public static final String LINE ="---------------------------------";
    private String line = LINE;
            
 /** 
  * Methods print a line in cosole
  */           
    public void displayLine(){
         System.out.println(line);
    }
    /**
     Method display a greeeting in to a specified language
     * Specific language greeting is implemeted into an inherited class
     */
    public abstract void sayHello();
}
