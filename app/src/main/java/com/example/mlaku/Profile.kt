package com.example.mlaku
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mlaku.databinding.ActivityProfileBinding
import com.google.firebase.auth.FirebaseAuth


class Profile : AppCompatActivity() {
    lateinit var binding : ActivityProfileBinding
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnChangeEmail.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
        binding.btnLogout.setOnClickListener {
            btnLogout()
        }
        binding.btnDelete.setOnClickListener {
            btnDelete()
        }
    }

    private fun btnLogout() {
        auth = FirebaseAuth.getInstance()
        auth.signOut()
        Toast.makeText(this,"Silahkan Login Kembali", Toast.LENGTH_SHORT).show()
        val i = Intent(applicationContext, LoginActivity::class.java)        // Specify any activity here e.g. home or splash or login etc
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        i.putExtra("EXIT", true)
        startActivity(i)
        finish()
    }
    private  fun btnDelete(){
        val currentUser = FirebaseAuth.getInstance().currentUser
        currentUser!!.delete()
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val delete = Intent(this,LoginActivity::class.java)
                    Toast.makeText(this,"Akun dihapus, silahkan buat kembali", Toast.LENGTH_SHORT).show()
                    startActivity(delete)
                    val i = Intent(applicationContext, LoginActivity::class.java)        // Specify any activity here e.g. home or splash or login etc
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    i.putExtra("EXIT", true)
                    startActivity(i)
                    finish()
                }
            }
    }
}