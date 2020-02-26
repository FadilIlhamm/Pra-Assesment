package org.d3if4018.praassessment1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if4018.praassessment1.databinding.FragmentHitungPersegiBinding
import org.d3if4018.praassessment1.databinding.FragmentHitungSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HitungSegitiga : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentHitungSegitigaBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_hitung_segitiga, container, false)

        binding.btnHitung.setOnClickListener {
            var nilaialas = binding.editText.text.toString().toDouble()
            var nilaitinggi = binding.editText2.text.toString().toDouble()

            var hasil = 0.5 * nilaialas * nilaitinggi
            var hasilkeliling = 3 * nilaialas
            binding.textView5.text = "$hasil"
            binding.textView7.text = "$hasilkeliling"
        }
        return binding.root
    }


}
