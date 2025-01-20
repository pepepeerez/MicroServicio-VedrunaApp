package es.vedruna.appVedruna.repository;

import es.vedruna.appVedruna.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    // Podemos agregar consultas personalizadas si es necesario
    //List<Usuario> findByEmailStartingWith(String prefix);
}