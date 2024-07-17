# Alura Foro Hub

Foro Hub es una aplicación web de foro desarrollada con Spring Boot, diseñada para gestionar tópicos de discusión. Esta aplicación incluye funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar) y utiliza JWT para autenticación y autorización.

## Características

- **CRUD de Tópicos**: Crear, leer, actualizar y eliminar tópicos.
- **Autenticación y Autorización**: Implementada con JWT.
- **Validaciones**: Validaciones de entrada de datos utilizando Jakarta Bean Validation.
- **Swagger**: Documentación de la API generada automáticamente.


## Requisitos Previos

- JDK 17 o superior
- Maven 3.8.1 o superior
- MySQL 8.0 o superior

## Configuración del Proyecto

+ Configura la base de datos MySQL:

    ```sql
    CREATE DATABASE foro_hub;
    CREATE USER 'foro_user'@'localhost' IDENTIFIED BY 'password';
    GRANT ALL PRIVILEGES ON foro_hub.* TO 'foro_user'@'localhost';
    FLUSH PRIVILEGES;
    ```

+ Configura las propiedades de la aplicación en `src/main/resources/application.properties`:

    ```spring.datasource.url=jdbc:mysql://localhost/foro_hub
    spring.datasource.username=root
    spring.datasource.password=tAd*R@XVNpix@s3
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true
    server.error.include-stacktrace=never
    api.security.secret=${DB_PASSWORD}
    ```


## Ejecución del Proyecto

1. Compila y ejecuta la aplicación con Maven:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

2. La aplicación estará disponible en `http://localhost:8080`.


## Dependencias Utilizadas

- Swagger
- Lombok
- Spring Web
- Spring Boot DevTools
- Spring Data JPA
- Flyway Migration
- MySQL Driver
- Validation
- Spring Security


## Uso de la API

### Autenticación

Para autenticarte, envía una solicitud POST a `/login` con las credenciales del usuario. Esto devolverá un token JWT que debe incluirse en el encabezado de autorización para todas las solicitudes posteriores.
