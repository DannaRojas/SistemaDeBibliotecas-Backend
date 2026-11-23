package co.edu.javeriana.danna.backend.controlador;

import co.edu.javeriana.danna.backend.dto.BibliotecaRespuestaDto;
import co.edu.javeriana.danna.backend.dto.BibliotecaSolicitudDto;
import co.edu.javeriana.danna.backend.servicio.BibliotecaServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bibliotecas")
public class BibliotecaControlador {

    private final BibliotecaServicio bibliotecaServicio;

    public BibliotecaControlador(BibliotecaServicio bibliotecaServicio) {
        this.bibliotecaServicio = bibliotecaServicio;
    }

    @PostMapping
    public ResponseEntity<BibliotecaRespuestaDto> registrar(
            @RequestBody BibliotecaSolicitudDto solicitud) {
        BibliotecaRespuestaDto biblioteca = bibliotecaServicio.registrar(solicitud);
        return ResponseEntity.status(HttpStatus.CREATED).body(biblioteca);
    }

    @GetMapping
    public List<BibliotecaRespuestaDto> consultarTodas() {
        return bibliotecaServicio.consultarTodas();
    }
}
