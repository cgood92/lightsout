/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.enums;

/**
 *
 * @author Clinton
 */
public enum LightSwitch {
    HIGHLIGHT ("HIGHLIGHT"),
    DARKEN ("DARKEN");
    
    String status;
    
    LightSwitch(String value) {
        this.status = value;   
    }
    
    public String getStatus() {
        return status;
    }
}
