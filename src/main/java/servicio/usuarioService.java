package servicio;

import com.PruebaTecnica.SpringJpaTest.Excepcion.RecordNotFoundException;
import com.PruebaTecnica.SpringJpaTest.usuarioRepository;
import entity.usuario;
import org.springframework.beans.factory.annotation.Autowired;




import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class usuarioService {

    @Autowired
    usuarioRepository repository;

    public List<usuario> getAllUsers(){
        List<usuario> listaUsuario = repository.findAll();

        if (listaUsuario.size() >0){
            return listaUsuario;
        }
        else {
            return new ArrayList<usuario>();
        }
    }

    public usuario getUsuarioId (int id) throws RecordNotFoundException {
        Optional<usuario> usuario =repository.findById(id);
        if (usuario.isPresent())
        {
            return usuario.get();
        }
        else {
            throw new RecordNotFoundException("No existe un usuario con la ID dada.");
        }
    }

    public usuario createOrUpdateUsuario(usuario user) throws RecordNotFoundException{
        Optional<usuario> usuario = repository.findById(user.getId());
        if (usuario.isPresent())
        {
            usuario newUser = usuario.get();
            newUser.setName(user.getName());
            newUser.setLastName(user.getLastName());
            newUser.setEmail(user.getEmail());
            newUser.setCedula(user.getCedula());

            newUser = repository.save(user);
            return newUser;
        }
        else
        {
            user = repository.save(user);
            return user;
        }
    }

    public void deleteUserbyId(int id) throws RecordNotFoundException{
        Optional <usuario> user = repository.findById(id);

        if (user.isPresent())
        {
            repository.deleteById(id);
        }
        else
        {
            throw new RecordNotFoundException("No existe un usuario con la ID dada.");
        }
    }

}
