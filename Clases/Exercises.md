# Exercise 1
 (La clase Stock) Siguiendo el ejemplo de la clase Circulo, diseñar una clase llamada Stock que contenga:
 - Un campo de datos de tipo String llamado símbolo para el símbolo de la acción (stock).
 - Un campo de datos de tipo string llamado nombre para el nombre de la acción.
 - Un campo de datos de tipo double denominado precioCierrePrevio que almacena el precio del día anterior.
 - Un campo de datos double denominado precioActual que almacena el precio de las acciones para fecha actual.
 - Un constructor que crea una acción con el símbolo y el nombre especificados.
 - Un método llamado getCambioPorcentaje() que devuelve el porcentaje modificado considerando precioCierrePrevio y precioActual.

# Exercise 2 
 Supongamos que necesitamos modelar una tienda que vende productos. Cada producto tiene un nombre, 
 un precio y una cantidad en stock. Queremos implementar una clase Producto que permita crear y manipular
 objetos de este tipo. La clase debe tener los siguientes métodos:
 - Un constructor que recibe el nombre, precio y cantidad inicial del producto.
 - Métodos get y set para obtener y establecer el nombre, precio y cantidad del producto.
 - Un método vender que reduce la cantidad en stock del producto en una cierta cantidad.
 - Un método reponer que incrementa la cantidad en stock del producto en una cierta cantidad. 
 - Un método toString que devuelve una cadena con la información del producto.

# Exercise 3 
 (La clase Cuenta) Diseñe una clase llamada Cuenta que contenga:
 - Un campo de datos privado int llamado id para la cuenta (predeterminado 0).
 - Un campo de datos privado int denominado saldo para la cuenta (predeterminado 0).
 - Un campo de datos privado double denominado tasaInteresAnual que almacena la tasa de interés anual (por defecto 0).
   Suponga que todas las cuentas tienen la misma tasa de interés.
 - Un campo de datos de fecha privado llamado fechaCreacion que almacena la fecha en que se creó la cuenta.
 - Un constructor sin argumentos que crea una cuenta predeterminada.
 - Un constructor que crea una cuenta con la identificación y el saldo inicial especificados.
 - Los métodos de acceso y mutador (métodos get y set) para id, saldo y tasaInteresAnual
 - El método de acceso para fechaCreacion.
 - Un método denominado getTasaInteresMensual() que devuelve la tasa de interés mensual.
 - Un método denominado getInteresMensual() que devuelve el monto del interés mensual.
 - Un método llamado retiro que retira una cantidad específica de la cuenta.
 - Un método llamado depósito que deposita una cantidad específica en la cuenta.

# Exercise 4 
 (La clase Ventilador) Diseñe una clase llamada Ventilador para representar a un ventilador. La clase contiene:
 - Tres constantes denominadas SLOW, MEDIUM y FAST con los valores 1, 2 y 3 para denotar la velocidad del ventilador.
 - Un campo de datos int privado llamado speed que especifica la velocidad del ventilador (el valor predeterminado es SLOW).
 - Un campo de datos booleanos privados llamado on que especifica si el ventilador está encendido (el valor predeterminado es falso).
 - Un campo de datos double privado llamado radio que especifica el radio del ventilador (el valor predeterminado es 5).
 - Un campo de datos de tipo String llamado color que especifica el color del ventilador (el valor predeterminado es azul).
 - Los métodos de acceso y mutador para los cuatro campos de datos.
 - Un constructor sin argumentos que crea un ventilador predeterminado.
 - Un método llamado toString() que devuelve string con la descripción del ventilador.

 Si el ventilador está encendido, el método devuelve la velocidad, el color y el radio
 del ventilador en un string. Si el ventilador no está encendido, el método devuelve
 el color y el radio del ventilador junto con "el ventilador está apagado" en un string

# Exercise 5 
 (Geometría: polígono regular de n lados) En un polígono regular de n lados, todos los lados tienen las 
 misma longitud y todos los ángulos tienen el mismo grado (es decir, el polígono es tanto equilátero 
 como equiangular). Diseñe una clase llamada RegularPolygon que contiene:
 - Un campo de datos int privado llamado n que define el número de lados del polígono con valor predeterminado 3.
 - Un campo de datos double privado llamado lado que almacena la longitud del lado con valor predeterminado 1.
 - Un campo de datos double privado llamado x que define la coordenada x del centro del polígono con valor predeterminado 0.
 - Un campo de datos double privado llamado y que define la coordenada y del centro del polígono con valor predeterminado 0.
 - Un constructor sin argumentos que crea un polígono regular con valores predeterminados.
 - Un constructor que crea un polígono regular con el número especificado de lados y la longitud del lado, centrada en (0, 0).
 - Un constructor que crea un polígono regular con el número especificado de lados, longitud del lado y coordenadas x e y.
 - Los métodos de acceso y mutador para todos los campos de datos.
 - El método getPerimeter () que devuelve el perímetro del polígono.
 - El método getArea () que devuelve el área del polígono.

# Exercise 6 
 Diseñe una clase llamada QuadraticEquation para una ecuación cuadrática ax2 + bx + x = 0 . La clase contiene:
 - Campos de datos privados a, b y c que representan tres coeficientes.
 - Un constructor para los argumentos de a, b y c.
 - Tres métodos de acceso (getter) para a, b y c.
 - Un método llamado getDiscriminante () que devuelve el discriminante, que es b2 - 4ac.
 - Los métodos denominados getRoot1 () y getRoot2 () para devolver dos raíces de la ecuación
 Estos métodos son útiles solo si el discriminante no es negativo. Deje que estos métodos devuelven 0 si el discriminante es negativo.

# Exercise 7
 Diseñe una clase llamada LinearEquation para un sistema de ecuaciones lineales 2 x 2. La clase contiene:
 - Campos de datos privados a, b, c, d, e y f.
 - Un constructor con los argumentos de a, b, c, d, e y f.
 - Seis métodos getter para a, b, c, d, e y f.
 - Un método llamado isSolvable () que devuelve verdadero si ad - bc no es 0.
 - Métodos getX () y getY () que devuelven la solución de la ecuación.
