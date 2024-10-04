package com.example.myapplication_2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var saveButton: Button
    private lateinit var cancelButton: Button
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Liên kết với các thành phần UI
        editTextName = findViewById(R.id.editTextName)
        saveButton = findViewById(R.id.saveButton)
        cancelButton = findViewById(R.id.cancelButton)
        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)

        // Xử lý sự kiện khi nhấn nút Lưu
        saveButton.setOnClickListener {
            val name = editTextName.text.toString()
            textView.text = name // Cập nhật TextView với tên người dùng
        }

        // Xử lý sự kiện khi nhấn nút Hủy
        cancelButton.setOnClickListener {
            editTextName.text.clear() // Xóa trường nhập tên
        }
    }
}