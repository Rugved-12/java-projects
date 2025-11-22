import java.util.Scanner;
import java.util.Random;

public class SPS 
{
    public static void main(String[]args) 
    {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        String []move ={"Stone","Paper","Scissor"};
        String choice;

          System.out.println("Welcome to Stone paper Scissors Game!.");
       do
        { 
         System.out.println("choose your move:");
         System.out.println("for Stone 0 ,Paper 1 ,Scissor 2:");
         int userchoice = sc.nextInt();
        while(userchoice<0 || userchoice>2)
        {
          System.out.println("Invalid choice! Enter choice again...");
          userchoice=sc.nextInt();
        }
         int compchoice = ran.nextInt(3);
         System.out.println("your choice->"+move[userchoice]);
         System.out.println("Computer's choice->"+move[compchoice]);

         if(userchoice == compchoice)
          {
            System.out.println("Tie!");
          }
          else if(userchoice == 0 && compchoice ==2 || userchoice == 1 && compchoice ==0 || userchoice == 2 && compchoice ==1)
           {
            System.out.println("Congratulations! you won the game...");
           }
           else
           {
             System.out.println("You lose! Computer won the game....");
           }

           sc.nextLine();

           System.out.println("Do you want to play again?(y/n):");
           choice=sc.nextLine();
        }while(choice.equalsIgnoreCase("y"));
           System.out.println("Thanks for playing Game.."+"\n"+"play again.");
      sc.close();
    }

}

-----------OUTPUT---------------
    Welcome to Stone paper Scissors Game!.
choose your move:
for Stone 0 ,Paper 1 ,Scissor 2:
0
your choice->Stone
Computer's choice->Stone
Tie!
Do you want to play again?(y/n):
y
choose your move:
for Stone 0 ,Paper 1 ,Scissor 2:
2
your choice->Scissor
Computer's choice->Scissor
Tie!
Do you want to play again?(y/n):
y
choose your move:
for Stone 0 ,Paper 1 ,Scissor 2:
0
your choice->Stone
Computer's choice->Scissor
Congratulations! you won the game...
Do you want to play again?(y/n):
n
Thanks for playing Game..
play again.
