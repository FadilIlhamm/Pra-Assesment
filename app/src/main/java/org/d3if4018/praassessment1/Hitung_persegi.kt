package org.d3if4018.praassessment1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if4018.praassessment1.databinding.FragmentHitungPersegiBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class Hitung_persegi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentHitungPersegiBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_hitung_persegi, container, false)

        binding.btnHitung.setOnClickListener {
            var nilaipanjang = binding.editText3.text.toString().toDouble()
            var nilailebar = binding.editText4.text.toString().toDouble()

            var hasil = nilaipanjang * nilailebar
            var hasilkeliling = 2*(nilaipanjang+ nilailebar)
            binding.textView10.text ="$hasil"
            binding.textView12.text ="$hasilkeliling"
        }

        return binding.root
    }


}
