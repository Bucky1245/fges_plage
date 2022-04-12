package com.fges.fges_plage;

import java.util.ArrayList;
import java.util.List;

public class DonneeStationObservableImpl implements DonneeStationObservable{

    List<DonneeStationObserver> observateurs = new ArrayList<>();

    @Override
    public void enregistrerObservateur(DonneeStationObserver observer) {
        observateurs.add(observer);
    }

    @Override
    public void supprimerObservateur(DonneeStationObserver observer) {
        observateurs.add(observer);        
    }

    @Override
    public void notifierObservateurs(DonneeStation donneeStation) {
        for(DonneeStationObserver notification : observateurs)
        {
            notification.actualiser(donneeStation);
        }       
    }
}
