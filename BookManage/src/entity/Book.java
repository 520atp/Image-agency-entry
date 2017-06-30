package entity;
import java.util.Scanner;
/**
 * ͼ����
 */
public class Book extends Resource {
	private String author;//����
	private int pageCount;//ҳ��
	
	public Book(){
		
	}
	
	public Book(String indexId,String resourceName,String publishTime,boolean state,String author,int pageCount){
		super(indexId,resourceName,publishTime,state);
		this.author=author;
		this.pageCount=pageCount;
	}

	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	/**
	 * ��д�鿴��ϸ��Ϣ
	 */
	public void printInfo() {
		System.out.println("��ͼ����ϸ��Ϣ���£�");
		System.out.println("������\t����\t����ʱ��\t\t����\tҳ��\t״̬");
		String state=this.getState()?"�ѽ��":"�ɽ���";//�ж�״̬
		System.out.println(this.getIndexId()+"\t"
				+this.getResourceName()+"\t"
				+this.getPublishTime()+"\t"
				+this.getAuthor()+"\t"
				+this.getPageCount()+"\t"
				+state);
	}

	/**
	 * ��д�Ǽ���Դ��Ϣ
	 */
	public void enrol() {
		super.enrol();//���ø���ĵǼǷ���
		Scanner input=new Scanner(System.in);
		System.out.print("���������ߣ�");
		String author=input.next();
		this.setAuthor(author);
		System.out.print("������ҳ����");
		int pageCount=input.nextInt();
		/*int pageCount=0;
		try{
			pageCount=input.nextInt();
		}catch(InputMismatchException ex){
			System.out.println("����ҳ������ȷ��");
		}*/
		this.setPageCount(pageCount);
	}
}
