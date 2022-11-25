import java.util.Scanner;
public class DiagonalMatrix{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int row,column;
int m[][];
System.out.println( " ENTER NO OF ROWS : ");
row = s.nextInt();
System.out.println( " ENTER NO OF COLUMNS : ");
column = s.nextInt();
m = new int[row][column];
System.out.println( " ENTER VALUES OF MATRIX " );
for(int i=0;i<row;i++)
for(int j=0;j<column;j++)
m[i][j]=s.nextInt();
if(row==column)
{
System.out.print( " DIAGONAL ELEMENTS ARE : ");
for(int i=0;i<row;i++)
System.out.print(m[i][i] + "   ");
}
else{
System.out.println( " DIAGONAL NOT POSSIBLE " );
}
}
}