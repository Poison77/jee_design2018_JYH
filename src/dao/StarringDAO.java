package dao;

import object.Starring;

public interface StarringDAO {

	Starring showStarring(long starringid) throws Exception;		//��ʾ��Ա��ϸ��Ϣҳ
	boolean addStarring(Starring starring) throws Exception;		//������Ա
	Starring findStarring(long starringid) throws Exception	;		//ͨ����Աid��ѯ��Ա
}
