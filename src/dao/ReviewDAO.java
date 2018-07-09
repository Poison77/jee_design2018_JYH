package dao;

import object.Review;

public interface ReviewDAO {
	boolean addReview(Review review) throws Exception;			//Ìí¼ÓÆÀÂÛ
	boolean delReview(long reviewid) throws Exception;			//É¾³ıÆÀÂÛ
}
