package object;

import java.sql.Date;

public class Movie {
	private long movieid;
	private String moviename;
	private long directorid;
	private String directorname;
	private long tagid;
	private String tags;
	private long starringid;
	private String starring;
	private long review_num;
	private String movie_picture;
	private long score;
	private String country;
	private String Introduction;
	private String review;
	private Date year;

	public String getIntroduction() {
		return Introduction;
	}

	public void setIntroduction(String introduction) {
		Introduction = introduction;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public String getMovie_picture() {
		return movie_picture;
	}

	public void setMovie_picture(String movie_picture) {
		this.movie_picture = movie_picture;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public long getDirectorid() {
		return directorid;
	}

	public void setDirectorid(long directorid) {
		this.directorid = directorid;
	}

	public long getReview_num() {
		return review_num;
	}

	public void setReview_num(long review_num) {
		this.review_num = review_num;
	}

	public long getMovieid() {
		return movieid;
	}

	public void setMovieid(long movieid) {
		this.movieid = movieid;
	}

	public long getTagid() {
		return tagid;
	}

	public void setTagid(long tagid) {
		this.tagid = tagid;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDirectorname() {
		return directorname;
	}

	public void setDirectorname(String directorname) {
		this.directorname = directorname;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getStarring() {
		return starring;
	}

	public void setStarring(String starring) {
		this.starring = starring;
	}

	public long getStarringid() {
		return starringid;
	}

	public void setStarringid(long starringid) {
		this.starringid = starringid;
	}

}
