package com.fges.fges_plage.widgets;

import java.io.PrintStream;

import com.fges.fges_plage.DonneeStation;

public class WidgetCharAVoile extends Widget{

    public WidgetCharAVoile(DonneeStation donneeInit) {
        super(donneeInit);
    }

    @Override
    public void afficher(PrintStream stream) {
        stream.println("Char à Voile :");
        stream.println("========");
        if(super.derniereDonnee.getVent() >= 3)
        {
            stream.println("il est possible d'en faire.");
        }
        else
        {
            stream.println("il est impossible d'en faire.");
        }
    }
    
}
