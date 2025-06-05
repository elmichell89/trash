import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n---Calculadora---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opcion: ");
        

        int opcion;
        try{
            opcion = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Ingresa un numero valido.");
            scanner.nextLine();
            continue;
        }

        if (opcion == 0){
            System.out.println("Gracias por usar la calculadora...");
            break;
        }
        if(opcion < 1 || opcion > 4){
            System.out.println("Opcion no valida, intena de nuevo");
            continue;
        }


        double num1 = obtenerNumero(scanner, "Escribe el primer numero:");
        double num2 = obtenerNumero(scanner, "Escribe el segundo numero:");
        double resultado = 0;

        switch(opcion){
            case 1:
            resultado = num1 + num2;
            System.out.println("Resultado: "+resultado);
            break;

            case 2:
            resultado = num1 - num2;
            System.out.println("Resultado: "+resultado);
            break;

            case 3:
            resultado = num1 * num2;
            System.out.println("Resultado: "+resultado);
            break;

            case 4:
            if(num2 == 0){
                System.out.println("Error, no se puede dividir entre cero");
            }else{
            resultado = num1 / num2;
            System.out.println("Resultado: "+resultado);
            }
            break;

        }
    }
    scanner.close();
}    
    private static double obtenerNumero(Scanner scanner, String mensaje){
        System.out.print(mensaje);
        while(!scanner.hasNextDouble()){
            System.out.println("Ingresa un numero valido");
            scanner.next();
            System.out.print(mensaje);
        }
        return scanner.nextDouble();
    }
}
