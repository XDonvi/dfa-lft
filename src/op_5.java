/**
* Deterministic Finite Automaton - LFT course project - Path 5 option
* 
* @author  Eugenio Donvito
* @version 1.4.4
* @since   2019-06-12 
* 
*/

public class op_5 {

    public static int PariODispari(char n) {

        if(n == '1' || n == '3'|| n == '5' || n == '7' || n == '9') return 1;
        else if (n == '0' || n == '2' || n == '4' || n == '6' || n == '8')return 0;
        else return 1;
    }

    public static char QualeCorso(char n) {

        if(n == 'A' || n == 'B' || n == 'C' || n == 'D' || n == 'E' || n == 'F' || n == 'G' || n == 'H' || n == 'J' || n == 'K') return 'A';

        else if (n == 'L' || n == 'M' || n == 'N' || n == 'O' || n == 'P' || n == 'Q' || n == 'R' || n == 'S' || n == 'T' || n == 'U' || n == 'V' || n == 'W' || n == 'Y' || n == 'X' || n == 'Z') return 'B';

        else return 'C';
    }

    public static void scan(String s) {

        int state = 0, i = 0;

        while(state >= 0 && i < s.length()) {

            final char ch = s.charAt(i++);

            switch(state) {

                case 0:
                    if(QualeCorso(ch) == 'B')
                        state = 1;
                    else if(QualeCorso(ch) == 'A')
                        state = 2;
                    else state = -1;
                break;

                case 1:
                    if(PariODispari(ch) == 1)
                        state = 3;
                    else if(PariODispari(ch) == 0)
                        state = 1;
                    else if(Character.isLetter(ch))
                        state = 1;
                    else state = -1;
                break;

                case 2:
                    if(PariODispari(ch) == 0)
                        state = 4;
                    else if(PariODispari(ch) == 1)
                        state = 2;
                    else if(Character.isLetter(ch))
                        state = 2;
                    else state = -1;
                break;

                case 3:
                    if(PariODispari(ch) == 1)
                        state = 3;
                    else if(PariODispari(ch) == 0)
                        state = 1;
                    else state = -1;
                break;

                case 4:
                    if(PariODispari(ch) == 0)
                        state = 4;
                    else if(PariODispari(ch) == 1)
                        state = 2;
                    else state = -1;
                break;

            }
        }

        if(state == 4) System.out.println("Course A Shift 2");
        else if(state == 3) System.out.println("Course B Shift 3");
        else System.out.println("String not Accepted");
    }
}
