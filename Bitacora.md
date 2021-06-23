1. Despues de crear el codigo del simulador de patos, agregue el metodo 
volar a la clase Duck, esto provoco que ciertos tipos de patos que 
no vuelan, heredacen este comportamiento.
2. La herencia convierte el diseño muy rigido.
3. Para que no vuele sobrescribimos el metodo volar para que no realice nada.
4. tal parece que sobrescribir los metodos para que no hagan nada 
   ya no se vera bien con un pato de madera en donde sobre escribiremos 
   casi todos los metodos.
    
5. Como una solucion se puede estraer los metodos que no todos
   los Patos realizan fuera de la clase Duck hacia Interfaces. 
   Por ejemplo Quakable Flyable, asi solo los patos que necesiten 
   los implementaran.
   