import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        // Validar frase exacta "Hola mundo"
        Pattern pat = Pattern.compile("Hola mundo");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("La cadena es válida para Hola mundo");
        } else {
            System.out.println("La cadena no es válida para Hola mundo");
        }

        // Validar frase "Hola mundo" en cualquier combinación de letras mayúsculas y minúsculas
        pat = Pattern.compile("(?i)Hola mundo");
        mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("La cadena es válida para Hola mundo escrito de cualquier manera");
        } else {
            System.out.println("La cadena no es válida para Hola mundo escrito de cualquier manera");
        }

        // Validar cualquiera de las palabras de la lista: Java, Python, Go, Pascal, Perl
        pat = Pattern.compile("[Jj]ava|[Pp]ython|[Gg]o|[Pp]ascal|[Pp]erl");
        mat= pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("La cadena es válida para las palabras Java, Python, Go, Pascal, Perl");
        } else {
            System.out.println("La cadena no es válida para las palabras Java, Python, Go, Pascal, Perl");
        }

        // Validar correo de la Universidad de Sonora
        pat = Pattern.compile(".+@(unison.mx|uson.mx)");
        mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("La cadena es válida para correo de la Universidad de Sonora");
        } else {
            System.out.println("La cadena no es válida para correo de la Universidad de Sonora");

        }
        //Validar que nombre de un archivo inicie con el prefijo ISI, después 4 dígitos para representar el año,
        //seguido de 1 digito, que puede ser 1 o 2, y que tenga como extensión .txt o .csv un ejemplo seria:ISI2022-2.csv
        pat = Pattern.compile("ISI\\d{4}-(1|2)\\.(txt|csv)");
        mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("La cadena es válida para usuario de ISI");
        } else {
            System.out.println("La cadena no es válida para usuario de ISI");
        }
    }
}