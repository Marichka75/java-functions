import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido/a al juego \"Dice Jack\"!");
        System.out.println("Escoge 3 números entre 1 y 6 (incluidos).");
        System.out.println("Número 1: ");
        int choice1 = scanner.nextInt();
        System.out.println("Número 2: ");
        int choice2 = scanner.nextInt();
        System.out.println("Número 3: ");
        int choice3 = scanner.nextInt();

        boolean lessThanOne = isLessThanOne(choice1, choice2, choice3);
        if (lessThanOne) {
            System.out.println("Ups! Has escogido un número menor que 1. Adiós!");
            System.exit(0);
        }
        System.out.println("¡Tus números son válidos! Continuamos...");

        boolean higherThanSix = isHigherThanSix(choice1, choice2, choice3);
        System.out.println("Alguno de tus números es mayor que 6? ");
        if (higherThanSix) {
            System.out.println("Ups! Has escogido un número mayor que 6. Adiós!");
            System.exit(0);
        }
        System.out.println("¡Tus números están entre 1 y 6! Continuamos...");

        System.out.println("Quieres lanzar los dados? (escribe 'si' o 'no')");
        String playChoice = scanner.nextLine();
        scanner.nextLine();

        if (playChoice.equals("no")) {
            System.out.println("Ok, que tengas un buen dia! Adiós.");
            System.exit(0);
        }
        System.out.println("¡Excelente! ¡Vamos a lanzar los dados!");

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Resultados de los dados:");
        System.out.println("Dado 1: " + roll1);
        System.out.println("Dado 2: " + roll2);
        System.out.println("Dado 3: " + roll3);

        int sumOfChoices = choice1 + choice2 + choice3;
        int sumOfRolls = roll1 + roll2 + roll3;
        boolean didUserWin = userWon(sumOfChoices, sumOfRolls);

        System.out.println("Suma de tus números: " + sumOfChoices);
        System.out.println("Suma de los dados: " + sumOfRolls);

        if (didUserWin) {
            System.out.println("FELICIDADES! Has ganado!");
        } else {
            System.out.println("Lo siento, has perdido. Suerte la próxima vez!");

            scanner.close();
        }
        /* 
        Reglas del juego:
        - El usuario debe escoger 3 números entre 1 y 6 (incluidos).
        - El usuario debe lanzar los dados una vez, el resultado serán 3 números aleatorios.

        ¿Cuándo gana el usuario?:
        - Cuando la suma de los números escogidos es mayor a la suma de los dados lanzados
        - Y cuando la diferencia entre los dos números anteriores es menor de 5

        ej. 
        - Usuario escoge los números: 1 3 5 (la suma es 9)
        - Usuario lanza dados y salen los números: 3 1 3 (la suma es 7)
        - 9 es mayor a 7 y la diferencia entre los dos números es menor a 5. El usuario gana.

        Requisitos no funcionales (atributos de calidad):
        - Definir las 4 funciones descritas abajo.
        - En el método main escribir el programa (usar condicionales, reusar las funciones creadas, pedir al usuario que ingrese datos y recogerlos).
      
        Pasos:
        - Pedir al usuario que escoja 3 números.
        - Si el usuario escoge un número fuera del rango, salir del programa (mira en los recursos system exit).
        - Si los números son correctos, pedir al usuario si desea lanzar dados.
        - Si el usuario dice que no, salir del programa.
        - Si el usuario dice que si, lanzar dados, hacer los cálculos que indiquen si el usuario ganó o perdió.
        - Imprimir la suma de los números escogidos por el usuario y la suma de los números que salieron en los dados.
        - Imprimir si el usuario ganó o perdió.
        */
    }


    /**
     *
     * Function name: isLessThanOne
     *
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     *
     * Inside the function:
     * 1. check if numbers are less than 1
     */

    // Escribe tu código aquí
    public static boolean isLessThanOne(int num1, int num2, int num3){
        return num1 < 1 || num2 < 1 || num3 < 1;
    }

    /**
     *
     * Function name: isHigherThanSix
     *
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     *
     * Inside the function:
     * 1. Check if numbers are greater than 6
     */

    // Escribe tu código aquí
    public static boolean isHigherThanSix(int num1, int num2, int num3){
        return num1 > 6 || num2 > 6 || num3 > 6;
    }

    /**
     *
     * Function name: userWon
     *
     * @param sumNumbers (int)
     * @param sumDiceRoll (int)
     * @return (boolean)
     *
     * Inside the function:
     * 1. check if user numbers are greater than computer numbers and the difference between user numbers and computer numbers are less than 5.
     */

    // Escribe tu código aquí
    public static boolean userWon(int sumNumbers, int sumDiceRoll){
        boolean sumIsGreater = sumNumbers > sumDiceRoll;
        boolean differenceIsLessThanFive = Math.abs(sumNumbers - sumDiceRoll) < 5;
            return sumIsGreater && differenceIsLessThanFive;
    }

    /**
     * Function name: rollDice
     *
     * @return (int)
     *
     * Inside the function:
     * 1. get random number between 1 and 6
     */

    // Escribe tu código aquí

    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        return (int)randomNumber;
    }
}
