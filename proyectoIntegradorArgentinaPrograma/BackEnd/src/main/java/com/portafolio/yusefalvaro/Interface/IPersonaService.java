
package com.portafolio.yusefalvaro.Interface;

import com.portafolio.yusefalvaro.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona (Persona persona);
    
    public void deletePersona (Long id);
   
    public Persona findpersona(Long id);

    public Persona findPersona(long l);
}
