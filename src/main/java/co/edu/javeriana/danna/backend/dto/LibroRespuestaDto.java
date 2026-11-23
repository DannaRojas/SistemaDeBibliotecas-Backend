package co.edu.javeriana.danna.backend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LibroRespuestaDto {

    private Long id;
    private String titulo;
    private String autor;
    private Integer anioPublicacion;
}
