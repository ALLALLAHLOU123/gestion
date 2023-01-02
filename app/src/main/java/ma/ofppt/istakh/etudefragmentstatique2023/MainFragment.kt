package ma.ofppt.istakh.etudefragmentstatique2023

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class MainFragment : Fragment() {
    lateinit var  btnVoirDetail:Button
    lateinit var  listener:OnButtonClickListener



    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment
      val  view= inflater.inflate(R.layout.fragment_main, container, false)
        this.btnVoirDetail=view.findViewById(R.id.btnVoirDetail)

        this.btnVoirDetail.setOnClickListener {
            listener.click(it)

        }

       return  view
    }

    override fun onAttach(context: Context) {

        super.onAttach(context)
        this.listener=context as OnButtonClickListener
    }

    interface OnButtonClickListener
    {
        fun click(view :View)

    }


}