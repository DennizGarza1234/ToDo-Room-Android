# ToDo Room Android App

# Overview

This project is a ToDo List Android application built using Kotlin and Android Studio.

The application allows users to:
- Add tasks
- Store tasks locally using Room Database
- Display tasks in a RecyclerView
- Persist data even after closing the application

This project demonstrates:
- Room Database integration
- RecyclerView usage
- ViewBinding
- CRUD-style local data storage
- AndroidX support
- Kotlin Android development

# Features

- Add new tasks
- Save tasks locally using Room Database
- View all saved tasks
- Persistent offline storage
- RecyclerView task display
- Material Design components
- AndroidX compatibility

# Technologies Used

- Kotlin
- Android Studio
- Room Database
- RecyclerView
- ViewBinding
- AndroidX
- Material Design Components

# Project Structure

## Main Components

- `MainActivity.kt`  
  Handles UI interactions and displays tasks.

- `Task.kt`  
  Entity class representing a task in the database.

- `TaskDao.kt`  
  DAO interface containing database operations.

- `TaskDatabase.kt`  
  Room database configuration.

- `TaskAdapter.kt`  
  RecyclerView adapter for displaying tasks.

# Dependencies

```kotlin
implementation("androidx.core:core-ktx:1.13.1")
implementation("androidx.appcompat:appcompat:1.7.0")
implementation("com.google.android.material:material:1.12.0")
implementation("androidx.constraintlayout:constraintlayout:2.1.4")
implementation("androidx.activity:activity-ktx:1.9.0")

implementation("androidx.room:room-runtime:2.6.1")
implementation("androidx.room:room-ktx:2.6.1")
kapt("androidx.room:room-compiler:2.6.1")

implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.3")
implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.3")

implementation("androidx.recyclerview:recyclerview:1.3.2")
```
