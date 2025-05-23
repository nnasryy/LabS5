
import java.util.Scanner;
import java.util.Random;

public class Williams_Nasry_Exam1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random random = new Random();
        int opcion = 0;
        String ppt = "";
        do {
            System.out.println("***Menu de Opciones ***");
            System.out.println("1. Piramide");
            System.out.println("2. Clave");
            System.out.println("3. Juego de piedra, papel o tijera");
            System.out.println("4. Adivinar");
            System.out.println("5. Salida del Sistema");
            opcion = lea.nextInt();
            lea.nextLine();
//Piramide
            if (opcion >= 1 && opcion < 6) {
                if (opcion == 1) {
                    System.out.println("***Piramide***");
                    System.out.println("Ingrese un numero para la piramide: ");
                    int filas = lea.nextInt();
                    
                    
                    

                }
                //Clave
               if (opcion == 2) {
    String mensajeCifrado = "";
    System.out.println("***Clave***");
    System.out.println("Ingrese un mensaje para cifrar:");
    String mensaje = lea.nextLine();

    for (int i = 0; i < mensaje.length(); i++) {
        char letra = mensaje.charAt(i);

        if (letra >= 'a' && letra <= 'z') {
            char invertida = (char) ('z' - (letra - 'a'));
            mensajeCifrado += invertida;
        } else if (letra >= 'A' && letra <= 'Z') {
            char invertida = (char) ('Z' - (letra - 'A'));
            mensajeCifrado += invertida;
        } else {
            mensajeCifrado += letra;
        }
    }

    System.out.println("Mensaje Cifrado :" + mensajeCifrado);
    System.out.println("Mensaje Desifrado: " + mensaje);
}

//PPT
                if (opcion == 3) {
                    boolean juego = true;

                    while (juego) {
                        System.out.println("***Bienvenido a el Juego de piedra, papel y tijera! ***");
                        System.out.println("-- Seleccion de Opcion --");
                        System.out.print("(piedra, papel, o tijera):");
                        ppt = lea.nextLine().toLowerCase();

                        while (!ppt.equals("piedra") && !ppt.equals("papel") && !ppt.equals("tijera")) {
                            System.out.println("Opcion ingresada no valida, Escriba piedra, papel, o tijera: ");
                            ppt = lea.nextLine().toLowerCase();
                        }

                        int pptpc = random.nextInt(3);
                        String computadora = "";
                        if (pptpc == 0) {
                            computadora = "piedra";
                        } else if (pptpc == 1) {
                            computadora = "papel";
                        } else {
                            computadora = "tijera";
                        }

                        System.out.println("La computadora eligio = " + computadora);

                        if (ppt.equals(computadora)) {
                            System.out.println("Hubo un empate.");
                        } else if ((ppt.equals("piedra") && computadora.equals("tijera"))
                                || (ppt.equals("papel") && computadora.equals("piedra"))
                                || (ppt.equals("tijera") && computadora.equals("papel"))) {
                            System.out.println("Felicidades, ganaste!");
                        } else {
                            System.out.println("La computadora gana!");
                        }

                        System.out.println("Quiere jugar nuevamente?");
                        System.out.print("Ingrese si o no : ");
                        String siono = lea.nextLine().toLowerCase();
                        if (!siono.equals("si")) {
                            juego = false;
                        }
                    }
                }
// Adivinar
                if (opcion == 4) {
                    int numerorandom = random.nextInt(100);
                    int maxintentos = 10, intentos = 0, intentoUser = 0;
                    boolean adivino = false;

                    System.out.println("*** Adivinar ***");
                    System.out.println("Adivina un numero del 1-100, tienes 10 intentos para lograrlo.");
                    while (intentos < maxintentos) {
                        System.out.println("Intento #" + (intentos + 1) + ": ");
                        intentoUser = lea.nextInt();
                        intentos++;

                        if (intentoUser == numerorandom) {
                            System.out.println("Adivinaste! Tu total de intentos es de: " + intentos);
                            adivino = true;
                        } else if (intentoUser > numerorandom) {
                            System.out.println("El numero por adivinar es menor.");
                        } else {
                            System.out.println("El numero por adivinar es mayor.");
                        }

                    }

                    if (!adivino) {
                        System.out.println("Ya no hay intentos disponibles, el numero era: " + numerorandom);
                    }

                }

                if (opcion == 5) {
                    System.out.println("Salida...");
                 
                }

            }

        } while (opcion != 5);
   System.exit(0);
    }
}
