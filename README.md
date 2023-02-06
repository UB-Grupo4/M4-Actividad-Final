![ub](https://user-images.githubusercontent.com/122720038/213809348-cf4eac0e-b551-4e64-b08a-50616dd995c7.PNG) 

# **M4-Actividad-Final**
Ejercicio de Automatización sobre una Aplicación Web

## **Tabla de contenidos**
- [Inicio](#inicio)
- [1. Introducción](#1-introducción)
  * [1.1 Objetivos](#11-objetivos)
  * [1.2 Instrucciones](#12-instrucciones)
- [2. Conjunto de herramientas iniciales](#2-conjunto-de-herramientas-iniciales)
  * [2.1 Instalación de prerequisitos](#21-instalación-de-prerequisitos)
    + [2.1.1 Git](#211-git)
- [3. Conjunto de herramientas de desarrollo](#3-conjunto-de-herramientas-de-desarrollo)
  * [3.1 Instalación de herramientas](#31-instalación-de-herramientas)
    + [3.1.1 Java SE Development Kit](#311-java-se-development-kit)
    + [3.1.2 Apache Maven](#312-apache-maven)
    + [3.1.3 IntelliJ IDEA](#313-intellij-idea)
- [4. Creación del proyecto](#4-creación-del-proyecto)
  * [4.1 Uso de la herramienta](#41-uso-de-la-herramienta)
  * [4.2 Creación del fichero Project Object Model](#42-creación-del-fichero-project-object-model)
    + [4.2.1 Project Object Model](#421-project-object-model)
  * [4.3 Creación del directorio PageObjects y sus ficheros](#43-creación-del-directorio-pageobjects-y-sus-ficheros)
    + [4.3.1 PageObjects](#431-pageobjects)
  * [4.4 Creación del directorio starter y sus ficheros](#44-creación-del-directorio-starter-y-sus-ficheros)
    + [4.4.1 starter](#441-starter)
  * [4.5 Creación del directorio steps y sus ficheros](#45-creación-del-directorio-steps-y-sus-ficheros)
    + [4.5.1 steps](#451-steps)
  * [4.6 Creación del directorio drivers y sus ficheros](#46-creación-del-directorio-drivers-y-sus-ficheros)
    + [4.6.1 drivers](#461-drivers)
  * [4.7 Estructura de ficheros](#47-estructura-de-ficheros)
- [5. Ejecución de Pruebas](#5-ejecución-de-pruebas)
  * [5.1 Test 1 Sign Up en la Tienda Online](#51-test-1-sign-up-en-la-tienda-online)
    + [5.1.1 COMO usuario QUIERO ser capaz de darme de alta](#511-como-usuario-quiero-ser-capaz-de-darme-de-alta)
  * [5.2 Test 2 Iniciar sesión](#52-test-2-iniciar-sesión)
    + [5.2.1 COMO usuario QUIERO ser capaz de iniciar sesión en la Tienda Online](#521-como-usuario-quiero-ser-capaz-de-iniciar-sesión-en-la-tienda-online)
  * [5.3 Test 3 Navegar en Teléfonos ordenadores y pantallas](#53-test-3-navegar-en-teléfonos-ordenadores-y-pantallas)
    + [5.3.1 COMO usuario QUIERO ser capaz de navegar por diferentes productos](#531-como-usuario-quiero-ser-capaz-de-navegar-por-diferentes-productos)
  * [5.4 Test 4 Añadir al carrito](#54-test-4-añadir-al-carrito)
    + [5.4.1 COMO usuario QUIERO añadir un s7 un s6 y un vaio i7](#541-como-usuario-quiero-añadir-un-s7-un-s6-y-un-vaio-i7)
  * [5.5 Test 5 Eliminar del carrito](#55-test-5-eliminar-del-carrito)
    + [5.5.1 COMO usuario QUIERO eliminar el Samsung galaxy s6](#551-como-usuario-quiero-eliminar-el-samsung-galaxy-s6)
  * [5.6 Test 6 Pedido de artículos](#56-test-6-pedido-de-artículos)
    + [5.6.1 COMO usuario QUIERO realizar el pedido de artículos seleccionados](#561-como-usuario-quiero-realizar-el-pedido-de-artículos-seleccionados)
- [6. Resultado Final](#6-resultado-final)
  * [6.1 Instalación de herramientas](#31-instalación-de-herramientas)
    + [6.1.1 Java SE Development Kit](#311-java-se-development-kit)
- [7. Realizado Con](#7-realizado-con)
- [8. Autores](#8-autores)
- [9. Licencia](#9-licencia)

## Inicio
El proyecto consiste en implementar comprobaciones automatizadas web en el siguiente enlace <a href="https://www.demoblaze.com/index.html" onclick="window.open(this.href, '_blank'); return false;">TIENDA ONLINE</a>

[Volver al menú](#tabla-de-contenidos)

## **1. Introducción**
El proyecto consiste en la implementación de pruebas automatizadas para verificar su correcto funcionamiento.

[Volver al menú](#tabla-de-contenidos)

### 1.1 Objetivos
Aprender a crear un proyecto de automatización web con tecnología Maven  
Aprender a respetar el Patrón AAA durante la creación de la prueba automática  
Aprender a ejecutar la prueba de forma local y por comandos Maven  
Aprender a utilizar el patrón de diseño de objetos en pruebas automatizadas  
Aprender a utilizar correctamente el lenguaje Gherkin.

[Volver al menú](#tabla-de-contenidos)

### 1.2 Instrucciones
El lenguaje de programación a utilizar ha de ser Java y el framework para automatizar dichas pruebas automáticas  
ha de ser Selenium WebDriver, Maven, Junit, AssertJ y Cucumber/Gherkin. Otra de las herramientas que se puede  
utilizar en sustitución de Selenium WebDriver podrá ser Serenity BDD (esta herramienta ya tiene integrado  
Selenium WebDriver y la librería Junit).

[Volver al menú](#tabla-de-contenidos)

## **2. Conjunto de herramientas iniciales**
El proyecto requiere contar con una serie de prerequisitos y herramientas las cuales se describen a continuación:

[Volver al menú](#tabla-de-contenidos)

#### 2.1 Instalación de prerequisitos 
A continuación se detalla la lista de Prerequisitos requeridos:

[Volver al menú](#tabla-de-contenidos)

##### 2.1.1 Git

**A)** Ir al siguiente enlace: <a href="https://git-scm.com/" onclick="window.open(this.href, '_blank'); return false;">Git</a>

<p align="left">
    <img width="500" alt="git_webpage" src="https://user-images.githubusercontent.com/122720038/213792206-f32d9ece-63e8-4ec2-8dde-9e8715bf4623.PNG">
</p>

[Volver al menú](#tabla-de-contenidos)

**B)** Descargar e instalar Git

<p align="left">
  <img src="https://user-images.githubusercontent.com/122720038/213799332-a551f771-f532-4432-b7ce-7ff59caf1777.PNG" width="350" />
  <img src="https://user-images.githubusercontent.com/122720038/213799595-b935757e-4e48-4e78-9b3f-25aacc83b4ec.PNG" width="350" /> 
</p>

[Volver al menú](#tabla-de-contenidos)

**C)** Verificar la instalación de Git

<p align="left">
    <img width="400" alt="git_version" src="https://user-images.githubusercontent.com/122720038/213815492-75d894eb-c86f-4c6a-8db2-1f72197e681d.PNG">
</p>

[Volver al menú](#tabla-de-contenidos)

## **3. Conjunto de herramientas de desarrollo**
El proyecto requiere una serie de herramientas para pruebas y desarrollo las cuales se describen a continuación:

[Volver al menú](#tabla-de-contenidos)

#### 3.1 Instalación de herramientas
A continuación se detalla la lista de herramientas requeridas:

[Volver al menú](#tabla-de-contenidos)

##### 3.1.1 Java SE Development Kit

**A)** Ir al siguiente enlace: <a href="https://www.oracle.com/java/technologies/downloads/" onclick="window.open(this.href, '_blank'); return false;">Java SE Development Kit</a>

<img width="650" alt="jdk" src="https://user-images.githubusercontent.com/122720038/213766846-59b20f3a-db03-47b9-a160-ba3082271919.png">

[Volver al menú](#tabla-de-contenidos)

**B)** Descargar e instalar Java SE Development Kit

<p align="left">
  <img src="https://user-images.githubusercontent.com/122720038/213831077-e7119151-ce3e-429d-99ec-faddc9d9bee4.PNG" width="325" />
  <img src="https://user-images.githubusercontent.com/122720038/213831185-72fbd98e-6409-4d18-914f-94081d8f1e4e.PNG" width="325" /> 
</p>

[Volver al menú](#tabla-de-contenidos)

**C)** Verificar la instalación de Java SE Development Kit

<p align="left">
    <img width="650" alt="java_version" src="https://user-images.githubusercontent.com/122720038/213831236-97808b9c-9efb-4f78-a297-8d3292360d04.PNG">
</p>

[Volver al menú](#tabla-de-contenidos)

##### 3.1.2 Apache Maven

**A)** Ir al siguiente enlace: <a href="https://maven.apache.org/download.cgi" onclick="window.open(this.href, '_blank'); return false;">Apache Maven</a>

<img width="650" alt="apache_maven" src="https://user-images.githubusercontent.com/122720038/213772643-ac8b8917-c1d4-4ab8-8209-be8ecd1023ee.png">

[Volver al menú](#tabla-de-contenidos)

**B)** Descargar, instalar y verificar Apache Maven

<p align="left">
    <img width="650" alt="maven_version" src="https://user-images.githubusercontent.com/122720038/213831335-130d9a99-b1dc-4ae6-ac89-5051c283f61b.PNG">
</p>

[Volver al menú](#tabla-de-contenidos)

##### 3.1.3 IntelliJ IDEA

**A)** Ir al siguiente enlace: <a href="https://www.jetbrains.com/idea/" onclick="window.open(this.href, '_blank'); return false;">IntelliJ IDEA</a>

<img width="650" alt="intellij" src="https://user-images.githubusercontent.com/122720038/213779508-de1d1c72-d362-425c-a0ce-0f2b55619248.png">

[Volver al menú](#tabla-de-contenidos)

**B)** Descargar e instalar IntelliJ IDEA

<p align="left">
  <img src="https://user-images.githubusercontent.com/122720038/213832306-58d7a34e-9cce-4bce-8929-fac5d1b4db91.PNG" width="325" />
  <img src="https://user-images.githubusercontent.com/122720038/213832763-cc678a1e-0df9-4b17-8965-9f1ead6d6e66.PNG" width="325" /> 
</p>

[Volver al menú](#tabla-de-contenidos)

### 4. Creación del proyecto

El proyecto consiste en 6 diferentes Tests.

**A)** Ir al siguiente enlace: <a href="https://www.demoblaze.com/index.html" onclick="window.open(this.href, '_blank'); return false;">Página de Test</a>

<p align="left">
    <img width="650" alt="demoblaze_page" src="https://user-images.githubusercontent.com/122720038/216883348-d9ae7d4a-54bc-43c1-93d0-fdda9303c361.png">
</p>

[Volver al menú](#tabla-de-contenidos)

#### 4.1 Uso de la herramienta
Se utiliza IntelliJ IDEA para el desarrollo de los tests en Java.

**A)** Se abre IntelliJ IDEA y se selecciona "Crear nuevo proyecto"  
**B)** Se debe seleccionar Maven como tipo de proyecto y el SDK  
**C)** Se completa el GroupID, ArtifactID y versión del proyecto  
**D)** Se da clic en Finalizar para crear el proyecto y generar el fichero pom.xml

[Volver al menú](#tabla-de-contenidos)

#### 4.2 Creación del fichero Project Object Model
A continuación se detalla la lista de ficheros:

[Volver al menú](#tabla-de-contenidos)

##### 4.2.1 Project Object Model
Se edita el fichero pom.xml generado al inicio del proyecto con los plugins y dependencias  

**Plugins:**  

**maven-compiler-plugin:** Compila el código fuente  
**maven-surefire-plugin:** Ejecuta pruebas unitarias  
**serenity-maven-plugin:** Genera informes para las pruebas ejecutadas con Serenity  

**Dependencies:**  

**serenity-core:** Dependencia central del marco Serenity BDD  
**serenity-junit:** Integración JUnit para Serenity BDD  
**assertj-core:** Escribe aserciones en las pruebas de Java  
**junit:** Marco de prueba JUnit  
**sl4j-simple:** Se utiliza para registros  
**serenity-cucumber:** Es la integración de Serenity BDD con Cucumber

<p align="left">
<img width="650" alt="apache_maven" src="https://user-images.githubusercontent.com/122720038/216892055-adc8ca78-3a4f-4949-b018-614ed9527ae4.png">
</p>

[Volver al menú](#tabla-de-contenidos)

#### 4.3 Creación del directorio PageObjects y sus ficheros  

A continuación se detalla la creacion del directorio de PageObjects y sus ficheros:

[Volver al menú](#tabla-de-contenidos)

##### 4.3.1 PageObjects  

Es un patrón de diseño para pruebas automatizadas, componiendose de varios ficheros para el proyecto  

**PageObjects ficheros:**  

CartPage  
HomePage  
LogInPage  
ProductPage  
PurchasePage  
SignInPage  

<p align="left">
<img width="450" alt="PageObjects_pic" src="https://user-images.githubusercontent.com/122720038/216912748-85caeb8d-37d9-42f3-b499-370b33e69978.PNG">
</p>

Los ficheros mencionados anteriormente usan la siguiente esctructura:  

**Java class:** Una sola página en la aplicación bajo prueba, hereda la clase "PageObject"  
**PageObject:** Proporciona una interfaz común para interactuar con la página  
**@FindBy:** Anotación que se usa para ubicar elementos de una página  
**@Managed:** Administra la instancia de WebDriver para interactuar con la página  
**public methods:** Define las acciones de una página dentro de la clase  
**public list:** Define los elementos de una página dentro de la clase

[Volver al menú](#tabla-de-contenidos)

#### 4.4 Creación del directorio starter y sus ficheros  

A continuación se detalla la creacion del directorio starter y sus ficheros:

[Volver al menú](#tabla-de-contenidos)

##### 4.4.1 starter 

El directorio starter contiene los ficheros que inician cada prueba JUnit usando el marco Serenity BDD.  

**starter ficheros:**  

Test1Starter  
Test2Starter  
Test3Starter  
Test4Starter  
Test5Starter  
Test6Starter  

<p align="left">
    <img width="450" alt="starter_pic" src="https://user-images.githubusercontent.com/122720038/216913822-b0d2e7f2-c932-457c-b61f-9dd1ee63542f.PNG">
</p>

Los ficheros mencionados anteriormente usan la siguiente esctructura:  

**package starter:** El paquete que declara el inicio de cada prueba  
**Import:** Donde se importan las librerias y clases requeridas  
**@RunWith(SerenityRunner.class):** Anotación JUnit que especifica el inicio de cada prueba  
**public class:** Nombre de la clase, indica la funcionalidad de la prueba.  
**Objetos WebDriver y WebDriverWait:** Administrados por Serenity, indican el navegador  
y el tiempo de espera de los elementos que se cargan  
**@steps:** Anotación que se usa para declarar un objeto de pasos reutilizables para la prueba.  
**@Test:** Anotación que indica que el método es un caso de prueba. 

[Volver al menú](#tabla-de-contenidos)

#### 4.5 Creación del directorio steps y sus ficheros  

A continuación se detalla la creacion del directorio starter y sus ficheros:

[Volver al menú](#tabla-de-contenidos)

##### 4.5.1 steps

El directorio steps contiene clases que definen los pasos de el nivel superior de un escenario de prueba.  

**steps ficheros:**  

Test1Steps  
Test2Steps  
Test3Steps  
Test4Steps  
Test5Steps  
Test6Steps  

<p align="left">
    <img width="450" alt="steps_pic" src="https://user-images.githubusercontent.com/122720038/216926769-5024a6ce-12e8-4688-9133-89ad65d6756d.PNG">
</p>

Los ficheros mencionados anteriormente usan la siguiente esctructura:  

**package steps:** Define el paquete de cada clase de los pasos para un escenario de prueba  
**public class:** Define los métodos que representan los pasos en el escenario de prueba.  
**@Step:** Anotación que indica un paso en el escenario de prueba

[Volver al menú](#tabla-de-contenidos)

#### 4.6 Creación del directorio drivers y sus ficheros  

A continuación se detalla la creacion del directorio drivers y sus ficheros:

[Volver al menú](#tabla-de-contenidos)

##### 4.6.1 drivers

El directorio drivers contiene otros directorios divididos por sistema operativo y en el caso de MacOS por CPU. 

**drivers directorios por O.S. y sus ficheros:**  

linux/chromedriver  
mac64/chromedriver  
mac_arm64/chromedriver  
windows/chromedriver

<p align="left">
    <img width="450" alt="drivers_pic" src="https://user-images.githubusercontent.com/122720038/216939472-a3adef54-ee49-4fac-ba06-571b2839c1f5.PNG">
</p>

El fichero "chromedriver" es una herramienta que automatiza las interacciones del navegador con fines de prueba  
por ser un WebDriver. El código de cada test envía comandos al "chromedriver", para realizar acciones deseadas  
en el navegador como hacer clic, navegar e ingresar datos.

[Volver al menú](#tabla-de-contenidos)

#### 4.7 Estructura de ficheros  

Jerarquía de ficheros:

```
|-- Project
|-- M4-Actividad-Final
|-- .idea/
|-- .mvn/
|-- src/
|   |-- main/
|   |   |-- java/
|   |   |-- resources/
|   |-- test/
|   |   |-- java/
|   |   |   |-- PageObjects/
|   |   |   |   |   |-- CartPage/
|   |   |   |   |-- HomePage/
|   |   |   |   |-- LogInPage/
|   |   |   |   |-- ProductPage/
|   |   |   |   |-- PurchasePage/
|   |   |   |   |-- SignInPage/
|   |   |   |-- starter/
|   |   |   |   |-- Test1Starter
|   |   |   |   |-- Test2Starter
|   |   |   |   |-- Test3Starter
|   |   |   |   |-- Test4Starter
|   |   |   |   |-- Test5Starter
|   |   |   |   |-- Test6Starter
|   |   |   |-- steps/
|   |   |   |   |-- Test1Steps
|   |   |   |   |-- Test2Steps
|   |   |   |   |-- Test3Steps
|   |   |   |   |-- Test4Steps
|   |   |   |   |-- Test5Steps
|   |   |   |   |-- Test6Steps
|   |   |-- resources/
|   |   |   |-- drivers/
|   |   |   |   |-- linux/
|   |   |   |   |   |-- chromedriver
|   |   |   |   |-- mac64/
|   |   |   |   |   |-- chromedriver
|   |   |   |   |-- mac_arm64/
|   |   |   |   |   |-- chromedriver
|   |   |   |   |-- windows/
|   |   |   |   |   |-- chromedriver
|   |   |   |-- serenity.conf
|-- target/
|-- .gitignore
|-- Pom.xml
|-- README.md
|-- serenity.properties
|-- External Libraries/
|-- Scratches and Consoles
```
[Volver al menú](#tabla-de-contenidos)

### 5. Ejecución de Pruebas
Se realizaron un total de 6 pruebas

[Volver al menú](#tabla-de-contenidos)

#### 5.1 Test 1 Sign Up en la Tienda Online

Escenario: Registrar un nuevo usuario  
Given - Dado que el usuario navega a la página de registro  
When -  Cuando el usuario ingresa su nombre de usuario y contraseña Y hace clic en el botón "Registrarse"  
Then -  Luego se crea una nueva cuenta y el usuario puede iniciar sesión

[Volver al menú](#tabla-de-contenidos)

##### 5.1.1 COMO usuario QUIERO ser capaz de darme de alta

![test1](https://user-images.githubusercontent.com/123221049/214040957-05b9b38f-ce99-4ac6-b7a0-ebeb47884e27.PNG)

[Volver al menú](#tabla-de-contenidos)

#### 5.2 Test 2 Iniciar sesión
Escenario: Usuario inicia sesión  
Given - Dado que el usuario navega a la página de inicio de sesión  
When -  Cuando el usuario ingresa su nombre de usuario y contraseña Y hace clic en el botón "inicio de sesión"  
Then -  Luego el usuario inicia sesión y puede proseguir con su orden

[Volver al menú](#tabla-de-contenidos)

##### 5.2.1 COMO usuario QUIERO ser capaz de iniciar sesión en la Tienda Online

![test1](https://user-images.githubusercontent.com/123221049/214043666-31386829-e55a-4546-8b11-0a5a6b3c2c52.PNG)

[Volver al menú](#tabla-de-contenidos)

#### 5.3 Test 3 Navegar en Teléfonos ordenadores y pantallas
Escenario: Usuario puede navegar  
Given - Dado que el usuario puede navegar por diferentes productos  
When - Cuando el usuario da clic en alguno de los botones "Phone", "Laptop", "Monitor"  
Then - Luego el usuario puede seleccionar ya sea "S6", "Vaio I5", "Apple 24"

[Volver al menú](#tabla-de-contenidos)

##### 5.3.1 COMO usuario QUIERO ser capaz de navegar por diferentes productos
![test3](https://user-images.githubusercontent.com/123221049/214046431-1f28e9f7-26c1-44ce-9613-bdb9aaee0917.PNG)

[Volver al menú](#tabla-de-contenidos)

#### 5.4 Test 4 Añadir al carrito
Escenario: Usuario puede añadir al carrito  
Given - Dado que el usuario puede seleccionar diferentes productos  
When - Cuando el usuario selecciona un producto "S6", "Vaio I5", "Apple 24"  
Then - Luego el usuario lo puede añadir al carrito

[Volver al menú](#tabla-de-contenidos)

##### 5.4.1 COMO usuario QUIERO añadir un s7 un s6 y un vaio i7
![test4](https://user-images.githubusercontent.com/123221049/214046734-6c88fcd8-8c36-443d-8cd7-c1d260ecabdb.PNG)

[Volver al menú](#tabla-de-contenidos)

#### 5.5 Test 5 Eliminar del carrito
Escenario: Usuario puede eliminar del carrito  
Given - Dado que el usuario puede seleccionar diferentes productos  
When - Cuando el usuario selecciona un producto "S6", "Vaio I5", "Apple 24"  
Then - Luego el usuario lo puede eliminar del carrito 

[Volver al menú](#tabla-de-contenidos)

##### 5.5.1 COMO usuario QUIERO eliminar el Samsung galaxy s6
![test5](https://user-images.githubusercontent.com/123221049/214047011-a64d2c97-d5fd-4fd0-ab8e-e3728d21a074.PNG)

[Volver al menú](#tabla-de-contenidos)

#### 5.6 Test 6 Pedido de artículos
Escenario: Usuario puede hacer pedidos  
Given - Dado que el usuario puede seleccionar diferentes productos  
When - Cuando el usuario selecciona un producto "S6", "Vaio I5", "Apple 24"  
Then - Luego el usuario procede a hacer el pedido 

[Volver al menú](#tabla-de-contenidos)

##### 5.6.1 COMO usuario QUIERO realizar el pedido de artículos seleccionados
![test6](https://user-images.githubusercontent.com/123221049/214047300-defb6b20-0b4c-4af8-8525-fd5cef00d074.PNG)

[Volver al menú](#tabla-de-contenidos)


## **6. Resultado Final**

Los resultados del test fueron satisfactorios, se hicieron con: Serenity BDD version 3.5.1

![serenity_report_web1](https://user-images.githubusercontent.com/122720038/216946711-22078fae-9934-4803-ac92-41006fe6a9ed.png)

![serenity_report_web2](https://user-images.githubusercontent.com/122720038/216946895-bfa242dc-4686-4d80-950d-70a3b4cb3eae.png)

![serenity_report_web3](https://user-images.githubusercontent.com/122720038/216946960-ed156f5a-9e29-4f9e-9535-2d023c3affee.png)


## **7. Realizado Con**
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
![Google Chrome](https://img.shields.io/badge/Google%20Chrome-4285F4?style=for-the-badge&logo=GoogleChrome&logoColor=white)
<img width="125" alt="jetbrains_intellij_button_icon_151878" src="https://user-images.githubusercontent.com/122720038/213829729-3785c0d4-d936-4c43-a0c8-9cb059f62e8f.png">
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/-selenium-%43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Windows 11](https://img.shields.io/badge/Windows%2011-%230079d5.svg?style=for-the-badge&logo=Windows%2011&logoColor=white)

[Volver al menú](#tabla-de-contenidos)

## **8. Autores**
Derun Chen  
Jimmy Ulloa Mora  
Jose Valentin Serra Mendoza

[Volver al menú](#tabla-de-contenidos)

## **9. Licencia**
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

[Volver al menú](#tabla-de-contenidos)
