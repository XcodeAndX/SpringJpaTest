package controlador;


import entity.ciudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import servicio.ciudadService;

import java.util.List;

@RestController
@RequestMapping("entity/organizacion.java")
public class ciudadControlador {

    @Autowired
    ciudadService service;

    @GetMapping
    public ResponseEntity<List<ciudad>> getAllCities(){
        List<ciudad> listaCiudad = service.getAllCiudades();
        return new ResponseEntity<List<ciudad>>(listaCiudad, new HttpHeaders(), HttpStatus.OK);
    }


}
