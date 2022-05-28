package com.example.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.security.identity.AccessControlProfileId
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvTotal: TextView
    private lateinit var tvValorRestante: TextView
    private lateinit var tvLimiteCompras: TextView
    private lateinit var etValorAbsorvente: EditText
    private lateinit var etUnidAbsorvente: EditText
    private lateinit var etValorAguaMineral: EditText
    private lateinit var etUnidAguaMineral: EditText
    private lateinit var etValorAguaSanitaria: EditText
    private lateinit var etUnidAguaSanitaria: EditText
    private lateinit var etValorAlcool: EditText
    private lateinit var etUnidAlcool: EditText
    private lateinit var etValorAmaciante: EditText
    private lateinit var etUnidAmaciante: EditText
    private lateinit var etValorArroz: EditText
    private lateinit var etUnidArroz: EditText
    private lateinit var etValorAzeite: EditText
    private lateinit var etUnidAzeite: EditText
    private lateinit var etValorAcucar: EditText
    private lateinit var etUnidAcucar: EditText
    private lateinit var etValorCafe: EditText
    private lateinit var etUnidCafe: EditText
    private lateinit var etValorCerveja: EditText
    private lateinit var etUnidCerveja: EditText
    private lateinit var etValorCondicionador: EditText
    private lateinit var etUnidCondicionador: EditText
    private lateinit var etValorCremeDeLeite: EditText
    private lateinit var etUnidCremeDeLeite: EditText
    private lateinit var etValorCremeDental: EditText
    private lateinit var etUnidCremeDental: EditText
    private lateinit var etValorDesinfetante: EditText
    private lateinit var etUnidDesinfetante: EditText
    private lateinit var etValorDesodorante: EditText
    private lateinit var etUnidDesodorante: EditText
    private lateinit var etValorDetergente: EditText
    private lateinit var etUnidDetergente: EditText
    private lateinit var etValorEscovaDeDente: EditText
    private lateinit var etUnidEscovaDeDente: EditText
    private lateinit var etValorFeijao: EditText
    private lateinit var etUnidFeijao: EditText
    private lateinit var etValorFiltroParaCafe: EditText
    private lateinit var etUnidFiltroParaCafe: EditText
    private lateinit var etValorGelatina: EditText
    private lateinit var etUnidGelatina: EditText
    private lateinit var etValorLeite: EditText
    private lateinit var etUnidLeite: EditText
    private lateinit var etValorLeiteCondensado: EditText
    private lateinit var etUnidLeiteCondensado: EditText
    private lateinit var etValorMacarrao: EditText
    private lateinit var etUnidMacarrao: EditText
    private lateinit var etValorMolhoDeTomate: EditText
    private lateinit var etUnidMolhoDeTomate: EditText
    private lateinit var etValorOleo: EditText
    private lateinit var etUnidOleo: EditText
    private lateinit var etValorPapelHigienico: EditText
    private lateinit var etUnidPapelHigienico: EditText
    private lateinit var etValorPapelToalha: EditText
    private lateinit var etUnidPapelToalha: EditText
    private lateinit var etValorRefrigerante: EditText
    private lateinit var etUnidRefrigerante: EditText
    private lateinit var etValorSabaoEmPo: EditText
    private lateinit var etUnidSabaoEmpo: EditText
    private lateinit var etValorSabonete: EditText
    private lateinit var etUnidSabonete: EditText
    private lateinit var etValorSacoDeLixo: EditText
    private lateinit var etUnidSacoDeLixo: EditText
    private lateinit var etValorSal: EditText
    private lateinit var etUnidSal: EditText
    private lateinit var etValorShampoo: EditText
    private lateinit var etUnidShampoo: EditText
    private lateinit var etValorSuco: EditText
    private lateinit var etUnidSuco: EditText
    private lateinit var etValorVinho: EditText
    private lateinit var etUnidVinho: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bindViews()   {

        tvTotal = findViewById<TextView>(R.id.tvtotal)
        tvValorRestante = findViewById<TextView>(R.id.tvValorRestante)
        tvLimiteCompras = findViewById<TextView>(R.id.tvLimiteCompras)
        etUnidVinho = findViewById<EditText>(R.id.etUnidVinho)
        etValorVinho = findViewById<EditText>(R.id.etValorVinho)
        etUnidSuco = findViewById<EditText>(R.id.etUnidSuco)
        etValorSuco = findViewById<EditText>(R.id.etValorSuco)
        etUnidShampoo = findViewById<EditText>(R.id.etUnidShampoo)
        etValorShampoo = findViewById<EditText>(R.id.etValorShampoo)
        etUnidSal = findViewById<EditText>(R.id.etUnidSal)
        etValorSal = findViewById<EditText>(R.id.etValorSal)
        etUnidSacoDeLixo = findViewById<EditText>(R.id.etUnidSacoDeLixo)
        etUnidSabonete = findViewById<EditText>(R.id.etUnidSabonete)
        etValorSabonete = findViewById<EditText>(R.id.etValorSabonete)
        etUnidSabaoEmpo = findViewById<EditText>(R.id.etUnidSabaoEmPo)
        etValorSabaoEmPo= findViewById<EditText>(R.id.etValorSabaoEmPo)
        etUnidRefrigerante = findViewById<EditText>(R.id.etUnidRefrigerante)
        etValorRefrigerante = findViewById<EditText>(R.id.etValorRefrigerante)
        etUnidPapelToalha = findViewById<EditText>(R.id.etUnidPapelToalha)
        etValorPapelToalha = findViewById<EditText>(R.id.etValorPapelToalha)
        etUnidPapelHigienico = findViewById<EditText>(R.id.etUnidPapelHigienico)
        etValorPapelHigienico = findViewById<EditText>(R.id.etValorPapelHigienico)
        etValorOleo = findViewById<EditText>(R.id.etValorOleo)
        etUnidOleo = findViewById<EditText>(R.id.etUnidOleo)
        etUnidMolhoDeTomate = findViewById<EditText>(R.id.etUnidMolhoDeTomate)
        etValorMolhoDeTomate = findViewById<EditText>(R.id.etValorMolhoDeTomate)
        etUnidMacarrao = findViewById<EditText>(R.id.etUnidMacarrao)
        etValorMacarrao = findViewById<EditText>(R.id.etValorMacarrao)
        etUnidLeiteCondensado = findViewById<EditText>(R.id.etUnidLeiteCondensado)
        etValorLeiteCondensado = findViewById<EditText>(R.id.etValorLeiteCondensado)
        etUnidLeite = findViewById<EditText>(R.id.etUnidLeite)
        etValorLeite = findViewById<EditText>(R.id.etValorLeite)
        etValorGelatina = findViewById<EditText>(R.id.etValorGelatina)
        etUnidGelatina = findViewById<EditText>(R.id.etUnidGelatina)
        etValorFiltroParaCafe = findViewById<EditText>(R.id.etValorFiltroParaCafé)
        etUnidFiltroParaCafe = findViewById<EditText>(R.id.etUnidFiltroParaCafé)
        etValorFeijao = findViewById<EditText>(R.id.etValorFeijao)
        etUnidFeijao = findViewById<EditText>(R.id.etUnidFeijao)
        etValorEscovaDeDente = findViewById<EditText>(R.id.etValorEscovaDeDentes)
        etUnidEscovaDeDente = findViewById<EditText>(R.id.etUnidEscovaDeDentes)
        etValorDetergente = findViewById<EditText>(R.id.etValorDetergente)
        etUnidDetergente = findViewById<EditText>(R.id.etUnidDetergente)
        etValorDesodorante = findViewById<EditText>(R.id.etValorDesodorante)
        etUnidDesodorante = findViewById<EditText>(R.id.etUnidDesodorante)
        etUnidDesinfetante = findViewById<EditText>(R.id.etUnidDesinfetante)
        etUnidDesinfetante = findViewById<EditText>(R.id.etValorDesinfetante)
        etUnidCremeDental = findViewById<EditText>(R.id.etUnidCremeDental)
        etValorCremeDental = findViewById<EditText>(R.id.etValorCremeDental)
        etUnidCremeDeLeite = findViewById<EditText>(R.id.etUnidCremeDeLeite)
        etValorCremeDeLeite = findViewById<EditText>(R.id.etValorCremeDeLeite)
        etUnidCondicionador = findViewById<EditText>(R.id.etUnidCondicionador)
        etValorCondicionador = findViewById<EditText>(R.id.etValorCondicionador)
        etUnidCerveja = findViewById<EditText>(R.id.etUnidCerveja)
        etValorCerveja = findViewById<EditText>(R.id.etValorCerveja)
        etUnidCafe = findViewById<EditText>(R.id.etUnidCafe)
        etValorCafe = findViewById<EditText>(R.id.etValorCafe)
        etUnidAcucar = findViewById<EditText>(R.id.etUnidAçucar)
        etValorAcucar = findViewById<EditText>(R.id.etValorAçucar)
        etUnidAzeite = findViewById<EditText>(R.id.etUnidAzeite)
        etValorAzeite = findViewById<EditText>(R.id.etValorAzeite)
        etUnidArroz = findViewById<EditText>(R.id.etUnidArroz)
        etValorArroz = findViewById<EditText>(R.id.etValorArroz)
        etUnidAmaciante = findViewById<EditText>(R.id.etUnidAmaciante)
        etValorAmaciante = findViewById<EditText>(R.id.etValorAmaciante)
        etValorAlcool = findViewById<EditText>(R.id.etValorAlcool)
        etUnidAlcool = findViewById<EditText>(R.id.etUnidAlcool)
        etValorAguaSanitaria = findViewById<EditText>(R.id.etValorAguaSanitaria)
        etUnidAguaSanitaria = findViewById<EditText>(R.id.etUnidAguaSanitaria)
        etValorAguaMineral = findViewById<EditText>(R.id.etValorAguaMineral)
        etUnidAguaMineral = findViewById<EditText>(R.id.etUnidAguaMineral)
        etValorAbsorvente = findViewById<EditText>(R.id.etValorAbsorvente)
        etUnidAbsorvente = findViewById<EditText>(R.id.etUnidAbsorvente)

    }
    
    fun soma(){

        val absorventeString = etValorAbsorvente.text.toString()
        val unidAbsorvente = etUnidAbsorvente.text.toString()
        val aguaMineralString = etValorAguaMineral.text.toString()
        val unidAguaMineral = etUnidAguaMineral.text.toString()
        val aguaSanitariaString = etValorAguaSanitaria.text.toString()
        val unidAguaSanitaria = etUnidAguaSanitaria.text.toString()
        val alcoolString = etValorAlcool.text.toString()
        val unidAlcool = etUnidAlcool.text.toString()
        val amacianteString = etValorAmaciante.text.toString()
        val unidAmaciante = etUnidAmaciante.text.toString()
        val arrozString = etValorArroz.text.toString()
        val unidArroz = etUnidArroz.text.toString()
        val azeiteString = etValorAzeite.text.toString()
        val unidAzeite = etUnidAzeite.text.toString()
        val acucarString = etValorAcucar.text.toString()
        val unidAcucar = etUnidAcucar.text.toString()
        val cafeString = etValorCafe.text.toString()
        val unidCafe = etUnidCafe.text.toString()
        val cervejaString = etValorCerveja.text.toString()
        val unidCerveja = etUnidCerveja.text.toString()
        val condicionadorString = etValorCondicionador.text.toString()
        val unidCondicionador = etUnidCondicionador.text.toString()
        val cremeDeLeiteString = etValorCremeDeLeite.text.toString()
        val unidCremeDeLeite = etUnidCremeDeLeite.text.toString()
        val cremeDentalString = etValorCremeDental.text.toString()
        val unidCremeDental = etUnidCremeDental.text.toString()
        val desinfetanteString = etValorDesinfetante.text.toString()
        val unidDesinfetante = etUnidDesinfetante.text.toString()
        val desodoranteString = etValorDesodorante.text.toString()
        val unidDesodorante = etUnidDesodorante.text.toString()
        val detergenteString = etValorDetergente.text.toString()
        val unidDetergente = etUnidDetergente.text.toString()
        val escovaDeDenteString = etValorEscovaDeDente.text.toString()
        val unidEscovaDeDente = etUnidEscovaDeDente.text.toString()
        val feijaoString = etValorFeijao.text.toString()
        val unidFeijao = etUnidFeijao.text.toString()
        val filtroParaCafeString = etValorFiltroParaCafe.text.toString()
        val unidFiltroParaCafe = etUnidFiltroParaCafe.text.toString()
        val gelatinaString = etValorGelatina.text.toString()
        val unidGelatina = etUnidGelatina.text.toString()
        val leiteString = etValorLeite.text.toString()
        val unidLeite  = etUnidLeite.text.toString()
        val leiteCondensadoString = etValorLeiteCondensado.text.toString()
        val unidLeiteCondensado = etUnidLeiteCondensado.text.toString()
        val macarraoString = etValorMacarrao.text.toString()
        val unidMacarrao = etUnidMacarrao.text.toString()
        val molhoDeTomate = etValorMolhoDeTomate.text.toString()
        val unidMolhoDeTomate = etUnidMolhoDeTomate.text.toString()
        val oleoString = etValorOleo.text.toString()
        val unidOleo = etUnidOleo.text.toString()
        val papelHigienicoString = etValorPapelHigienico.text.toString()
        val unidPapelHigienico = etUnidPapelHigienico.text.toString()
        val papelToalhaString = etValorPapelToalha.text.toString()
        val unidPapelToalha = etUnidPapelToalha.text.toString()
        val refrigeranteString = etValorRefrigerante.text.toString()
        val unidRefrigerante = etUnidRefrigerante.text.toString()
        val sabaoEmPoString = etValorSabaoEmPo.text.toString()
        val unidSabaoEmPo = etUnidSabaoEmpo.text.toString()
        val saboneteString = etValorSabonete.text.toString()
        val unidSabonete = etUnidSabonete.text.toString()
        val sacoDeLixoString = etValorSacoDeLixo.text.toString()
        val unidSacoDeLixo = etUnidSacoDeLixo.text.toString()
        val salString = etValorSal.text.toString()
        val unidSal = etUnidSal.text.toString()
        val shampooString = etValorShampoo.text.toString()
        val unidShampoo = etUnidShampoo.text.toString()
        val sucoString = etValorSuco.text.toString()
        val unidSuco = etUnidSuco.text.toString()
        val vinhoString = etValorVinho.text.toString()
        val unidVinho = etUnidVinho.text.toString()

    }




}


