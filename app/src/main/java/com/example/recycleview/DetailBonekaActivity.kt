package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycleview.databinding.ActivityDetailBonekaBinding
import com.example.recycleview.model.Boneka

class DetailBonekaActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBonekaBinding
    var b : Bundle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBonekaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    fun initView() {
        val data = intent.getParcelableExtra<Boneka>("Boneka")
        binding.imgFoto.setImageResource(data!!.foto)
        binding.tvJudul.text = data.judul
        binding.tvIsi.text = data.isi
        binding.tvPublish.text = data.publish
        binding.tvTanggal.text = data.tanggal

        supportActionBar?.title = "Detail Berita"
    }
}

