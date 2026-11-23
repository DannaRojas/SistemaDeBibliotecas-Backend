# Sistema de Bibliotecas - Backend

## Descripción

La aplicación permite registrar bibliotecas y consultar las bibliotecas existentes junto con los libros asociados a cada una.

La relación del modelo es:

```text
Una Biblioteca puede tener varios Libros.
Cada Libro pertenece a una sola Biblioteca.
```

## Tecnologías

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2

## Estructura

```text
src/main/java/co/edu/javeriana/danna/backend
│
├── configuracion
│   └── DatosInicialesConfiguracion.java
├── controlador
│   └── BibliotecaControlador.java
├── dto
│   ├── BibliotecaSolicitudDto.java
│   ├── BibliotecaRespuestaDto.java
│   └── LibroRespuestaDto.java
├── entidad
│   ├── Biblioteca.java
│   └── Libro.java
├── repositorio
│   ├── BibliotecaRepositorio.java
│   └── LibroRepositorio.java
└── servicio
    └── BibliotecaServicio.java
```

## Rutas disponibles

| Método | Ruta | Descripción |
|---|---|---|
| POST | `/bibliotecas` | Registra una biblioteca |
| GET | `/bibliotecas` | Consulta las bibliotecas con sus libros asociados |

## Ejecutar el proyecto

Ubícate en la carpeta del backend:

```cmd
cd C:\Users\angie\Downloads\ParcialBackend\backend
```

Ejecuta:

```cmd
mvn spring-boot:run
```

El backend estará disponible en:

```text
http://localhost:8080
```

## Consultar bibliotecas

```cmd
curl.exe http://localhost:8080/bibliotecas
```

La respuesta incluye las bibliotecas y sus libros asociados.

## Registrar una biblioteca

```cmd
curl.exe -X POST "http://localhost:8080/bibliotecas" -H "Content-Type: application/json" -d "{\"nombre\":\"Biblioteca Sur\",\"direccion\":\"Direccion de prueba\",\"ciudad\":\"Ciudad de prueba\"}"
```

## Datos iniciales

Al iniciar el backend se cargan estos libros:

| Título | Autor | Año | Biblioteca |
|---|---|---:|---|
| Cien años de soledad | Gabriel García Márquez | 1967 | Biblioteca Central |
| El coronel no tiene quien le escriba | Gabriel García Márquez | 1961 | Biblioteca Norte |
