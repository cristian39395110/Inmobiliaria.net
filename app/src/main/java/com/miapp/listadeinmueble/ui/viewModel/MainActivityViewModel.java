    package com.miapp.listadeinmueble.ui.viewModel;

    import android.app.Application;

    import androidx.annotation.NonNull;
    import androidx.lifecycle.AndroidViewModel;
    import androidx.lifecycle.LiveData;
    import androidx.lifecycle.MutableLiveData;

    import com.miapp.listadeinmueble.R;
    import com.miapp.listadeinmueble.model.Inmueble;

    import java.util.AbstractCollection;
    import java.util.ArrayList;
    import java.util.List;

    public class MainActivityViewModel  extends AndroidViewModel {

        private  List<Inmueble> lista;
        private MutableLiveData<List<Inmueble>> mutableInmuebles;




        public MainActivityViewModel(@NonNull Application application) {
            super(application);
            preparandoImageg();

        }
        public List<Inmueble> getLista() {

            return lista;
        }



        public void preparandoImageg() {
            lista = new ArrayList<>();
            lista.add(new Inmueble(R.drawable.casa2,"Protezuelo",50.000));
            lista.add(new Inmueble(R.drawable.casa2,"Protezuelo",50.000));
            lista.add(new Inmueble(R.drawable.casa3,"1° de mayo ",80.000));
            if (mutableInmuebles == null) {
                mutableInmuebles = new MutableLiveData<>();
            }
            mutableInmuebles.setValue(lista);


        }
        public LiveData<List<Inmueble>> getMutable() {
            return mutableInmuebles;
        }

    }
