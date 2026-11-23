package co.edu.javeriana.danna.backend.servicio;

import co.edu.javeriana.danna.backend.dto.BibliotecaRespuestaDto;
import co.edu.javeriana.danna.backend.dto.BibliotecaSolicitudDto;
import co.edu.javeriana.danna.backend.entidad.Biblioteca;
import co.edu.javeriana.danna.backend.repositorio.BibliotecaRepositorio;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BibliotecaServicio {

    private final BibliotecaRepositorio bibliotecaRepositorio;
    private final ModelMapper modelMapper;

    public BibliotecaServicio(BibliotecaRepositorio bibliotecaRepositorio,
                              ModelMapper modelMapper) {
        this.bibliotecaRepositorio = bibliotecaRepositorio;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public BibliotecaRespuestaDto registrar(BibliotecaSolicitudDto solicitud) {
        Biblioteca biblioteca = modelMapper.map(solicitud, Biblioteca.class);

        Biblioteca bibliotecaGuardada = bibliotecaRepositorio.save(biblioteca);
        return modelMapper.map(bibliotecaGuardada, BibliotecaRespuestaDto.class);
    }

    @Transactional(readOnly = true)
    public List<BibliotecaRespuestaDto> consultarTodas() {
        return bibliotecaRepositorio.findAll()
                .stream()
                .map(biblioteca -> modelMapper.map(biblioteca, BibliotecaRespuestaDto.class))
                .toList();
    }
}
