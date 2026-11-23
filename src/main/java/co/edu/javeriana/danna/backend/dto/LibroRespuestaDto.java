package co.edu.javeriana.danna.backend.dto;

public class LibroRespuestaDto {

    private Long id;
    private String titulo;
    private String autor;
    private Integer anioPublicacion;

    public LibroRespuestaDto(Long id, String titulo, String autor, Integer anioPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }
}
