package com.project.calculadoradenotas

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botcalcular = calcular
        val resultado = resultado

        botcalcular.setOnClickListener {

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1+nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if(media >= 6 && faltas <= 10){
                resultado.setText("Aluno APROVADO!" + "\n" + "Nota Final: " + media + "\n" + "Quantidade de Faltas: "+ faltas)
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Aluno REPROVADO!" + "\n" + "Nota Final: " + media + "\n" + "Quantidade de Faltas: "+ faltas)
                resultado.setTextColor(Color.RED)
            }
        }
    }
}