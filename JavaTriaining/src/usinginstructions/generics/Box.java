/*
 * This is a generic box.
 */
package usinginstructions.generics;

/**
 * This is a generic box.
 * @author Dinamo
 * @param  <T> T is generic tipe that can be replaced whit a local type on call.
 */
public class Box<T extends Number>{
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
