   
	 /**     
     * @discription 在此输入一句话描述此文件的作用
     * @author 软工1503班 霍星宇          
     * @created 2017年9月23日 下午4:26:42    
     * tags     
     * see_to_target     
     */

/**        
 * Title: DiGui.java    
 * Description: 描述
 * @author 软工1503班 霍星宇       
 * @created 2017年9月23日 下午4:26:42    
 */
import java.util.*;
public class DiGui {

	/**     
	     * @discription 在此输入一句话描述作用
	     * @author 软工1503班 霍星宇          
	     * @created 2017年9月23日 下午4:26:42     
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
System.out.print("请输入一个整数： ");
n=in.nextInt();
System.out.println();
Cheng(n);
}
}