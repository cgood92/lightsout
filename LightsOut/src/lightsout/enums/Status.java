/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lightsout.enums;

/**
 *
 * @author Clinton
 */
public enum Status {
    IN_PROGRESS ("IN_PROGRESS"),
    HALTED ("HALTED"), 
    EXIT ("EXIT"), 
    PROCEED ("PROCEED"), 
    RETURN ("RETURN"), 
    ERROR ("ERROR");
    
    String status;
    
    Status(String value) {
        this.status = value;   
    }
    
    public String getStatus() {
        return status;
    }
}
