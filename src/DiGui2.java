   
	 /**     
     * @discription �ڴ�����һ�仰�������ļ�������
     * @author ��1503�� ������          
     * @created 2017��9��23�� ����5:40:16    
     * tags     
     * see_to_target     
     */

/**        
 * Title: DiGui2.java    
 * Description: ����
 * @author ��1503�� ������       
 * @created 2017��9��23�� ����5:40:16    
 */
import java.util.*;
public class DiGui2 {  
	int[][] shu=new int[10][10];

	/**     
	     * @discription �ڴ�����һ�仰��������
	     * @author ��1503�� ������          
	     * @created 2017��9��23�� ����5:40:16     
	     * @param args     
	     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiGui2 st =new DiGui2();

Scanner in=new Scanner(System.in);
System.out.println("������n��ֵ��4-10��:");
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
//��һ������
int i=b;
int j=b;
for(int k=0;k<c-1;k++)
{
	shu[i][j]=a;
			a++;
	i++;
}
//�ڶ�������
for(int k=0;k<c-1;k++)
{
	shu[i][j]=a;
a++;
j++;
}
//����������
for(int k=0;k<c-1;k++)
{
	shu[i][j]=a;
	a++;
	i--;
	
}
//����������
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

 
 
  
  