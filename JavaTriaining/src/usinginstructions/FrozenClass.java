/*
 *Final class
 */
package usinginstructions;

/**
 *Final class
 * @author Dinamo
 */
public final class FrozenClass {
    private String[] validkeys = {"12we34","33sd45","6ty5u7"};
    public boolean checkValidity(String key){
        boolean isValid = false;
        for(String currentKey:validkeys){
        if (currentKey.equals(key))
            isValid = true;
        }
        return isValid;
                
    }
}
