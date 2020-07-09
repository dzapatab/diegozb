## Reto Sophos.

Se recomienda tener Gradle 5.0 en adelante para la correcta ejecución de las automatizaciones.

## Metro
El cliente ingresa por la url https://www.metro.pe/especiales/cybermetro busca un producto en la barra de busqueda, lo seleccioná y lo agrega al carrito de compras

------------------------------------------------------------------------------------------
## PROYECTO AUTOMATIZADO Metro
Nombre: Reto
Lenguaje de programación: Java.
Frameworks: Selenium, JUnit y Serenity BDD.
Patrón de diseño: Screenplay.
Feature: Hecho en lenguaje Gherkin.
IDE: Eclipse
Driver: ChromeDriver.exe Versión: 2.40.565498
Manejo de dependencias con Gradle.

Para ejecutar la automatización se abre la consola en la raíz del proyecto, y se escribe el comando: gradle clean test --tests *Metro aggregate --info
--------------------------------------------------------------------------------------------
## COMO SE REALIZÓ
-----------------------------------------------------------------------------------------
Se hace uso de las siguientes capas en el main:
drivers, exceptions, interactions, models, questions, tasks, userinterfaces.
-----------------------------------------------------------------------------------------
Se hace uso de las siguientes capas en el sources java:
runners, stepdefinitions
-----------------------------------------------------------------------------------------
#########################################################################################   
-----------------------------------------------------------------------------------------

## gorest
El cliente ingresa por la url https://gorest.co.in/public-api/users crea un archivo JSON con nombre, apellido, sexo y correo, se consulta que se haya realizado exitosamente la creación del JSON comparando 2 valores asignados en el feature.

------------------------------------------------------------------------------------------
## PROYECTO AUTOMATIZADO gorest
Nombre: RetoApi
Lenguaje de programación: Java.
Frameworks: Selenium, JUnit y Serenity BDD.
Patrón de diseño: Screenplay.
Feature: Hecho en lenguaje Gherkin.
IDE: Eclipse
Manejo de dependencias con Gradle.
Libreria usada para API REST: serenity-screenplay-rest', version: '2.2.10'

Para ejecutar la automatización se abre la consola en la raíz del proyecto, y se escribe el comando: gradle clean test --tests *PeticionPostRunner aggregate --info
--------------------------------------------------------------------------------------------
## COMO SE REALIZÓ
-----------------------------------------------------------------------------------------
Se hace uso de las siguientes capas en el main:
exceptions, questions, tasks, utils, hooks.
-----------------------------------------------------------------------------------------
Se hace uso de las siguientes capas en el sources java:
runners, stepdefinitions
-----------------------------------------------------------------------------------------

#########################################################################################   
-----------------------------------------------------------------------------------------

## gorest
El cliente ingresa por la url https://gorest.co.in/public-api/users crea un archivo JSON con nombre, apellido, sexo y correo, se consulta que se haya realizado exitosamente la creación del JSON comparando 2 valores asignados en el feature.

------------------------------------------------------------------------------------------
## PROYECTO AUTOMATIZADO gorest
Nombre: RetoApiRest
Lenguaje de programación: Java.
Frameworks: Selenium, JUnit y Serenity BDD.
Patrón de diseño: estandar.
Feature: Hecho en lenguaje Gherkin.
IDE: Eclipse
Manejo de dependencias con maven.
Libreria usada para API REST: io.rest-assured version>4.1.2</version

Para ejecutar la automatización se abre la consola en la raíz del proyecto, y se escribe el comando: Mvn verify
--------------------------------------------------------------------------------------------
## COMO SE REALIZÓ
-----------------------------------------------------------------------------------------
Se hace uso de las siguientes capas en el main:
utils
-----------------------------------------------------------------------------------------
Se hace uso de las siguientes capas en el sources java:
runners, stepdefinitions
-----------------------------------------------------------------------------------------
