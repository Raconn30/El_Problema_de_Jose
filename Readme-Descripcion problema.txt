El problema de José
Consideremos  un  problema  que  puede  ser  resuelto  en  una  forma  directa  mediante  listas circulares. 
El  problema  se  conoce  con  el  nombre  de  José,  y  consiste  en  un  grupo  de  soldados rodeados  por  una  gran fuerza  enemiga. 
No  hay  esperanza  de  victoria  si  no  llegan  refuerzos,  y existe un solo caballo disponible para el escape. 
Los soldados se ponen de acuerdo en un pacto para determinar  cuál  de  ellos debe  escapar  y  solicita  ayuda. 
Forman un  círculo  y  se  escogeun número n al azar de un sombrero, igualmente se escoge el nombre de un soldado.
Comenzando con el soldado cuyo nombre se ha seleccionado, comienzan a contar en la dirección del reloj al rededor del círculo. 
Cuando la cuenta alcanza n, este soldado es retirado del círculo y la cuenta empieza de nuevo, con el siguiente hombre. 
El proceso continúa de tal manera que cada vez que la cuenta alcanza n, se remueve un hombre del círculo. 
Un soldado que es removido del círculo por supuesto no se vuelve a contar. El último soldado que queda es el que debe tomar el caballo y escapar. 
El problema es: dado un número n, el ordenamiento de los hombres en el círculo y el hombre a partir del que se comienza a contar, determinar el 
orden en el cual los hombres son eliminados del círculo y cual debe escapar. La entrada al programa es el número n y una lista de nombres  que 
es  el  ordenamiento  en  el  sentido  de  las  manecillas  del  reloj  en  el  círculo, comenzando  con  el  hombre  a  partir  del  cual  se  debe  comenzar 
a  contar.  La  última línea  de entrada contiene "FIN", indicando el final de la entrada. El programa debe mostrar los nombres de los soldados en el 
orden que han sido eliminados y el nombre de la persona que escapa. Por ejemplo, supongamos que n es 3 y que hay 5 hombres denominados 
A, B, C, D y E. Contamos tres hombres partiendo de A, de tal manera que C es eliminado primero. Luego empezamos en D y contamos D, E y regresamos a 
A, de tal manera que A es eliminado. Después contamos B,D y E (C ya ha sido eliminado), se elimina E. Finalmente contamos B,D y B, se elimina B y D es el 
hombre que escapa.