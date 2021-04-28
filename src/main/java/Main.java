
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {


    static String palabra ="";
    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Out:
        while (true) {
            opciones();
            String op = tec.next();
            switch (op) {
                case "1":
                    ingresarPalabra();
                    break;
                case "2":
                    validarPal(palabra);
                    break;
                default:
                    mensaje(op);
                    break;
                case "0":
                mensaje(op);
                break Out;

            }

        }


    }

    private static void mensaje(String op) {
        if(op!="0" || op!="1" || op!="2"){
            System.err.println("Opcion no valida");
        }else if(op.equals("0")){
            System.out.println("Gracias, adios");
        }

    }

    private static void ingresarPalabra() {
        try {
            palabra = tec.next();
        }catch (NoSuchElementException e){
            System.err.println("Te pasaste pollo qlo");
        }catch (IllegalStateException e){
            System.err.println("Te pasaste pollo qlo");
        }
    }

    private static void opciones() {
        System.out.println("======================================\n" +
                "[1] : Ingresar palabra\n" +
                "[2] : Verificar si es palindromo\n" +
                "[0] : Salir\n" +
                "======================================\n");

    }



    public static boolean validarPal(String palabra) {
        palabra = formatPalabra(palabra);
        String palindromo = new StringBuilder(palabra).reverse().toString();
        if (palabra.equals(palindromo)) {
            System.out.println("Es palindromo");
            return true;

        } else {
            System.err.println("No es palindromo");
            return false;
        }
    }

    public static String formatPalabra(String palabra) {
        String[] quitar = {" ", ",", "."};
        palabra = palabra.toLowerCase();
        for (int i = 0; i < quitar.length; i++) {
            palabra = palabra.replace(quitar[i], "");
        }
        return palabra;
    }
}
