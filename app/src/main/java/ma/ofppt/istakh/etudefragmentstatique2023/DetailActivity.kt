package ma.ofppt.istakh.etudefragmentstatique2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class DetailActivity : AppCompatActivity(),MainFragment.OnButtonClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    override fun click(view: View) {
        Toast.makeText(this,"Bonsoir", Toast.LENGTH_LONG).show()

    }
}