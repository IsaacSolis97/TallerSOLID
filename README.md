# TallerSOLID
Taller 3 de SOLID
 Taller3SOLID

1.	Clases Helado y Pastel. Tienen mucha similitud, se deberí­a crear una clase padre llamada Postre.
Respuesta:
Es correcto, ya que el principio LSP, Lskov Substitution Principle indica que las clases que son derivables deberían poder ser cambiadas por su clase padre sin tener problemas.

#### 2.	Clases Procesos.OperacionesAderezo y Postre.¿Es necesaria la clase OperacionesAderezo?. Se puede incluir dentro de postre un método para agregar un aderezo y para quitar un aderezo.
```
No es necesaria, ya que su presencia implica agregar nuevos métodos para el aderezo cada vez que se agrege un nuevo postre. Lo cual rompería OPC, el principio de OPEEN CLOSE, Lo que se puede hacer es mover los métodos a la clase Postre y cada postre nuevo puede sobrescribir los métodos que quieran según necesiten


3.	Métodos calcularPrecioFinal() y  showPrecioFinal() están muy relacionados, deben estar en otra clase por si cambia la fórmula de cálculo. La clase nueva debe llamarse Procesos.ManejadorDePrecio.
```
Respuesta: Si aplicamos el metodo SRP en este caso resulta mejor seperar los métodos que alteren el precio.


4. Enum Adicionales.Aderezo es muy estático, debe convertirse en clase abstract con un atributo nombre y un método abstracto setNombre para que cada tipo de aderezo sea una subclase de Aderezo e implemente dicho método. También, sobrescriba el método toString() en la clase Aderezo, para que devuelva el nombre del aderezo en mayúsculas.

Se tiene que seguir el principio de Open Close, por lo que si se debe implementar la clase abstracta para poder extender la clase aderezo, entonces si las subclases cambian su comportamiento, este no modificaría la clase original.
```

### 5.	Paquete Leche y la clase Procesos.ManejadorDeLeche. En el main descomente las instrucciones para realizar el cambio del tipo de leche utilizada en cada postre, luego analice como solucionar el error generado en la clase Leche.LecheDeslactosada.

Si se implementar una la clase abstracta respetamos el principio de Open Closed para extender de la clase Leche 
Entera usando tambien el principio de LSP y teniendo comportamientos que no modifiquen la clase original para su posterior uso. 

Integrantes
Isaac Solis
Angie Tuarez
Alexander Alzate 
Carlos Moncayo
