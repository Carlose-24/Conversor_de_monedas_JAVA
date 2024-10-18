## Conversor de Divisas

Este proyecto es un Conversor de Divisas en Java que permite a los usuarios convertir entre diferentes monedas utilizando tasas de cambio en tiempo real. El programa se conecta a una API externa para obtener datos de tasas de cambio y registra un historial de las conversiones realizadas.

## Características

* Validación de monedas.
* Conversión entre diferentes divisas.
* Registro del historial de consultas en un archivo de texto.
Requisitos
* Java 11 o superior.
* Conexión a Internet para acceder a la API de tasas de cambio.
Modo de Uso
1. Al iniciar el programa, verás un mensaje de bienvenida y una breve explicación sobre cómo utilizar el conversor.
2. Se te pedirá que ingreses la sigla de tu divisa principal (ej. USD, EUR, COP).
3. Elige una opción del menú:
o Ver el tipo de cambio actual.
o Convertir una cantidad específica.
o Cambiar tu divisa principal.
o Salir del programa.
## Ejemplo de Uso
1. Iniciar el Programa **Clase Principal**:
   
   
![image](https://github.com/user-attachments/assets/282ae5f6-e434-48a9-acd1-b5a621d04c3c)

2. Ingresar Divisa Principal Por ejemplo, USD (Dolar):
   
![image](https://github.com/user-attachments/assets/37856adc-a7c7-482a-9c08-df9af4b24b15)

3. Seleccionar Opción 1 para saber el valor de la moneda principal con respecto a otras monedas:
 
![image](https://github.com/user-attachments/assets/cf9417b8-37c9-49c3-b715-9fd1b10d9b3d)

4. Ver Tipo de Cambio:

![image](https://github.com/user-attachments/assets/dd394fc3-099b-4cb1-b5f2-5b260f713f06)

5. Seleccionar Opción 2 para convertir una cantidad especifica a otra moneda.

![image](https://github.com/user-attachments/assets/0e8d9892-2d19-423f-9735-ee89aad42077)

6. Introduce las siglas de la moneda a la que deseas realizar la conversión. Por ejemplo, si deseas convertir a COP (Peso colombiano):

![image](https://github.com/user-attachments/assets/887e339b-7b0f-4f33-824e-c600a349215e)

7. Introduce la cantidad de tu moneda principal que deseas convertir. Por ejemplo, si tienes 100 USD (Dolar) para convertir a COP(Peso colombiano):

![image](https://github.com/user-attachments/assets/d9d00d70-be74-405a-8d8b-4e0848eae808)

8. El programa te mostrará el resultado de la conversión:

![image](https://github.com/user-attachments/assets/83b6a6f3-b6c0-487a-95f4-bdbb6c73a499)

## Registrar Historial:
Cada vez que realices una consulta de conversión, el programa almacenará la operación en un archivo de texto llamado Historial_de_Consultas_Realizadas.txt. El historial incluirá la fecha y hora de la consulta, la divisa principal, la divisa de cambio, la cantidad convertida y el resultado de la conversión.

Ejemplo de entrada en el archivo de historial:

![image](https://github.com/user-attachments/assets/2cc7e955-ff0a-418b-8a35-f7e065fb45b7)



## Manejo de Errores Comunes
El programa está diseñado para manejar los errores más comunes que los usuarios pueden cometer:

- Siglas incorrectas: Si se ingresa una sigla de divisa incorrecta, el programa te indicará que no es válida y te pedirá que ingreses una sigla correcta.


- Opción incorrecta del menú: Si ingresas un número de opción fuera del rango del menú, el programa te pedirá que elijas una opción válida.

- Valor no numérico al convertir: Si ingresas un valor no numérico cuando te pide una cantidad a convertir, el programa te mostrará un error y te pedirá un valor válido.

![Errores comunes](https://github.com/user-attachments/assets/dbd21365-a097-49c2-ab75-47125fd5da81)
## Author

- Carlos Lopez 
- Linkedin: https://www.linkedin.com/in/carlos-eduardo-lopez-sandoval-8b9218141/ 


## Related

Preoyecto realizado para curso Java Alura Latam 
