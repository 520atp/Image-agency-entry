package Bookbiz;

import entity.Book;
import entity.Disc;
import entity.Resource;

/**
 * ��ԴĿ¼��
 */
public class CatalogItem {
	/**
	 * ��¼��Դ
	 * @param resourceType ��Դ����
	 * @return ��Դ
	 */
	public Resource noteResource(String resourceType){
		Resource resource=null;
		if("ͼ��".equals(resourceType)){//�ж���Դ�Ƿ���ͼ��
			resource=new Book();//����ͼ�����
			resource.enrol();//���õǼǷ���
		}else if("��Ƭ".equals(resourceType)){//�ж���Դ�Ƿ��ǳ�Ƭ
			resource=new Disc();//������Ƭ����
			resource.enrol();//���õǼǷ���
		}
		return resource;
	}
}

