import java.util.Scanner;
class tic
{

	public static void main(String[] args) 
	{
		int n=0;
		Scanner sc = new Scanner(System.in);
		char[][] a = new char[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				a[i][j]='_';

		System.out.println("Player 1 takes x \nPlayer 2 takes o");


	ab:
	 while(n<9)
	 { 	int l=(n%2) + 1;
	 	System.out.printf("Player %d -->> Enter the position \nEnter row \n",l);

	 	int i = sc.nextInt();
	 	System.out.println("Enter column");

        int j = sc.nextInt();
        if(i>3 || j>3)
        {
        	System.out.println("Invalid Position");
        	continue ab;

        }
        if(a[i-1][j-1]=='x' || a[i-1][j-1]=='x' || i>3 || j>3)
        {
        	System.out.println("Position already marked");
        	continue ab;
        }
	 	if(n%2==0)
	 		a[i-1][j-1]='x';
	 	else
	 		a[i-1][j-1]='o';

	 for ( i = 0; i < 3; i++)
	 {	
	 	for ( j = 0; j < 3; j++)
	 		System.out.print(a[i][j]); 

	 	System.out.println();
	 }
	 int k=0;
	 k = WIN(a,k,l);
	 
	 if(k==1)
	 	break ab;

	 n++;
	 }



	}
	static int WIN(char[][] a,int k,int l)
	{
		if((a[0][0]=='x' && a[0][1]=='x' && a[0][2]=='x') || (a[0][0]=='o' && a[0][1]=='o' && a[0][2]=='o') || (a[0][0]=='x' && a[1][0]=='x' && a[2][0]=='x') || (a[0][0]=='o' && a[1][0]=='o' && a[2][0]=='o') ||
		   (a[0][0]=='x' && a[1][1]=='x' && a[2][2]=='x') || (a[0][0]=='o' && a[1][1]=='o' && a[2][2]=='o') || (a[1][0]=='x' && a[1][1]=='x' && a[1][2]=='x') || (a[1][0]=='o' && a[1][1]=='o' && a[1][2]=='o') ||
		   (a[2][0]=='x' && a[2][1]=='x' && a[2][2]=='x') || (a[2][0]=='o' && a[2][1]=='o' && a[2][2]=='o') || (a[0][1]=='x' && a[1][1]=='x' && a[2][1]=='x') || (a[0][1]=='o' && a[1][1]=='o' && a[2][1]=='o') ||
		   (a[0][2]=='x' && a[1][2]=='x' && a[2][2]=='x') || (a[0][2]=='o' && a[1][2]=='o' && a[2][2]=='o') || (a[0][2]=='x' && a[1][1]=='x' && a[2][0]=='x') || (a[0][2]=='o' && a[1][1]=='o' && a[2][0]=='o'))
		   {
		   
		   	System.out.printf("Player %d Wins \n",l);
		   	k=1;
		   } 

		return k; 
	}


}
