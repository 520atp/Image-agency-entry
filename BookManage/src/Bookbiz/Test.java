package Bookbiz;
import java.util.Scanner;
import entity.Resource;

/**
 * ͼ����Դ����ϵͳ��
 */
public class Test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		CatalogItem catalog=new CatalogItem();//������ԴĿ¼�Ķ���
		System.out.println(">>��Ŀǰ��λ��:��ԴĿ¼��¼");
		System.out.print("1.ͼ��\t2.��Ƭ\n��ѡ����Ҫ��¼����Դ���ͣ�");
		int choose=input.nextInt();
		String resourceType="";
		if(choose==1){//�жϿͻ�ѡ����Դ����
			resourceType="ͼ��";
		}else if(choose==2){
			resourceType="��Ƭ";
		}	
		Resource resource=catalog.noteResource(resourceType);	//���ü�¼��Դ�ķ���
		resource.printInfo();//������Դ����ϸ��Ϣ
		/*��Ƶ��ʾ�����ָ���쳣
		 * try{
			resource.printInfo();//������Դ����ϸ��Ϣ
		}catch(NullPointerException ex){
			System.out.println("û�д���Դ���ͣ�");
			return;
		}	*/
		System.out.println("��Դ�Ѽ�¼�ɹ���");	
	}
}
