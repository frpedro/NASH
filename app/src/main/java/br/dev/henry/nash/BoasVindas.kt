package br.dev.henry.nash
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BoasVindas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boasvindas)

        val startButton: Button = findViewById(R.id.button_start)

        startButton.setOnClickListener {
            val intent = Intent(this, Assinatura::class.java)
            startActivity(intent)
        }
    }
}
