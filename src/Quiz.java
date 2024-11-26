mport java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java


        //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs

            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics

            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS

            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */

        //Respuestas: 1. b / 2. c / 3. b y d / 4. a

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?");
        System.out.println("\ta. Ada Lovelace\n\tb. Jude Milhon\n\tc. Martha Ackelsberg\n\td. Jane Jacobs\n");
        String answer1 = scanner.nextLine();

        System.out.println("\n¿Quién es Fuencisla Clemares?");
        System.out.println("\ta. La directora general de IBM Europa, Oriente Medio y África\n\tb. La vicepresidenta de Microsoft Western Europe\n\tc. La directora general de Google en España y Portugal\n\td. Fundadora y CEO de Marsi Bionic\n");
        String answer2 = scanner.nextLine();

        System.out.println("\n3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?");
        System.out.println("\ta. Primera programadora de software\n\tb. Una actriz de cine\n\tc. Inventora del procesador de datos\n\td. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS\n");
        String answer3 = scanner.nextLine();

        System.out.println("\n4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?");
        System.out.println("\ta. Katherine Johnson, Dorothy Vaughan y Mary Jackson\n\tb. Jessica Miller, Emily Johnson, Sarah Davis\n\tc. bell hooks, Toni Morrison y Alice Walker\n\td. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman\n");
        String answer4 = scanner.nextLine();

        int score = 0;

        if(answer1.equals("b")){
            score += 5;
        }
        if(answer2.equals("c")){
            score += 5;
        }
        if(answer3.equals("b") || answer3.equals("d")){
            score += 5;
        }
        if(answer4.equals("a")){
            score += 5;
        }


        System.out.println("Tu puntaje final es: " + score + "/20");

        if(score >= 15){
            System.out.println("Tú si que sabes mucho");
        } else if (score < 15 && score >= 5){
            System.out.println("No lo has hecho mal");
        } else {
            System.out.println("Buena suerte la próxima vez");
        }


        scanner.close();


    }

}