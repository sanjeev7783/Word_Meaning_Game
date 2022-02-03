import java.nio.file.*;
import java.io.*;
import java.util.*;


class Main extends Exception
 {


    public static void clearScreen() 
	{
        	try {
            		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        	    } 
		catch (Exception e) {}

        		
   	 }
   public static void Sleep(int x)
	{
		try
        	{
           		 Thread.sleep(x);
        	}
        	catch (Exception e){}

	}


    public static void main(String[] args) 
	{


        	clearScreen();

        	System.out.println("Let's play Word-Antrakshari...");

		Sleep(2000);


        	Scanner sc = new Scanner(System.in);

		System.out.print("For How many turns you want to play Antrakshari : ");
		int n=sc.nextInt();

        	String word = "plea";
		String choice="";
        	char letter;
        
        	int i,Sudha_Count=0,Aditya_Count=0;
		boolean x=true;

		Path fileName = Path.of("C:\\Users\\sanje\\Downloads\\enable1.txt");//Unable in Browser to access file
		String str="";
       		try{
       		 str = Files.readString(fileName);
		}catch(Exception e){}


        while (x)//infinite loop
            {
                


                for (i=1;i<=2*n;i++) 
		{
			 

			 if (i % 2 == 0)
			 {
                        	//clearScreen();
                        	System.out.println( "\n\t\t\t Sudha" + "\t!" + " Your turn ...");
				letter = word.charAt(word.length() - 1);
                        	System.out.println("Type a word for  letter " +"'"+ letter+"'" + "\t:");
                        	String Word = sc.next();
				if(Word.charAt(0)==letter)
				{
					while (true) 
        				{

            					if (str.contains(Word.toLowerCase())) 
            						{
                						System.out.println(String.format("The bird \"%s\" is existing", Word));
								System.out.println("Good Job! Sudha");
								word=Word;
								Sudha_Count=Sudha_Count+1;
								Sleep(1000);
								break;
            						} 
						else
            						{
                						System.out.println(String.format("The bird \"%s\" doesn't exist", Word));
								Sudha_Count=Sudha_Count-1;
								i=i;
								break;
            						}
           				      //System.out.println("");
       				 	}
					
					
				}
				else
				{
					System.out.println("Oh ! No. Your word doesnot start with "+"'"+ letter+"'");
					Sudha_Count=Sudha_Count-1;
					i=i;
				}
                    	}
			else
			{
                        	//clearScreen();
                        	System.out.println("\n\t\t\t" + "Aditya" + "\t!" + " Your turn ...");

                        	letter = word.charAt(word.length() - 1);
                        	System.out.println("Type a word for  letter " +"'"+ letter+"'" + "\t:");
                        	String Word = sc.next();
				if(Word.charAt(0)==letter)
				{
					
					while (true) 
        				{

            					if (str.contains(Word.toLowerCase())) 
            						{
                						System.out.println(String.format("The bird \"%s\" is existing", Word));
								System.out.println("Good Job! Aditya");
								word=Word;
								Aditya_Count=Aditya_Count+1;
								Sleep(1000);
								break;
            						} 
						else
            						{
                						System.out.println(String.format("The bird \"%s\" doesn't exist", Word));
								Aditya_Count=Aditya_Count-1;
								i=i;
								break;
            						}
           				      //System.out.println("");
       				 	}
					
				}
				else
				{
					System.out.println("Oh ! No. Your word doesnot start with "+"'"+ letter+"'");
					Aditya_Count=Aditya_Count-1;
					i=i;
				}
			}

                }//for closed
			clearScreen();

			System.out.println("Total Score of Sudha is "+Sudha_Count+" out of "+i/2);

			System.out.println("Total Score of Aditya is "+Aditya_Count+" out of "+i/2);
			if(Sudha_Count==Aditya_Count)
			{
				System.out.println("\n\n\t\t\tMatch Draw !!! ");
				Sleep(10000);
			}
			else if(Sudha_Count>Aditya_Count)
			{
				System.out.println("\n\n\t\t\t Sudha is Winner");
				Sleep(10000);
			}
			else
			{
				System.out.println("\n\n\t\t\t Aditya is Winner");
				Sleep(10000);
			}

			//Sleep(10000);
			System.out.print("Do you want to Play it again : ");
			choice=sc.next();
			
			if(choice.charAt(0)=='y'||choice.charAt(0)=='Y')
			{
				x=true;
			}
			else
			{
				x=false;
			}

            }//while closed

        

        }//main closed
    }//class closed

