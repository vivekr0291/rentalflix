package io.egen.rentalflix;

/**
 * Entity representing a movie.
 * Fields: id, title, year, language
 */
public class Movie {

	//POJO IMPLEMENTATION GOES HERE
	private int id;
	private String title;
	private int year;
	private String language;
	private int duration;

	public void setID(int setid)
	{
	    id = setid;
	}

	public void setTitle(String settitle)
	{
	    title = settitle;
	}

	public void setYear(int y)
	{
	    year = y;
	}

	public void setLang(String setlang)
	{
	    lang = setlang;
	}

	public void setDuration(int setduration)
	{
	    duration = setduration;
	}

	public int getID()
	{
	    return id;
	}

	public String getTitle()
	{
	    return title;
	}

	public int getYear()
	{
	    return year;
	}

	public String getLang()
	{
	    return lang;
	}

	public int getDuration()
	{
	    return duration;
	}

}
