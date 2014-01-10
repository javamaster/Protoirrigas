/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mau.validation;

import br.com.mau.model.Setor;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.ValidatorFactory;
import static javax.validation.Validation.buildDefaultValidatorFactory;

/**
 *
 * @author Mauricio
 */
public class SetorValidator implements Validator<Setor> {
    
    private static ValidatorFactory factory;
    
    static {
        factory = buildDefaultValidatorFactory();
    }
            
    @Override
    public String validate(Setor s) {
      
        StringBuilder sb = new StringBuilder();
        
        if(s != null){
            javax.validation.Validator validator = factory.getValidator();
            
            Set<ConstraintViolation<Setor>> constraintSetor = validator.validate(s);
            
            if(!constraintSetor.isEmpty()){
                sb.append("Validação de Setor\n");
                for (ConstraintViolation<Setor> constraint : constraintSetor) {
                    sb.append(String.format("%n%s: %s", constraint.getPropertyPath(), constraint.getMessage()));
                }
            }            
        }
        return sb.toString();
    }
    
}
