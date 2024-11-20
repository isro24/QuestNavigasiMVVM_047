package com.example.praktikum5.ui.view

import android.widget.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.praktikum5.model.Mahasiswa
import androidx.compose.material3.Button



@Composable
fun DetailMahasiswaView(
    dataMhs: Mahasiswa,
    onClickButton: () -> Unit

){
    val listDataMhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("Email", dataMhs.email),
        Pair("NIM", dataMhs.nim),
        Pair("noTelepon", dataMhs.noTelepon),
        Pair("Gender", dataMhs.gender),
        Pair("Alamat", dataMhs.alamat),
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        listDataMhs.forEach { data ->
            DetailMhs(judul = data.first, isinya = data.second)
        }
        Button(
            onClick = { onClickButton() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text("Kembali")
        }

    }



}

@Composable
fun DetailMhs(judul: String, isinya:String){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Text(text = judul, modifier = Modifier.weight(0.8f))
        Text(text = ":", modifier = Modifier.weight(0.2f))
        Text(text = isinya, modifier = Modifier.weight(2f))
    }
}