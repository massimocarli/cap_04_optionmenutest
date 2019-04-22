package uk.co.massimocarli.optionmenutest

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  private val TAG_LOG = "MainActivity"

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    // Inflate the menu; this adds items to the action bar if it is present.
    menuInflater.inflate(R.menu.menu_main, menu)
    Log.i(TAG_LOG, "onCreateOptionsMenu")
    return true
  }

  override fun onPrepareOptionsMenu(menu: Menu): Boolean {
    Log.i(TAG_LOG, "onPrepareOptionsMenu")
    return super.onPrepareOptionsMenu(menu)
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    Log.i(TAG_LOG, "onOptionsItemSelected " + item.title)
    Toast.makeText(this, "Selected " + item.title, Toast.LENGTH_SHORT).show()
    return super.onOptionsItemSelected(item)
  }
}
