package src;

import java.util.Scanner;

public class TicTacToeGame{
	static String[] element;
	static int flag=0;
	static int pflag = 0;
	static int pValue;
	static int p1Value;
	static int p2Value;

  public static int PlayerWinningGameLogic(int pValue) {
	  if       ((element[pValue].equals(element[1]) && element[1].equals(element[2])) || (element[pValue].equals(element[3]) && element[3].equals(element[6])) || (element[pValue].equals(element[4]) && element[4].equals(element[8]))){
			return 0;
		}else if ((element[pValue].equals(element[2]) && element[pValue].equals(element[0])) || (element[pValue].equals(element[4]) && element[pValue].equals(element[7]))) {
			return 0;
		}else if ((element[pValue].equals(element[1]) && element[pValue].equals(element[0])) || (element[pValue].equals(element[5]) && element[pValue].equals(element[8])) || (element[pValue].equals(element[4]) && element[pValue].equals(element[6]))) {
			return 0;
		}else if ((element[pValue].equals(element[0]) && element[pValue].equals(element[6])) || (element[pValue].equals(element[4]) && element[pValue].equals(element[5]))) {
			return 0;
		}else if ((element[pValue].equals(element[3]) && element[pValue].equals(element[5])) || (element[pValue].equals(element[1]) && element[pValue].equals(element[7]))) {
			return 0;
		}else if ((element[pValue].equals(element[2]) && element[pValue].equals(element[8])) || (element[pValue].equals(element[4]) && element[pValue].equals(element[3]))) {
			return 0;
		}else if ((element[pValue].equals(element[3]) && element[pValue].equals(element[0])) || (element[pValue].equals(element[7]) && element[pValue].equals(element[8])) || (element[pValue].equals(element[4]) && element[pValue].equals(element[2]))) {
			return 0;
		}else if ((element[pValue].equals(element[6]) && element[pValue].equals(element[8])) || (element[pValue].equals(element[4]) && element[pValue].equals(element[1]))) {
			return 0;
		}else if ((element[pValue].equals(element[7]) && element[pValue].equals(element[6])) || (element[pValue].equals(element[5]) && element[pValue].equals(element[2])) || (element[pValue].equals(element[4]) && element[pValue].equals(element[0]))) {
			return 0;
		}
		return -1;
  }
  public static void Main()
  {
    try
    {
      Scanner scan = new Scanner(System.in);
      element = new String[9];
			//System.out.println(element.length);
     for (int i=0 ;i<=element.length-1 ;i++ ) {
       element[i] ="-" ;
     }
			// for (String Elements : element ) {
			// 	System.out.println(Elements);
			// }
      System.out.println("");
      System.out.println("Player1 Enter Your Name");
      String p1Name = scan.nextLine();
      System.out.println( p1Name + " Take 'X' Value");
      System.out.println("");
		  System.out.println("Player2 Enter Your Name");
		  String p2Name = scan.nextLine();
		  System.out.println(p2Name + " Take '0' Value");
			int count = 0;
      while (count<=element.length-1) {
    	  System.out.println("");
    	  System.out.println("|" + element[0] + "|" + element[1] + "|" + element[2] + "|");
    	  System.out.println("|" + element[3] + "|" + element[4] + "|" + element[5] + "|");
    	  System.out.println("|" + element[6] + "|" + element[7] + "|" + element[8] + "|");

				if (pflag == 1) {
					if (flag == 1) {
						pValue = p1Value;
						int result = PlayerWinningGameLogic(pValue);
						if (result != 0  ) {
							System.out.println("");
							System.out.println(p1Name + " won Game");
						}//else {
						// 	System.out.println("");
						// }
					}
					else {
						pValue = p1Value;
						int result = PlayerWinningGameLogic(pValue);
						if (result != 0  ) {
							System.out.println("");
							System.out.println(p2Name + " won Game");
						}//else {
						// 	System.out.println("");
						// }
					}
					//pflag = 1;
					//int pValue =

				}
				pflag = 1;


    	  if (flag == 0) {
    		  System.out.println("");
    		  System.out.println( p1Name +" Where to put  X Value horizontly (1-9)");
        	   p1Value = scan.nextInt();
        	   flag = 1;
        	   if (p1Value >0 && p1Value<10) {
				 if (p1Value == 1) {
				 	element[0] = "X";
				 }else {
					  element[p1Value-1] = "X";
				 }
        	   }
        	   else {
        		   System.out.println("enter place between range 1-9");
        	   }

    	  }
    	  else if (flag == 1) {
    		  System.out.println("");
    		  System.out.println(p2Name +" Where to put  0 Value horizontly (1-3)(4-6)(7-9)");
        	  p2Value = scan.nextInt();
        	  flag = 0;
        	  if (p2Value >0 && p2Value<10) {
							if (p2Value == 1) {
								element[0] = "0";
							}else{
								 element[p2Value-1] = "0";
							}
	       	   }else {
	       		   System.out.println("enter place between range 1-9");
       	  	 }
    		}
				count++;
      }
    }catch (Exception e){
      System.out.println("Exception:- " + e);
    }
  }
}
