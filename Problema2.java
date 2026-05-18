public class Problema2 {
//clase para clacular el segundo mayor
    public static int[] segundoMayor(int[] arr, int ini, int fin) {

// en caso de haber solo un elemento retorna el num, 0 osea 0 (falso)
        if (ini== fin) {
            return new int[]{arr[ini], 0};
        }

//si hay 2 elemntos entonces los compara cual es el mayor y los ordena para que se escoja el segundo
        if (fin - ini == 1) {
            if (arr[ini] > arr[fin]) {
                return new int[]{arr[ini], arr[fin]};
            } else {
                return new int[]{arr[fin], arr[ini]};
            }
        }
// divide el array en 2 a partir de la mitad  y llama a la funcion recursivamente para cada uno
        int med = (ini +fin)/2;

        int[] i = segundoMayor(arr, ini, med);
        int[] d= segundoMayor(arr, med+ 1, fin);

        int mayor;
        int segundo;
//compara los arrays creados para ordenarlos en caso de ser necesario comparando los elementos iniciales
        if (i[0] > d[0]) {
            mayor = i[0];

            if (i[1] > d[0]) {
                segundo = i[1];
            }
            else {segundo = d[0];}
}
        else{mayor = d[0];
            if (d[1] > i[0]) {
                 segundo = d[1];}
            else {segundo = i[0];}
        }
        //retorna los arrays y una vez termine de ejecutarse la ramificacion deja dos elementos ordenados en mayor a menor y esa es la salida final
        return new int[]{mayor, segundo};
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 10, 5, 7};
//aqui empieza la recursion, creando un array que reciva la respuesta de SegundoMayor
        int[] resultado = segundoMayor(arr, 0, arr.length - 1);
//el resultado[1] es porque esta de mayor a menor por ende el correcto
        System.out.println("Segundo mayor: " + resultado[1]);
    }
}
