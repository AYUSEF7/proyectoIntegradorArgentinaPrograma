
package com.portafolio.yusefalvaro.Service;

import com.portafolio.yusefalvaro.Entity.Persona;
import com.portafolio.yusefalvaro.Interface.IPersonaService;
import com.portafolio.yusefalvaro.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonarepository;

    @Override
    public List<Persona> getPersona() {
        List <Persona> persona = ipersonarepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonarepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonarepository.deleteById(id);
    }

    @Override
    public Persona findpersona(Long id) {
        Persona persona = ipersonarepository.findById(id).orElse(null);
        return persona;
    }

    @Override
    public Persona findPersona(long l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
