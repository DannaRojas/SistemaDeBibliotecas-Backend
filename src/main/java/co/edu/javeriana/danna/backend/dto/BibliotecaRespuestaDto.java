package co.edu.javeriana.danna.backend.dto;

import java.util.List;

public class BibliotecaRespuestaDto {

    private Long id;
    private String nombre;
    private String direccion;
    private String ciudad;
    private List<LibroRespuestaDto> libros;

    public BibliotecaRespuestaDto(Long id, String nombre, String direccion, String ciudad,
                                  List<LibroRespuestaDto> libros) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.libros = libros;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public List<LibroRespuestaDto> getLibros() {
        return libros;
    }
}
