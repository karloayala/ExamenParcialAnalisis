public class Problema1 {
//se crea una funcion que de como resultado True o False y reciva el array y i(la variable recursiva)
    public static boolean estaOrdenado(int[] arr, int i) {
    //este if sirve para romper si llega al final del arr (todo correcto)
        if (i== arr.length - 1) {
        return true;}
// compara la ubicacion actual del array con la futura para ver si esta desordenado, si lo esta retorna False
        if (arr[i] > arr[i+1]) {
            return false;
    }
// esta es la recursion que hace que avance i y lea todo el array
        return estaOrdenado(arr,i+1);
    }
// es el main :)
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 8};
        int[] arr2 = {1, 4, 2, 8};

        System.out.println(estaOrdenado(arr1, 0));
        System.out.println(estaOrdenado(arr2, 0));
    }
}
// Explicacion general: i empieaza en 0 y compara arr[0] con arr[0+1] si esta en orden continua sino rompe y da Falso .
// luego se vuelve a llamar a si misma y aumenta i en 1 (i+1 linea:12) y lo compara de nuevo, asi hasta llegar
// a un momento en el que sea falso o llegue  al final
