public class IntroArrays{
public static void main(String[] args){
//declaración del arreglo 
int[] numeros;
//inicializar el arreglo con valores 
numeros=new int[5];

//valores
numeros[0]=10;
numeros[1]=20;
numeros[2]=30;
numeros[3]=40;
numeros[4]=50;

//imprimir los valores del arreglo->array
System.out.println("El elemento de indice 0"+numeros[0]);
System.out.println("El elemento de indice 1"+numeros[1]);
System.out.println("El elemento de indice 2"+numeros[2]);
System.out.println("El elemento de indice 3"+numeros[3]);
System.out.println("El elemento de indice 4"+numeros[4]);


//SUMA estática elemento por elemento 
//int suma=numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4];

//System.out.println("La suma del array es;"+suma);


//sumatoria con ciclo for.
//int suma=0;
//for(int i=0; i< numeros.length; i++){
    //suma+=numeros[i];
    for (int i=0; i <numeros. length;i++ ) {
     //suma+=numeros[i];
    System.out.println("La suma con ciclo for es:" + "la posicion es" +i+ numeros [i]);
}

//System.out.println("La suma con ciclo for es"+suma);

}
}