package com.calculacomb

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    lateinit var melhorComb : TextView
    var relacao : Double = 0.0;
    var gastoEtanol : Double = 0.00;
    var gastoGasolina : Double = 0.00;
    var economia : Double = 0.00;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val buttonLimpar: Button = findViewById(R.id.buttonLimpar)
        val buttonCalcular: Button = findViewById(R.id.buttonCalcular)
        val editTextNumberPrecoEtanol: EditText = findViewById(R.id.editTextNumberPrecoEtanol)
        val editTextNumberPrecoGasolina: EditText = findViewById(R.id.editTextNumberPrecoGasolina)
        val editTextNumberMediaEtanol: EditText = findViewById(R.id.editTextNumberDecimalMediaEtanol)
        val editTextNumberMediaGasolina: EditText = findViewById(R.id.editTextNumberDecimalMediaGasolina)

        buttonLimpar.setOnClickListener{
            editTextNumberPrecoEtanol.text.clear()
            editTextNumberPrecoGasolina.text.clear()
            editTextNumberMediaEtanol.text.clear()
            editTextNumberMediaGasolina.text.clear()
        }





        buttonCalcular.setOnClickListener {

            var gas = editTextNumberPrecoGasolina.text.toString().toDouble()
            var etanol = editTextNumberPrecoEtanol.text.toString().toDouble()
            var mediaEtanol = editTextNumberMediaEtanol.text.toString().toDouble()
            var mediaGasolina = editTextNumberMediaGasolina.text.toString().toDouble()

            // A relação do Etanol e Gasolina deve ser calculada, conforme abaixo:
            relacao = (etanol/gas) / 100;

            // Gasto com Etanol deve ser calculada, conforme abaixo:
            gastoEtanol = etanol / mediaEtanol;

            // Gasto com Gasolina deve ser calculada, conforme abaixo:
            gastoGasolina = gas / mediaGasolina;

            // A economia e de:
            if (gas > etanol){
                economia = gas - etanol;
            }else{
                economia = etanol - gas;
            }


            val intent = Intent(this@MainActivity, ResultActivity::class.java)

            // Passar os dados necessários para a ResultActivity
            intent.putExtra("relacao", relacao)
            intent.putExtra("gastoEtanol", gastoEtanol)
            intent.putExtra("gastoGasolina", gastoGasolina)
            intent.putExtra("economia", economia)

            intent.putExtra("precoEtanol", editTextNumberPrecoEtanol.text.toString())
            intent.putExtra("precoGasolina", editTextNumberPrecoGasolina.text.toString())
            intent.putExtra("mediaEtanol", editTextNumberMediaEtanol.text.toString())
            intent.putExtra("mediaGasolina", editTextNumberMediaGasolina.text.toString())

            if (etanol < gas) {
                intent.putExtra("melhorCombustivel", "Etanol")
            } else {
                intent.putExtra("melhorCombustivel", "Gasolina")
            }


            // Iniciar a ResultActivity
            startActivity(intent)

        }





    }


}