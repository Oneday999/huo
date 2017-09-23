   
	 /**     
     * @discription 在此输入一句话描述此文件的作用
     * @author 软工1503班 霍星宇          
     * @created 2017年9月23日 下午5:40:16    
     * tags     
     * see_to_target     
     */

/**        
 * Title: DiGui2.java    
 * Description: 描述
 * @author 软工1503班 霍星宇       
 * @created 2017年9月23日 下午5:40:16    
 */
import java.util.*;
public class DiGui2 {  
	int[][] shu=new int[10][10];

	/**     
	     * @discription 在此输入一句话描述作用
	     * @author 软工1503班 霍星宇          
	     * @created 2017年9月23日 下午5:40:16     
	     * @param args     
	     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiGui2 st =new DiGui2();

Scanner in=new Scanner(System.in);
System.out.println("请输入n的值（4-10）:");
int n=in.nextInt(); 
st.getRotate(1,0,n);
st.printShu(n);
	}
public void getRotate(int a,int b,int c){
	if(c==1)
	{
		shu[b][b]=a;
		return;
		
	}
if(c==0)
{
	return;
}
//第一种序列
int i=b;
int j=b;
for(int k=0;k<c-1;k++)
{
	shu[i][j]=a;
			a++;
	i++;
}
//第二种序列
for(int k=0;k<c-1;k++)
{
	shu[i][j]=a;
a++;
j++;
}
//第三种序列
for(int k=0;k<c-1;k++)
{
	shu[i][j]=a;
	a++;
	i--;
	
}
//第四种序列
for(int k=0;k<c-1;k++)
{
	shu[i][j]=a;
	a++;
	j--;
}
  getRotate(a,b+1,c-2);
} 
 public void printShu(int n){
	 for(int i=0;i<n;i++){
		 for(int j=0;j<n;j++){
			 System.out.print(shu[i][j]+"\t");
		 if(j==n-1){
			 System.out.println();
		 }
		 }
	 }
 }
}

 
 
  
  