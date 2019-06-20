import java.util.*;
import java.util.*;


class maze

{

    static int n;
    
    static int path;
    static int a[][]={{'0', '*', '0', 's'},
	        {'*', '0', '*', '*'},
	        {'0', '*', '*', '*'},
	        {'d', '*', '*', '*'}};
    public static void main(String[] ar)
    {
        
        
     
        search(0,0);
        System.out.println(path);
    }

    public static void search(int i, int j)
    {
        if(!exist(i,j) || a[i][j] == 1)
            return;
        if(i == n-1 && j == n-1)
        {
            path++;
            return;
        }
        a[i][j] = 1;
        search(i+1,j);
        search(i-1,j);
        search(i,j+1);
        search(i,j-1);
        a[i][j] = 0;
    }

    public static boolean exist(int i, int j)
    {
        return i>=0 && j >=0 && i < n && j < n;
    }
}

       

