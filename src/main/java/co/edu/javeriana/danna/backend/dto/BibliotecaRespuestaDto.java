package co.edu.javeriana.danna.backend.dto;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BibliotecaRespuestaDto {

    private Long id;
    private String nombre;
    private String direccion;
    private String ciudad;
    private List<LibroRespuestaDto> libros;
}
