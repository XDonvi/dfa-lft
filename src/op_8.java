/**
* Deterministic Finite Automaton - LFT course project - Path 8 option
* 
* @author  Eugenio Donvito
* @version 1.4.4
* @since   2019-06-12 
* 
*/


public class op_8 {

    public static boolean scan(String s) {

	    int state = 0;
	    int i = 0;

	    while (state >= 0 && i < s.length()) {

	    final char ch = s.charAt(i++);

		    switch (state) {

	            case 0:
			        if (ch == 'b')
			            state = 0;
			        else if (ch == 'a')
			            state = 1;
			        else
			            state = -1;
			        break;

		        case 1:
			        if (ch == 'b')
			            state = 2;
			        else if (ch == 'a')
			            state = 1;
			        else
			            state = -1;
			        break;

			    case 2:
			        if (ch == 'b')
			            state = 3;
			        else if (ch == 'a')
			            state = 1;
			        else
			            state = -1;
			        break;

			    case 3:
			        if (ch == 'b')
			            state = 4;
			        else if (ch == 'a')
			            state = 1;
			        else
			            state = -1;
			        break;

			    case 4:
			        if (ch == 'b')
			            state = -1;
			        else if (ch == 'a')
			            state = 1;
			        else
			            state = -1;
			        break;

		    }
        }
        
        return (state <= 3 && state >= 0);
    }
}
