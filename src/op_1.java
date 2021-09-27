/**
* Deterministic Finite Automaton - LFT course project - Path 1 option
* 
* @author  Eugenio Donvito
* @version 1.4.4
* @since   2019-06-12 
* 
*/

public class op_1 {
    
    public static boolean scan(String s) {

	    int state = 0;
	    int i = 0;

	    while (state >= 0 && i < s.length()) {
	    final char ch = s.charAt(i++);

	    switch (state) {

            case 0:
		        if (ch == '0')
		            state = 1;
		        else if (ch == '1')
		            state = 0;
		        else
		            state = -1;
		        break;

	        case 1:
		        if (ch == '0')
	        	    state = 2;
	        	else if (ch == '1')
	        	    state = 0;
	        	else
		            state = -1;
		        break;

	        case 2:
		        if (ch == '1')
		            state = 0;
		        else
		            state = -1;
	        	break;
	        }

        }
        return state == 0 || state == 1 || state == 2;
    }
}
