package com.magus.fortniteminitracker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.magus.fortniteminitracker.Retrofit.MiniTrackerClient;
import com.magus.fortniteminitracker.Retrofit.MiniTrackerService;
import com.magus.fortniteminitracker.model.ResponseFindUser;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link UserPSNFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class UserPSNFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    private Button btnVerEstadisticas;
    MiniTrackerService miniTrackerService;
    MiniTrackerClient miniTrackerClient;
    private TextView tvUsuarioPsn;
    public String sUsuarioFortnite ;
    public String sPlataforma = "PSN";

    private  View nView ;

    public UserPSNFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        miniTrackerClient = MiniTrackerClient.getInstance();
        miniTrackerService = MiniTrackerClient.getInstanceMiniTrackerService();



        // Inflate the layout for this fragment
        nView = inflater.inflate(R.layout.fragment_user_psn, container, false);
        tvUsuarioPsn = nView.findViewById(R.id.editTextUsuarioPsn);

         btnVerEstadisticas = (Button) nView.findViewById(R.id.buttonVerUsuario);
         btnVerEstadisticas.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(final View v) {

                 sUsuarioFortnite = tvUsuarioPsn.getText().toString();

                 if (sUsuarioFortnite.length() > 0) {

                     // aca llamo al servicio y busco la info
                     Call<ResponseFindUser> call = miniTrackerService.doConsultaUsuario(sUsuarioFortnite,sPlataforma);
                     call.enqueue(new Callback<ResponseFindUser>() {
                         @Override
                         public void onResponse(Call<ResponseFindUser> call, Response<ResponseFindUser> response) {
                             // por aca todo bien
                             if (response.isSuccessful()) {


                                 //todo way
                                 // llamo a la siguiente ventana
                                 if (response.body().getAccountId() != null) {
                                     Intent itEstadisticas = new Intent(getActivity(), EstadisticasUsuarioActivity.class);

                                     itEstadisticas.putExtra("account", response.body().getAccountId());
                                     itEstadisticas.putExtra("epicUser", response.body().getEpicUserHandle());
                                     itEstadisticas.putExtra("wins", response.body().getStats().getP2().getTop1().getValue());
                                     itEstadisticas.putExtra("kills", response.body().getStats().getP2().getKills().getValue());
                                     itEstadisticas.putExtra("winRatio", response.body().getStats().getP2().getWinRatio().getValue());
                                     itEstadisticas.putExtra("matchs", response.body().getStats().getP2().getMatches().getValue());
                                     itEstadisticas.putExtra("killsPorGame", response.body().getStats().getP2().getKpg().getValue());
                                     itEstadisticas.putExtra("top10", response.body().getStats().getP2().getTop10().getValue());
                                     itEstadisticas.putExtra("top25", response.body().getStats().getP2().getTop25().getValue());


                                     startActivity(itEstadisticas);
                                 } else {
                                     Toast.makeText(getActivity(),"No se encuentra el usuario en Epic", Toast.LENGTH_LONG);
                                 }
                                 //destruimos el activity

                             }
                         }

                         @Override
                         public void onFailure(Call<ResponseFindUser> call, Throwable t) {
                             Log.i("CALL", "un pequeño error " + t.fillInStackTrace());
                             Toast.makeText(getContext(), "hubo un errror al consutlar", Toast.LENGTH_LONG);

                         }
                     });


                 } else{
                     tvUsuarioPsn.setError("Debe Completar un usuario de Fortnite");
                 }
             }
         });
         return nView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonPSN:
                if (checked)
                    sPlataforma = "psn";
                    break;
            case R.id.radioButtonXbox:
                if (checked)
                    sPlataforma = "xbl";
                    break;
            case R.id.radioButtonPC:
                if (checked)
                    sPlataforma = "pc";
                    break;

        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
