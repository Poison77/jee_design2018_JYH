package dao;

import object.Review;

public interface ReviewDAO {
	boolean addReview(Review review) throws Exception;			//�������
	boolean delReview(long reviewid) throws Exception;			//ɾ������
}
