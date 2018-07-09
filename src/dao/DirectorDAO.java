package dao;

import object.Director;

public interface DirectorDAO {

	Director showDirector(long directorid) throws Exception;		//��ʾ������ϸ��Ϣҳ
	boolean addDirector(Director director) throws Exception;		//���ӵ���
	Director findDirector(long directorid) throws Exception;		//����id��ѯ����
}
