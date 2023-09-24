package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("movie?token=17EVNBW-JFR47BS-Q6YHC1B-SJ681VS&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie/{idFilms}?token=17EVNBW-JFR47BS-Q6YHC1B-SJ681VS")
    Single<TrailerResponse> loadTrailers(@Path("idFilms") int idFilms);


}
