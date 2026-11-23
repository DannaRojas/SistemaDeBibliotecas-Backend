package co.edu.javeriana.danna.backend.repositorio;

import co.edu.javeriana.danna.backend.entidad.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepositorio extends JpaRepository<Biblioteca, Long> {
}
