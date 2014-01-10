/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.validation;
import static javax.validation.Validation.buildDefaultValidatorFactory;
import javax.validation.ConstraintViolation;
import java.util.Set;
import br.com.mau.model.Cultura;
import javax.validation.ValidatorFactory;

/**
 *
 * @author Mauricio
 */
public class CulturaValidator implements Validator<Cultura> {

    private static ValidatorFactory factory;
    
    static {
        factory = buildDefaultValidatorFactory();
    }
    @Override
    public String validate(Cultura e) {
        StringBuilder sb = new StringBuilder();
        
        if(e != null){
            javax.validation.Validator validator = factory.getValidator();
            
        Set<ConstraintViolation<Cultura>> constraintViolations = validator.validate(e);
        
        if(!constraintViolations.isEmpty()){
            sb.append("Validando Cultura");
            
            for (ConstraintViolation<Cultura> constraint : constraintViolations) {
                sb.append(String.format("%n%s: %s", constraint.getPropertyPath(), constraint.getMessage()));
            }
        }
            
        }
        return sb.toString();
    }
    
}