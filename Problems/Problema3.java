public class Problema3 {
//esta funcion cuenta las inversiones de ambos lados y en ambos lados
    public static int contarInver(int[] arr, int ini, int fin) {
        int cont = 0;
        if (ini<fin) {
            int med = (ini+ fin)/2;
//cuenta en ambos lados
            cont += contarInver(arr, ini, med);
            cont += contarInver(arr, med+1, fin);
//cuenta entre ambos lados
            cont += merge(arr, ini, med, fin);
        }

        return cont;
    }
//merge los une y cuenta las inversiones cruzadas
    public static int merge(int[] arr,int ini,int med,int fin) {
//para guardar la union
        int[] temp = new int[fin - ini +1];
//recorre inicio a med
        int i = ini;
//recorre med a fin
        int j = med + 1;
//recorre temp
        int k = 0;
        int inver = 0;
//si hay elementos en cada lado haz...
        while(i <= med && j <= fin) {
            //guarda elementos en temp siendo este el menor entre el array inicio-medio y el medio-final
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++; } 
//en caso el med sea menor se cuenta como inversion ya que lo cambia de lugar al inicio en temp
            else {
                temp[k] = arr[j];
                inver += (med - i + 1);
                j++; }
            k++;
        }
// con los dos while copia el resto en el lado que corresponde con cambio o sin el 
        while (i <= med) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= fin) {
            temp[k] = arr[j];
            j++;
            k++;
        }
//reescribe el contenido de arr con el de temp
        for (i = ini, k = 0; i <= fin; i++, k++) {
            arr[i] = temp[k];
        }
//retorna el numero de cambios
        return inver;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        System.out.println(contarInver(arr, 0, arr.length - 1));
    }
}
//Explicacion General: basicamente divide hasta llegar a la unidad y luego comienza a compara para cambiar de lugar,
//en la unidad no se compara entoces queda igual, pero al agarrar (3,1) los cambia a 1,3 y por ende en el siguiente (3,2 )
//tambien, termianando por "ordenar" el array con dos inversiones