package io.egen.rentalflix;

/**
 * Service implementing IFlix interface
 * You can use any Java collection type to store movies
 */
public class MovieService implements IFlix implements Runnable {
    List<Movie> movieList;
    Map<Integer, String> rentHistory = new HashMap<Integer, String>();

    public List<Movie> findAll()
    {
        return movieList;
    }

    public List<Movie> findByName (String name)
    {
        List<Movie> listByName = new ArrayList<Movie>();
        for(Movie m : movieList)
        {
            if(m.getTitle().toLowerCase().contains(name.toLowerCase()))
            {
                listByName.add(m);
            }
        }

        return listByName;
    }

    public Movie create (Movie movie)
    {
        moveList.add(movie);
        return movie;
    }

    public Movie update (Movie movie)
    {
       for(Movie m : movieList)
       {
           if(m.getID() == movie.getID)
           {
               movieList.remove(m);
               movieList.add(movie);
               return ;
           }

       }
       throw new IllegalArgumentException("Illegal Argument");
    }

    public Movie delete (int id)
    {
        for(Movie m : movieList)
       {
           if(m.getID() == id)
           {
               movieList.remove(m);
               return m;
           }

       }
       throw new IllegalArgumentException("Illegal Argument");
    }

    public boolean rentMovie (int movieId, String user)
    {
        if(rentHistory.containsKey(movieId))
        {
            throw new IllegalArgumentException("Illegal Argument");
            return false;
        }

        rentHistory.put(movieId, user);
        return true;

    }
}
