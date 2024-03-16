Hoja de Trabajo 7

Su programa implementará un diccionario Inglés – Español. Para alimentar el diccionario recibirá el archivo diccionario.txt que
contiene ASOCIACIONES con la palabra en inglés y su equivalente en español. Ejemplo del contenido de este archivo es:
(house, casa)
(dog, perro)
(homework, tarea)
(woman, mujer)
(town, pueblo)
(yes, si)
Usted debe formar un árbol binario de búsqueda (BST) con estas asociaciones basado en la palabra en inglés.

Al finalizar de procesar todas las asociaciones del archivo, recorra el árbol donde se guardó el diccionario en In- or der . D ebe
producir la colección de palabras ordenadas por inglés. Con los datos de este ejemplo: (dog, perro) (homework, tarea) (house,
casa) (town, pueblo) (woman, mujer) (yes, si)
Además su programa debe procesar el archive texto.txt que contiene un documento en inglés. Usted debe traducir cada
palabra al español. Si la palabra no está en su diccionario, entonces escribe la palabra original en inglés, encerrada entre
asteriscos.
Por ejemplo si el texto.txt que recibe es:
The woman asked me to do my homework about my town.
Produce la salida en la terminal:
*The* mujer *asked* *me* *to* *do* *my* tarea *about* *my* pueblo.
NOTA: no debe importar si la palabra esta en mayúscula o minúscula para poder encontrarla en el diccionario
 
 Tareas:
a. Implemente la clase BinaryTree <E> para hacer las operaciones de un árbol binario. Puede usar como referencia la
mostrada en el libro o en algún sitio Internet. Recuerde siempre poner el lugar de donde tomó la idea.
b. Implemente la clase Association <K, V> que representa las asociaciones del diccionario.
c. Haga pruebas unitarias para el método que inserta un elemento en el árbol y para el método que busca un elemento en el
árbol.
