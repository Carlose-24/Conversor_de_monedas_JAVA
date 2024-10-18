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
   
   
![image](https://github.com/user-attachments/assets/51651864-0667-423b-aa10-9dd48314ef2e)



2. Ingresar Divisa Principal Por ejemplo, USD (Dolar):
   
![image](https://github.com/user-attachments/assets/af45a72e-57da-4d77-a4bd-01f1cf8f0e1d)

3. Seleccionar Opción 1 para saber el valor de la moneda principal con respecto a otras monedas:
 
![image](https://github.com/user-attachments/assets/e1a978c4-ae65-4e98-917d-81408b5900bc)

4. Ver Tipo de Cambio:

![image](https://github.com/user-attachments/assets/3828e5f1-7515-4e89-b9bd-ed6b50d709d3)

5. Seleccionar Opción 2 para convertir una cantidad especifica a otra moneda.

![image](https://github.com/user-attachments/assets/3f480fda-89de-421f-933f-7c03850959d7)

6. Introduce las siglas de la moneda a la que deseas realizar la conversión. Por ejemplo, si deseas convertir a COP (Peso colombiano):

![image](https://github.com/user-attachments/assets/db8cd2b6-6274-4db3-8d32-8f69ea010e54)

7. Introduce la cantidad de tu moneda principal que deseas convertir. Por ejemplo, si tienes 100 USD (Dolar) para convertir a COP(Peso colombiano):

![image](https://github.com/user-attachments/assets/869ae6ec-7a42-4c4c-b766-3d02c9fed0f2)

8. El programa te mostrará el resultado de la conversión:

![image](https://github.com/user-attachments/assets/0b0ffd11-104f-40d6-8fb7-8bba200d61e3)

## Registrar Historial:
Cada vez que realices una consulta de conversión, el programa almacenará la operación en un archivo de texto llamado Historial_de_Consultas_Realizadas.txt. El historial incluirá la fecha y hora de la consulta, la divisa principal, la divisa de cambio, la cantidad convertida y el resultado de la conversión.

Ejemplo de entrada en el archivo de historial:

![image](https://github.com/user-attachments/assets/a9db8f55-8ff9-4b9d-9ae0-62198d84a589)




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
