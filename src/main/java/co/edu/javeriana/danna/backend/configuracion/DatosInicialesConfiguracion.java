package co.edu.javeriana.danna.backend.configuracion;

import co.edu.javeriana.danna.backend.entidad.Biblioteca;
import co.edu.javeriana.danna.backend.entidad.Libro;
import co.edu.javeriana.danna.backend.repositorio.BibliotecaRepositorio;
import co.edu.javeriana.danna.backend.repositorio.LibroRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DatosInicialesConfiguracion {

    @Bean
    CommandLineRunner cargarDatosIniciales(BibliotecaRepositorio bibliotecaRepositorio,
                                           LibroRepositorio libroRepositorio) {
        return argumentos -> {
            Biblioteca bibliotecaCentral = new Biblioteca();
            bibliotecaCentral.setNombre("Biblioteca Central");

            Biblioteca bibliotecaNorte = new Biblioteca();
            bibliotecaNorte.setNombre("Biblioteca Norte");

            bibliotecaRepositorio.saveAll(List.of(bibliotecaCentral, bibliotecaNorte));

            Libro cienAniosDeSoledad = new Libro();
            cienAniosDeSoledad.setTitulo("Cien años de soledad");
            cienAniosDeSoledad.setAutor("Gabriel García Márquez");
            cienAniosDeSoledad.setAnioPublicacion(1967);
            cienAniosDeSoledad.setBiblioteca(bibliotecaCentral);

            Libro elCoronel = new Libro();
            elCoronel.setTitulo("El coronel no tiene quien le escriba");
            elCoronel.setAutor("Gabriel García Márquez");
            elCoronel.setAnioPublicacion(1961);
            elCoronel.setBiblioteca(bibliotecaNorte);

            libroRepositorio.saveAll(List.of(cienAniosDeSoledad, elCoronel));
        };
    }
}
