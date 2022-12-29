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

### Clase 5

#### Ejercicio 1
El programa consiste en generar n “palabras” de tres letras mayúsculas aleatorias e irlas concatenando en una cadena gigante, manteniendo un espacio en blanco de separación entre cada palabra. Posteriormente debe hacerse la búsqueda de la subcadena “IPN” en la cadena gigante y contabilizar el número de apariciones, así como la posición dentro de la cadenota donde apareció. El programa debe recibir el número n como parámetro en la línea de comandos de manera que debe incluir al inicio algo como:

```java
n = Integer.parseInt(args[0]);
```
Por cuestiones de desempeño la cadena deberá almacenarse en un arreglo de tipo byte:

```java
char[] cadenota = new char[n*4];
```

#### Ejercicio 2
Elabore un programa similar al anterior, pero utilizando la clase StringBuilder y el método append para almacenar la cadena grande, así como el método indexOf para buscar la subcadena “IPN”. Posteriormente y haciendo uso del método System.nanoTime() compare los tiempos de ejecución del ejercicio anterior con el actual haciendo las búsquedas en una cadena suficientemente grande donde al menos en uno de los dos casos el tiempo sea aproximadamente de un segundo. 

**Importante**: Su código no debe imprimir más que el número de ocurrencias, de lo contrario estará midiendo los tiempos de impresión más que los de procesamiento. Si es necesario optimice ambos códigos lo mejor posible.

### Clase 6

#### Ejercicio 1
Basándose en el código de la clase, elabore la clase `PoligonoIrreg` la cual representa un polígono irregular en los cuatro cuadrantes del plano cartesiano, cuyos vértices se componen de un arreglo simple de n objetos Coordenada:

```java
Rectangulo rect1 = new Rectangulo(c1, c2);
```

Donde c1 y c2 son dos objetos Coordenada.

#### Ejercicio 2
Basándose en el código anterior, elabore la clase `PoligonoIrreg` la cual representa un polígono irregular en los cuatro cuadrantes del plano cartesiano, cuyos vértices se componen de un arreglo simple de n objetos Coordenada: 

```java
private Coordenada[] vertices;
```

Se debe disponer de los métodos `anadeVertice` para añadir un vértice al polígono, es decir un objeto Coordenada, y sobrescribir el método `toString()` para imprimir el conjunto de vértices que componen al polígono.

#### Ejercicio 3
Retome el ejercicio anterior para medir cuanto tiempo tarda la creación de un objeto `PoligonoIrreg` con diez millones de vértices. Los vértices se agregan en un ciclo que crea objetos `Coordenada` mediante New y asignando en cada objeto coordenadas aleatorias.

Posteriormente modifíquelo y en lugar de utilizar New, utilice un mutador set (setter) para inicializar los valores de los objetos `Coordenada`. 

### Clase 7

#### Ejercicio 1
Despues de leer

