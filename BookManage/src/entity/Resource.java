package entity;
import java.util.Scanner;

/**
 * ��Դ
 */
public abstract class Resource {
	private String indexId;//������
	private String resourceName;//����
	private String publishTime;//����ʱ��
	private boolean state;//��Դ״̬
	public abstract void printInfo();//�鿴��Դ��ϸ��Ϣ

	public Resource(){
		
	}
	
	public Resource(String indexId,String resourceName,String publishTime,boolean state){
		this.indexId=indexId;
		this.resourceName=resourceName;
		this.publishTime=publishTime;
		this.state=state;
	}
	
	/**
	 * �Ǽ���Դ��Ϣ
	 */
	public void enrol(){
		Scanner input=new Scanner(System.in);
		System.out.print("������������:");
		String indexId=input.next();
		this.setIndexId(indexId);
		System.out.print("����������:");
		String resourceName=input.next();
		this.setResourceName(resourceName);
		System.out.print("���������ʱ��(yyyy-MM-dd):");
		String publishTime=input.next();
		this.setPublishTime(publishTime);
	}
	
	public String getIndexId() {
		return indexId;
	}
	public void setIndexId(String indexId) {
		this.indexId = indexId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
}
