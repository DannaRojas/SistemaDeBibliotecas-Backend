# Sistema de bibliotecas - Backend

Backend del taller de bibliotecas y libros.

## Requisitos implementados

- Entidades `Biblioteca` y `Libro` con relación uno a muchos.
- Repositorios para Biblioteca y Libro.
- Servicio y controlador REST de Biblioteca.
- `POST /bibliotecas` para registrar una biblioteca.
- `GET /bibliotecas` para consultar bibliotecas con sus libros asociados.
- Datos iniciales de los libros solicitados.

## Ejecutar

En la carpeta del proyecto:

```powershell
mvn spring-boot:run
```

El backend queda disponible en `http://localhost:8080`.

## Probar las rutas

Consultar las bibliotecas y sus libros:

```powershell
curl.exe http://localhost:8080/bibliotecas
```

Registrar una biblioteca:

```powershell
curl.exe --request POST http://localhost:8080/bibliotecas --header "Content-Type: application/json" --data '{"nombre":"Biblioteca Sur","direccion":"Direccion de prueba","ciudad":"Ciudad de prueba"}'
```

