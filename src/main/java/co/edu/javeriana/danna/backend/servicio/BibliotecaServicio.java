package co.edu.javeriana.danna.backend.servicio;

import co.edu.javeriana.danna.backend.dto.BibliotecaRespuestaDto;
import co.edu.javeriana.danna.backend.dto.BibliotecaSolicitudDto;
import co.edu.javeriana.danna.backend.dto.LibroRespuestaDto;
import co.edu.javeriana.danna.backend.entidad.Biblioteca;
import co.edu.javeriana.danna.backend.entidad.Libro;
import co.edu.javeriana.danna.backend.repositorio.BibliotecaRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BibliotecaServicio {

    private final BibliotecaRepositorio bibliotecaRepositorio;

    public BibliotecaServicio(BibliotecaRepositorio bibliotecaRepositorio) {
        this.bibliotecaRepositorio = bibliotecaRepositorio;
    }

    public BibliotecaRespuestaDto registrar(BibliotecaSolicitudDto solicitud) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNombre(solicitud.getNombre());
        biblioteca.setDireccion(solicitud.getDireccion());
        biblioteca.setCiudad(solicitud.getCiudad());

        Biblioteca bibliotecaGuardada = bibliotecaRepositorio.save(biblioteca);
        return convertirABibliotecaRespuesta(bibliotecaGuardada);
    }

    @Transactional(readOnly = true)
    public List<BibliotecaRespuestaDto> consultarTodas() {
        return bibliotecaRepositorio.findAll()
                .stream()
                .map(this::convertirABibliotecaRespuesta)
                .toList();
    }

    private BibliotecaRespuestaDto convertirABibliotecaRespuesta(Biblioteca biblioteca) {
        List<LibroRespuestaDto> libros = biblioteca.getLibros()
                .stream()
                .map(this::convertirALibroRespuesta)
                .toList();

        return new BibliotecaRespuestaDto(
                biblioteca.getId(),
                biblioteca.getNombre(),
                biblioteca.getDireccion(),
                biblioteca.getCiudad(),
                libros
        );
    }

    private LibroRespuestaDto convertirALibroRespuesta(Libro libro) {
        return new LibroRespuestaDto(
                libro.getId(),
                libro.getTitulo(),
                libro.getAutor(),
                libro.getAnioPublicacion()
        );
    }
}
