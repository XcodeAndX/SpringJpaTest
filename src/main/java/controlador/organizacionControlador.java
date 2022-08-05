package controlador;

import com.PruebaTecnica.SpringJpaTest.Excepcion.RecordNotFoundException;
import entity.organizacion;
import entity.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
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
    organizacionService service;

    @GetMapping("/{id}")
    public ResponseEntity<organizacion> getOrganizacionId(@PathVariable("id") int id) throws RecordNotFoundException{

        organizacion organizacion = service.getOrganizacionId(id);

        return new ResponseEntity<organizacion>(organizacion, new HttpHeaders(), HttpStatus.OK);
    }

}
