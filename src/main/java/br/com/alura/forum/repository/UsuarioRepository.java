package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

       Optional<Usuario> findByEmail(String email);
}
