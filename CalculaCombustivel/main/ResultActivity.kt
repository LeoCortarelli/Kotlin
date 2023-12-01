package com.calculacomb

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_activity)

        val relacao = intent.getDoubleExtra("relacao", 0.0)
        val gastoEtanol = intent.getDoubleExtra("gastoEtanol", 0.0)
        val gastoGasolina = intent.getDoubleExtra("gastoGasolina", 0.0)
        val economia = intent.getDoubleExtra("economia", 0.0)

        val precoEtanol = intent.getStringExtra("precoEtanol")
        val precoGasolina = intent.getStringExtra("precoGasolina")
        val mediaEtanol = intent.getStringExtra("mediaEtanol")
        val mediaGasolina = intent.getStringExtra("mediaGasolina")
        val melhorCombustivel = intent.getStringExtra("melhorCombustivel")

        val textViewPrecoEtanol: TextView = findViewById(R.id.textViewPrecoEtanol)
        val textViewPrecoGasolina: TextView = findViewById(R.id.textViewPrecoGasolina)
        val textViewMediaEtanol: TextView = findViewById(R.id.textViewMedioEtanol)
        val textViewMediaGasolina: TextView = findViewById(R.id.textViewMedioGasolina)

        val textViewRelacao: TextView = findViewById(R.id.textViewResultRelacao)
        val textViewGastoEtanol: TextView = findViewById(R.id.textViewGastoEtanol)
        val textViewGastoGasolina: TextView = findViewById(R.id.textViewGastoGasolina)
        val textViewMelhorCombustivel: TextView = findViewById(R.id.textViewMelhorCombustivel)
        val textViewEconomia: TextView = findViewById(R.id.textViewEconomia)
        val voltar: Button = findViewById(R.id.buttonVoltar)

        textViewRelacao.text = "Relação: $relacao"
        textViewGastoEtanol.text = "Gasto com Etanol: $gastoEtanol"
        textViewGastoGasolina.text = "Gasto com Gasolina: $gastoGasolina"
        textViewEconomia.text = "Economia: $economia"
        textViewPrecoEtanol.text = "Preço do Etanol: $precoEtanol"
        textViewPrecoGasolina.text = "Preço da Gasolina: $precoGasolina"
        textViewMediaEtanol.text = "Média do Etanol: $mediaEtanol"
        textViewMediaGasolina.text = "Média da Gasolina: $mediaGasolina"
        textViewMelhorCombustivel.text = "Melhor Combustivel: $melhorCombustivel"

        voltar.setOnClickListener {
            this.finish();
        }

    }
}