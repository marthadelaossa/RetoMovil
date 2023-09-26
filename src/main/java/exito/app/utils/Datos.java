package exito.app.utils;


import com.github.javafaker.Faker;

import java.util.Locale;

public class Datos {

    static Faker faker = new Faker(new Locale("es-MX"));

    private String nombre;
    private String apellido;
    private String numeroDocumento;
   private String correo;




    public Datos() {

        this.nombre = faker.name().firstName();
        this.apellido = faker.name().lastName();
        this.numeroDocumento = String.valueOf(faker.number().digits(10));
        this.correo = faker.internet().emailAddress();

    }

    public static Faker getFaker() {
        return faker;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getCorreo() {
        return correo;
    }
}


