package com.isma.trabajo1dispositivosmoviles;

import static android.content.Intent.ACTION_AIRPLANE_MODE_CHANGED;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ModoAvionCambio cambio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cambio = new ModoAvionCambio();
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(cambio,new IntentFilter(ACTION_AIRPLANE_MODE_CHANGED));
    }





}


/*
 Objetivo
Aplicar el uso de BroadcastReceiver para capturar eventos del sistema y comprender cómo responder a ellos mediante el uso de Intents implícitos.
______________
Consigna
1. Crear una aplicación Android que:
o Implemente un BroadcastReceiver que escuche el evento del sistema correspondiente al cambio de Modo Avión (ACTION_AIRPLANE_MODE_CHANGED).
o Al detectar que el Modo Avión ha sido activado, la aplicación debe generar un Intent implícito para abrir la aplicación de llamadas con el número 2664553747.
2. Subir el proyecto a un repositorio público en GitHub.
3. Entregar el enlace al repositorio a través de esta tarea en el aula virtual.
______________
Entregables
• Código fuente completo en un repositorio público de GitHub.
• Enlace correcto al repositorio entregado en esta tarea.
* */