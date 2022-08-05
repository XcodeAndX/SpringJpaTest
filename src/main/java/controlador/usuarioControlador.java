package controlador;

import com.PruebaTecnica.SpringJpaTest.Excepcion.RecordNotFoundException;
import entity.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import servicio.usuarioService;

import java.util.List;

@RestController
@RequestMapping("entity/usuario.java")
public class usuarioControlador {

    @Autowired
    usuarioService service;

    @GetMapping
    public ResponseEntity<List<usuario>> getAllUsers(){
        List<usuario> lista = service.getAllUsers();
        return  new ResponseEntity<List<usuario>>(lista,new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<usuario> getUsuarioId (@PathVariable("id") int id) throws RecordNotFoundException {

        usuario user = service.getUsuarioId(id);

        return new ResponseEntity<usuario> (user,new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<usuario> createorUpdateUser(usuario user) throws RecordNotFoundException{
        usuario actualizado = service.createOrUpdateUsuario(user);
        return new ResponseEntity<usuario>(actualizado,new HttpHeaders(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteUser(@PathVariable("id") int id) throws RecordNotFoundException{
        service.deleteUserbyId(id);
        return HttpStatus.FORBIDDEN;
    }



}
