package controlador;

import com.PruebaTecnica.SpringJpaTest.Excepcion.RecordNotFoundException;
import com.PruebaTecnica.SpringJpaTest.organizacionRepository;
import entity.organizacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import servicio.organizacionService;

import java.util.Optional;

@RestController
@RequestMapping("entity/organizacion.java")
public class organizacionControlador {

    @Autowired
    organizacionRepository repository;

    @GetMapping("/{Id}")
    public ResponseEntity<organizacion> getOrganizacionId (@PathVariable("id") int id) throws RecordNotFoundException{
        Optional<organizacion> organizacion = repository.findById(id);
        if (organizacion.isPresent()){
            return organizacion.get();
        }
        else {
            throw new RecordNotFoundException("No existe la organizacion con la ID dada");
        }
    }

}
