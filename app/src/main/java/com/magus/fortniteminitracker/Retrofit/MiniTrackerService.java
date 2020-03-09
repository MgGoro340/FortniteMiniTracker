package com.magus.fortniteminitracker.Retrofit;

import com.magus.fortniteminitracker.model.ResponseFindUser;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface MiniTrackerService {

    //profile/psn/cardenal_borgia
     @GET("profile/psn/cardenal_borgia")
     @Headers("TRN-Api-Key:b5507bd6-b32b-4012-b107-1fa1c6c56368")
     Call<ResponseFindUser> doConsultaUsuario();
}
