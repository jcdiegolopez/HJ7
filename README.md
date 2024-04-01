
# Implementación de un Diccionario Inglés – Español

## Autor
Diego López

## Descripción
Este programa implementa un diccionario inglés – español utilizando un árbol binario de búsqueda (BST). El diccionario se alimenta con las asociaciones proporcionadas en un archivo de texto y luego se utiliza para traducir un documento en inglés.

## UML
El diagrama de clases muestra la relación entre las clases `BinaryTree` y `Association`.

![enter image description here](https://cdn-0.plantuml.com/plantuml/dpng/bLJBRi8m4BpdA_QOYCS7H2Y2YlIIIgrQb4lLmofPWeLnaErGeOf_RvoaxRf0LN8WqSnuF5wFc1kBsZOx6Uons695q1ogAPNDjBBm4K3xT3-5H6DWiTyFe7j6i4EXmXUhXQfUtm1rPIB6oXhBfIYig1Nguw23jP3qX7OpXXyEokzFRY3Keov9hpGUI1kKuUqhxeIJh3JHR65CNGXqgsPzbZ7qxoG1soguaTMeZ4HBzstScwAVpeR6zit6a2TiX1FOqZ66Z047b0t5aBCmp27Ct8hMfTVno1NPZ8vXrDbnD7TAX-UN0x8PfNwu4Yt6a394qjh6_Wh6Qb5jhj8ZXeTfv_qh_hA5NCxKXn_QFHtisVgIPxVnNneps7XyTvg8gmOdNzOVwyhjiYRmoRa-nV2_zh6Sp2xqUsr8sw67VGE6Rru3lxbVwlTQbr4ywFsnTLSHtPRp57GlzrSmcIJy_34qXWndcV4bbkt5Q6vvvb7Kog9GdP0nPtPCUGhcfCfc9py1)

## Pasos de instalación o ejecución
1. Clonar este repositorio.
2. Ejecutar el programa con el archivo diccionario.txt como entrada.
3. Introducir el archivo de texto que se desea traducir cuando se solicite.
4. Ver la salida en la terminal con las palabras traducidas.

## Programa a realizar
El programa implementará un diccionario Inglés – Español utilizando un árbol binario de búsqueda (BST). Se alimentará el diccionario con el archivo `diccionario.txt` que contiene asociaciones con la palabra en inglés y su equivalente en español. Luego se traducirá un archivo de texto en inglés utilizando este diccionario.

### Ejemplo del contenido de diccionario.txt:

 - (house, casa) 
 - (dog, perro) 
 - (homework, tarea) 
 - (woman, mujer) 
 - (town, pueblo)
 -  (yes, si)

### Pasos:
1. Implementar la clase `BinaryTree <E>` para las operaciones del árbol binario.
2. Implementar la clase `Association <K, V>` para representar las asociaciones del diccionario.
3. Hacer pruebas unitarias para los métodos de inserción y búsqueda en el árbol.

**Nota:** No se debe considerar la distinción entre mayúsculas y minúsculas al buscar una palabra en el diccionario.

**Universidad del Valle de Guatemala**
**Facultad de Ingeniería**
**Departamento de Ciencias de la Computación**
**CC2003 – Algoritmos y Estructura de Datos**
**Semestre I – 2024**


