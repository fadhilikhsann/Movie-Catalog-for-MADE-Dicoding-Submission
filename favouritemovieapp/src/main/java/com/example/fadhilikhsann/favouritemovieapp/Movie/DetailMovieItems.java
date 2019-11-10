package com.example.fadhilikhsann.favouritemovieapp.Movie;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailMovieItems {
    String tvBack;
    String tvPoster;
    String tvJudul;
    String tvRilis;
    String tvProduser;
    String tvDurasi;
    String tvGenre;
    String tvOverview;
    String tvYear;
    int id;
    double tvRating;

    public DetailMovieItems(JSONObject responseObject) {

        try {

            String genn = "";
            JSONArray listgenn = responseObject.getJSONArray("genres");
            for (int i = 0; i < listgenn.length(); i++) {
                genn += listgenn.getJSONObject(i).getString("name");
                if (i < listgenn.length() - 1) {
                    genn += ", ";
                }
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(responseObject.getString("release_date"));
            sdf = new SimpleDateFormat("MMM dd, yyyy");
            this.tvPoster = responseObject.getString("poster_path");
            this.tvJudul = responseObject.getString("title");
            this.tvRilis = sdf.format(date);
            this.tvProduser = responseObject.getJSONArray("production_companies").getJSONObject(0).getString("name") + " (" + responseObject.getJSONArray("production_companies").getJSONObject(0).getString("origin_country") + ")";
            this.tvDurasi = responseObject.getString("runtime");
            this.tvGenre = genn;
            this.tvOverview = responseObject.getString("overview");
            this.id = responseObject.getInt("id");
            this.tvRating = responseObject.getDouble("vote_average");
            this.tvBack = responseObject.getString("backdrop_path");
            sdf = new SimpleDateFormat("yyyy");
            this.tvYear = sdf.format(date);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getTvYear() {
        return tvYear;
    }

    public void setTvYear(String tvYear) {
        this.tvYear = tvYear;
    }

    public String getTvBack() {
        return tvBack;
    }

    public void setTvBack(String tvBack) {
        this.tvBack = tvBack;
    }

    public String getTvPoster() {
        return tvPoster;
    }

    public void setTvPoster(String tvPoster) {
        this.tvPoster = tvPoster;
    }

    public String getTvJudul() {
        return tvJudul;
    }

    public void setTvJudul(String tvJudul) {
        this.tvJudul = tvJudul;
    }

    public String getTvRilis() {
        return tvRilis;
    }

    public void setTvRilis(String tvRilis) {
        this.tvRilis = tvRilis;
    }

    public String getTvProduser() {
        return tvProduser;
    }

    public void setTvProduser(String tvProduser) {
        this.tvProduser = tvProduser;
    }

    public String getTvDurasi() {
        return tvDurasi;
    }

    public void setTvDurasi(String tvDurasi) {
        this.tvDurasi = tvDurasi;
    }

    public String getTvGenre() {
        return tvGenre;
    }

    public void setTvGenre(String tvGenre) {
        this.tvGenre = tvGenre;
    }

    public String getTvOverview() {
        return tvOverview;
    }

    public void setTvOverview(String tvOverview) {
        this.tvOverview = tvOverview;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTvRating() {
        return tvRating;
    }

    public void setTvRating(double tvRating) {
        this.tvRating = tvRating;
    }
}
