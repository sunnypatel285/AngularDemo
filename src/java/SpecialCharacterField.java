/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sunnyp
 */
public enum SpecialCharacterField {

    PLUS("+"),
    HASH("#");

    private String value;

    private SpecialCharacterField(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value; //This will return , # or +
    }
}
