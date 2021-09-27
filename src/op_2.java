/**
* Deterministic Finite Automaton - LFT course project - Path 2 option
* 
* @author  Eugenio Donvito
* @version 1.4.4
* @since   2019-06-12 
* 
*/

public class op_2 {

    public static boolean scan(String s) {

	    int state = 0;
	    int i = 0;

	    while (state >= 0 && i < s.length()) {
	    final char ch = s.charAt(i++);

	    switch (state) {

            case 0:
		        if (Character.isLetter(ch))
		            state = 2;
		        else if (ch == '_')
		            state = 1;
		        else
		            state = -1;
		        break;

	        case 1:
		        if (Character.isLetter(ch) || Character.isDigit(ch))
	        	    state = 2;
	        	else
		            state = -1;
		        break;
	        }

        }
        return state == 2;
    }
}