[Diferencia entre clases abstractas e interfaces en Java](https://codigofacilito.com/articulos/clases-abstractas-interfaces-java)

Modifique el código del ejercicio 7 en la clase 6 para incorporar la clase abstracta Figura con el método abstracto area() como se explica en el link anterior. Herede de la clase Figura la clase Rectangulo y la clase Cuadrado y programe el método area() para que imprima el área del rectángulo y del cuadrado de dichos objetos instanciados en la función principal.

#### Ejercicio 2
Incorpore la interfaz

```java
public interface Perimetro{

   public static final double PI = 3.14159;

   float imprimePerimetro();
}
```

Impleméntela en las clases Rectangulo y Cuadrado, finalmente pruébelas en la función principal.

### Clase 9

#### Ejercicio 1
Retome la solución del ejercicio 8 en la clase 6 y modifíquelo para que la clase PoligonoIrreg almacene los vértices en un objeto ArrayList ( véase [Comparator Interface in Java with Examples](https://www.geeksforgeeks.org/list-interface-java-examples/?ref=gcse) ). Asimismo, dentro del método toString haga uso de un bucle for-each para imprimir los elementos de ArrayList.

#### Ejercicio 2

Incluya en la clase PoligonoIrreg el método ordenaVertices para ordenar los vértices de menor a mayor en función de su magnitud (distancia de la coordenada al origen) con ayuda de la interfaz Comparator ( véase [Comparator Interface in Java with Examples](https://www.geeksforgeeks.org/list-interface-java-examples/?ref=gcse) ). Se recomienda agregar al objeto coordenada un nuevo miembro magnitud para facilitar el ordenamiento.

En el método principal instancie un objeto PoligonoIrreg al cual posea 10 vértices, todos ellos con valores reales aleatorios tanto positivos como negativos comprendidos entre -100.000 y 100.000 Imprima los vértices del polígono, mande a llamar el método de ordenamiento y posteriormente vuelva a imprimir los vértices del polígono. Es importante que los valores en las coordenadas tengan al menos tres dígitos decimales aleatorios.

### Clase 10

#### Ejercicio 1
Después de leer en la siguiente página ( [Iterators in Java](https://www.geeksforgeeks.org/iterators-in-java/) ) el subtema correspondiente al cursor Iterator de Java, elabore un programa que almacene n CURPs en un ArrayList e imprima todos sus elementos. Posteriormente debe usar al cursor Iterator para eliminar de la lista a todas las CURPs cuyo sexo sea masculino o femenino, según se especifique por el usuario, e imprima al final el arreglo filtrado. Tanto el numero n como el sexo se deben especificar como parámetros del programa.

#### Ejercicio 2
Usando el cursor Iterator elabore un programa que vaya generando CURPs y las vaya imprimiendo y almacenando en un ArrayList en orden ascendente respecto a los primeros cuatro caracteres alfabéticos. Cada que se genera una nueva CURP se debe insertar en el lugar correspondiente de la lista, sin necesidad de usar algún método de ordenamiento. Al igual que el ejercicio anterior, el número de CURPs se debe introducir en la línea de comandos.

Sugerencia: Usar el método compareTo de la clase String para determinar el orden de las CURP.

### Clase 11

#### Ejercicio 1
Haciendo uso de la interfaz Runnable de Java explicada en: [Runnable interface in Java](https://www.geeksforgeeks.org/runnable-interface-in-java/?ref=gcse).

Cree dos hilos que accedan a una variable compartida var_compartida de tipo int que inicialmente tiene un valor de cero.  Ambos hilos deben ejecutar un único método run() el cual se encargará de modificar la variable compartida. El método run() ejecutará en un ciclo de n veces (donde n se recibe en la línea de comandos) al método modifica() el cual se encarga de incrementar en uno o decrementar en uno a var_compartida según sea el caso. Si se trata del primer hilo que se creó deberá incrementar en uno la variable compartida, y si es el segundo hilo se deberá decrementar en uno la variable compartida. Para identificar de qué hilo se trata y pasar parámetros a los hilos léase:

[How to Get the Id of a Current Running Thread in Java?](https://www.geeksforgeeks.org/how-to-get-the-id-of-a-current-running-thread-in-java/#:~:text=In%20the%20run()%20method,invoked%20the%20run()%20method)

Cuando ambos hilos hayan terminado de ejecutarse (véase el método join() para asegurarse que ambos hilos se han ejecutado por completo ( vease en [Java Concurrency – yield(), sleep() and join() Methods](https://www.geeksforgeeks.org/java-concurrency-yield-sleep-and-join-methods/?ref=lbp) ), la función principal deberá imprimir el valor de la variable compartida.

Ejecute su programa varias veces incrementando n hasta poder visualizar las condiciones de competencia. Es importante no imprimir nada en el programa para que el calendarizador de hilos opere de manera concurrente.

#### Ejercicio 2

Podemos resolver la condición de competencia haciendo que el método modifica() se ejecute sólo por un hilo a la vez con synchronized quedando:

```java
public synchronized void modifica()
```

Pruébela para verificar que ya no hay inconsistencias. 