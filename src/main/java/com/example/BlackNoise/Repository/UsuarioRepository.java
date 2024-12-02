package com.example.BlackNoise.repository;

import com.example.blacknoise.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    // Método adicional para buscar por correo si lo necesitas
    Usuario findByCorreo(String correo);
}
