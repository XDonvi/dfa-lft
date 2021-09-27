/**
* Deterministic Finite Automaton - LFT course project - main
* 
* @author  Eugenio Donvito
* @version 1.4.4
* @since   2019-06-12 
* 
*/

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {

        int selection = 1;
        String string = "";
        
        Scanner tastiera = new Scanner(System.in);

        while(selection > 0){

            //Simple clear terminal screen function
            for(int i = 0; i<100; i++){
                System.out.println("");
            }

            //selection menu
            System.out.println("Deterministic Finite Automaton");

            System.out.println("==========================================================");
            System.out.println("For information about the automaton options and use,");
            System.out.println("open file : MANUAL.txt.");
            System.out.println("Select the automaton path option, then insert the string.");
            System.out.println("==========================================================");
            System.out.println("1  : Path 1");
            System.out.println("2  : Path 2");
            System.out.println("3  : Path 3");
            System.out.println("4  : Path 4");
            System.out.println("5  : Path 5");
            System.out.println("6  : Path 6");
            System.out.println("7  : Path 7");
            System.out.println("8  : Path 8");
            System.out.println("9  : Path 9");
            System.out.println("10 : Path 10 ");
            System.out.println("11 : Path 11");
            System.out.println("0  : Shutdown the automaton");
            System.out.println("==========================================================");
            
            //Input selection
            System.out.print("Selection: ");


            selection = tastiera.nextInt();

            System.out.println("==========================================================");

            //Input string
            if(selection > 0 && selection < 12) {

                System.out.print("Insert the string: ");
                string = tastiera.next();
            }

            //Path selection function
            switch(selection){

                case 0:
                    System.out.println("DFA automaton shutting down...");
                    selection = 0;
                break;


                case 1:
                    op_1 op1 = new op_1();
                    System.out.println(op1.scan(string) ? "String Accepted!" : "String not Accepted");
                break;

                
                case 2:
                    op_2 op2 = new op_2();
                    System.out.println(op2.scan(string) ? "String Accepted!" : "String not Accepted");
                break;

                
                case 3:
                    op_3 op3 = new op_3();
                    op3.scan(string);
                break;

                
                case 4:
                    op_4 op4 = new op_4();
                    op4.scan(string);
                break;


                case 5:
                    op_5 op5 = new op_5();
                    op5.scan(string);
                break;

                
                case 6:
                    op_6 op6 = new op_6();
                    System.out.println(op_6.scan(string) ? "String Accepted!" : "String not Accepted");
                break;
                

                case 7:
                    op_7 op7 = new op_7();
                    System.out.println(op7.scan(string) ? "String Accepted!" : "String not Accepted");
                break;


                case 8:
                    op_8 op8 = new op_8();
                    System.out.println(op8.scan(string) ? "String Accepted!" : "String not Accepted");
                break;

                
                case 9:
                    op_9 op9 = new op_9();
                    System.out.println(op_9.scan(string) ? "String Accepted!" : "String not Accepted");
                break;


                case 10:
                    op_10 op10 = new op_10();
                    System.out.println(op_10.scan(string) ? "String Accepted!" : "String not Accepted");
                break;

                
                case 11:
                    op_11 op11 = new op_11();
                    System.out.println(op_11.scan(string) ? "String Accepted!" : "String not Accepted");
                break;
                
                
                default:
                    System.out.println("Error! option not avaiable...");
                    selection = 1;
                break;
            }

            System.out.println("==========================================================");

            //Wait 1.5 seconds then continue
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
