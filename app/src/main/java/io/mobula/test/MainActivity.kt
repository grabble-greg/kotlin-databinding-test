package io.mobula.test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.mobula.test.databinding.ActivityMainBinding
import io.mobula.test.jane.foo


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        foo(binding.textLayout!!)
    }
}