# TallerSOLID
Taller 3 de SOLID
 Taller3SOLID

1.	Clases Helado y Pastel. Tienen mucha similitud, se deber�a crear una clase padre llamada Postre.
Respuesta:
Es correcto, ya que el principio LSP, Lskov Substitution Principle indica que las clases que son derivables deber�an poder ser cambiadas por su clase padre sin tener problemas.

#### 2.	Clases Procesos.OperacionesAderezo y Postre.�Es necesaria la clase OperacionesAderezo?. Se puede incluir dentro de postre un m�todo para agregar un aderezo y para quitar un aderezo.
```
No es necesaria, ya que su presencia implica agregar nuevos m�todos para el aderezo cada vez que se agrege un nuevo postre. Lo cual romper�a OPC, el principio de OPEEN CLOSE, Lo que se puede hacer es mover los m�todos a la clase Postre y cada postre nuevo puede sobrescribir los m�todos que quieran seg�n necesiten


3.	M�todos calcularPrecioFinal() y  showPrecioFinal() est�n muy relacionados, deben estar en otra clase por si cambia la f�rmula de c�lculo. La clase nueva debe llamarse Procesos.ManejadorDePrecio.
```
Respuesta: Si aplicamos el metodo SRP en este caso resulta mejor seperar los m�todos que alteren el precio.


4. Enum Adicionales.Aderezo es muy est�tico, debe convertirse en clase abstract con un atributo nombre y un m�todo abstracto setNombre para que cada tipo de aderezo sea una subclase de Aderezo e implemente dicho m�todo. Tambi�n, sobrescriba el m�todo toString() en la clase Aderezo, para que devuelva el nombre del aderezo en may�sculas.

Se tiene que seguir el principio de Open Close, por lo que si se debe implementar la clase abstracta para poder extender la clase aderezo, entonces si las subclases cambian su comportamiento, este no modificar�a la clase original.
```

### 5.	Paquete Leche y la clase Procesos.ManejadorDeLeche. En el main descomente las instrucciones para realizar el cambio del tipo de leche utilizada en cada postre, luego analice como solucionar el error generado en la clase Leche.LecheDeslactosada.

Si se implementar una la clase abstracta respetamos el principio de Open Closed para extender de la clase Leche 
Entera usando tambien el principio de LSP y teniendo comportamientos que no modifiquen la clase original para su posterior uso. 

Integrantes
Isaac Solis
Angie Tuarez
Alexander Alzate 
Carlos Moncayo
