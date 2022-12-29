# Desarrollo de Sistemas Distribuidos
Repositorio de la materia Desarrollo de Sistemas Distribuidos

**Plan:** ISC 2009\
**Profesor:** Ukranio Coronilla Contreras

## Ejercicios de Clase

A continuación se detallan las instrucciónes de cada uno de los ejercicios y practicas realizadas en clase.

### Clase 4
Se ha elaborado el siguiente programa para convertir grados centígrados a Fahrenheit. Determine cual es el error y corríjalo mediante un cast para que dé el valor correcto.

```java
public class EjerciciosSerie1 {

    public static void main(String[] args){
        double c = 20;
        double f;
		
        f = (9/5) * c + 32.0;

        System.out.println(f);
}
```