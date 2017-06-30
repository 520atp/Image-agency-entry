package entity;

import java.util.Scanner;

/**
 * ��Ƭ��
 */
public class Disc extends Resource {
	private String singMan;//�ݳ���
	private String type;//�������ͣ�CD��Ŵ���
	
	public Disc(){}
	
	public Disc(String indexId,String resourceName,String publishTime,boolean state,String singMan,String type){
		super(indexId,resourceName,publishTime,state);
		this.singMan=singMan;
		this.type=type;
	}

	public String getSingMan() {
		return singMan;
	}

	public void setSingMan(String singMan) {
		this.singMan = singMan;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	/**
	 * ��д�鿴��ϸ��Ϣ
	 */
	public void printInfo() {
		System.out.println("�ó�Ƭ��ϸ��Ϣ���£�");
		System.out.println("������\t����\t����ʱ��\t\t�ݳ���\t����\t״̬");
		String state=this.getState()?"�ѽ��":"�ɽ���";//�ж�״̬
		System.out.println(this.getIndexId()+"\t"
				+this.getResourceName()+"\t"
				+this.getPublishTime()+"\t"
				+this.getSingMan()+"\t"
				+this.getType()+"\t"
				+state);
	}

	/**
	 * ��д�Ǽ���Դ��Ϣ
	 */
	public void enrol() {
		super.enrol();//���ø���ĵǼǷ���
		Scanner input=new Scanner(System.in);
		System.out.print("�������ݳ��ˣ�");
		String singMan=input.next();
		this.setSingMan(singMan);
		System.out.print("��������(1.CD  2.�Ŵ�)��");
		int typeId=input.nextInt();
		if(typeId==1)//���ݿͻ�ѡ��Ǽǽ�������
			this.setType("CD");
		else
			this.setType("�Ŵ�");	
	}
}
