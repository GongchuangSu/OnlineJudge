/**
 * @description 二维数组操作
 * @author GongchuangSu
 * @since 2016.08.14
 * @explain 具体描述请参照同目录下的README
 * @知识点 字符串
 */
import java.util.Scanner;  
  
public class Main {  
      
    public static int istable(int m, int n)  
    {  
        if(m <=9 && n <= 9)  
            return 0;  
        else return 1;  
    }  
      
    public static int ischangecell(int cellrow, int cellcol, int indexrow, int indexcol, int m, int n)  
    {  
        if(indexrow < m && indexcol < n && cellrow < m && cellcol < n)  
            return 0;     
        return 1;  
    }  
      
    public static int isinsertrow(int insertrow, int m)  
    {  
        if(insertrow <= m && insertrow < 9)  
            return 0;  
        return 1;  
    }  
      
    public static int isinsertcol(int insertrow, int n)  
    {  
        if(insertrow <= n && insertrow < 9)  
            return 0;  
        else return 1;  
    }  
      
    public static int isrightcell(int endrow, int endcol, int m, int n)  
    {  
        if(endrow < m && endcol < n)  return 0;  
        return 1;  
    }  
  
    public static void main(String[] args) {  
          
        Scanner scanner = new Scanner(System.in);  
        int m = scanner.nextInt();  
        int n = scanner.nextInt();  
        int indexrow = scanner.nextInt();  
        int indexcol = scanner.nextInt();  
        int cellrow = scanner.nextInt();  
        int cellcol = scanner.nextInt();  
        int insertrow = scanner.nextInt();  
        int insertcol = scanner.nextInt();  
        int endrow = scanner.nextInt();  
        int endcol = scanner.nextInt();  
        scanner.close();  
          
        System.out.println(istable(m, n));  
        System.out.println(ischangecell(cellrow, cellcol, indexrow, indexcol, m, n));  
        System.out.println(isinsertrow(insertrow,m));  
        System.out.println(isinsertcol(insertcol, n));  
        System.out.println(isrightcell(endrow, endcol, m, n));  
    }  
  
}