package com.example.todoroomapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todoroomapp.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var database: TaskDatabase
    private lateinit var adapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = TaskDatabase.getDatabase(this)

        adapter = TaskAdapter(emptyList())

        binding.recyclerView.layoutManager =
            LinearLayoutManager(this)

        binding.recyclerView.adapter = adapter

        loadTasks()

        binding.btnAddTask.setOnClickListener {

            val taskTitle =
                binding.etTask.text.toString()

            if (taskTitle.isNotEmpty()) {

                lifecycleScope.launch {

                    database.taskDao().insert(
                        Task(title = taskTitle)
                    )

                    binding.etTask.text.clear()

                    loadTasks()
                }
            }
        }
    }

    private fun loadTasks() {

        lifecycleScope.launch {

            val tasks =
                database.taskDao().getAllTasks()

            adapter.updateTasks(tasks)
        }
    }
}