package co.edu.javeriana.danna.backend.repositorio;

import co.edu.javeriana.danna.backend.entidad.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {
}
