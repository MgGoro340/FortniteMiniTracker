package com.magus.fortniteminitracker.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressWarnings("deprecation")
public class MiniTrackerClient {

      private static MiniTrackerClient instance = null ;
      private static MiniTrackerService miniTrackerService ;
      private Retrofit retrofit;

      public MiniTrackerClient(){
           retrofit = new Retrofit.Builder()
                  .baseUrl("https://api.fortnitetracker.com/v1/")
                  .addConverterFactory(GsonConverterFactory.create())
                  .build();
          miniTrackerService = retrofit.create(MiniTrackerService.class);


      }

      //singleton
      public static  MiniTrackerClient getInstance(){
          if ( instance == null) {
              instance = new MiniTrackerClient();
          }
          return instance;
      }

      public static MiniTrackerService getInstanceMiniTrackerService() {
          return miniTrackerService;
      }


}
