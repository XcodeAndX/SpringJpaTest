package servicio;

import com.PruebaTecnica.SpringJpaTest.Excepcion.RecordNotFoundException;
import com.PruebaTecnica.SpringJpaTest.organizacionRepository;
import entity.organizacion;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class organizacionService {

    @Autowired
    organizacionRepository repository;

    public organizacion getOrganizacionId(int id) throws RecordNotFoundException{
        Optional <organizacion> org= repository.findById(id);

        if (org.isPresent()){
            return org.get();
        }
        else {
            throw new RecordNotFoundException("No existe la organizacion con la id dada");
        }
    }
}
