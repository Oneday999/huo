   
	 /**     
     * @discription �ڴ�����һ�仰�������ļ�������
     * @author ��1503�� ������          
     * @created 2017��9��23�� ����4:26:42    
     * tags     
     * see_to_target     
     */

/**        
 * Title: DiGui.java    
 * Description: ����
 * @author ��1503�� ������       
 * @created 2017��9��23�� ����4:26:42    
 */
import java.util.*;
public class DiGui {

	/**     
	     * @discription �ڴ�����һ�仰��������
	     * @author ��1503�� ������          
	     * @created 2017��9��23�� ����4:26:42     
	     * @param args     
	     */

public static void Cheng(int n){
	if(n/2<5000)
	{
		System.out.println(n);
		Cheng(n*2);
	}
	else return ;
System.out.println(n);
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
int n;
Scanner in=new Scanner(System.in);
System.out.print("������һ�������� ");
n=in.nextInt();
System.out.println();
Cheng(n);
}
}