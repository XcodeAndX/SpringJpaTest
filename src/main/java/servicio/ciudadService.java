package servicio;

import com.PruebaTecnica.SpringJpaTest.Excepcion.RecordNotFoundException;
import com.PruebaTecnica.SpringJpaTest.ciudadRepository;
import entity.ciudad;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ciudadService {

    @Autowired
    ciudadRepository repository;

    public List<ciudad> getAllCiudades(){
        List<ciudad> listaCiudades = repository.findAll();
        if (listaCiudades.size()>0){
            return listaCiudades;
        }
        else {
            return new ArrayList<ciudad>();
        }
    }

    public ciudad getCiudadId (int id) throws RecordNotFoundException{

        Optional <ciudad> ciudad = repository.findById(id);

        if (ciudad.isPresent()){
            return ciudad.get();
        }
        else {
            throw new RecordNotFoundException("No existe una ciudad con la ID dada");
        }
    }



}
