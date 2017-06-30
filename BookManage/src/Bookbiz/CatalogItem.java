package Bookbiz;

import entity.Book;
import entity.Disc;
import entity.Resource;

/**
 * 资源目录类
 */
public class CatalogItem {
	/**
	 * 记录资源
	 * @param resourceType 资源类型
	 * @return 资源
	 */
	public Resource noteResource(String resourceType){
		Resource resource=null;
		if("图书".equals(resourceType)){//判断资源是否是图书
			resource=new Book();//创建图书对象
			resource.enrol();//调用登记方法
		}else if("唱片".equals(resourceType)){//判断资源是否是唱片
			resource=new Disc();//创建唱片对象
			resource.enrol();//调用登记方法
		}
		return resource;
	}
}

