public class logicOperation {
    public static void main(String[] args) {
        int a= 8;
        int b= 5;
        //OPPERADORES DE ASIGNACIÓN
        System.out.println("a es igual a 'b'? -> "+(a == b));
        System.out.println("a es diferente a 'b'? -> "+(a!=b));

        //OPERADOTES RELACIONALES
        System.out.println("a es mayor a 'b'? -> "+  (a>b));
        System.out.println("a es menor a 'b'? -> "+  (a<b));
        System.out.println("a es mayor igual a 'b'? -> "+  (a>=b));
        System.out.println("a es menor igual a 'b'? -> "+  (a<=b));

        if (a == b){
            System.out.println("a es igual a 'b' ");
        }else if(a != b ) {
            System.out.println("a es diferente a 'b'");
        }else if(a > b ) {
        System.out.println("a es mayor a 'b'");
        }else if (a < b){
                System.out.println("a es menor a 'b' ");
        }else if (a >= b ) {
            System.out.println("a es mayor igual a 'b'");
        }else if (a <= b) {
            System.out.println("a es menor igual a 'b' ");
        }



        }
}
