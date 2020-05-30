package com.tistory.comfy91.clientanddesignseminar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_fashion_item.*


class FashionItemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fashion_item, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        tv_popular_keyword1.text = "# 시계"
        tv_popular_keyword2.text = "# 구찌"
        tv_popular_keyword3.text = "# 코치"
        tv_popular_keyword4.text = "# 메트로시티"
        tv_popular_keyword5.text = "# 고야드"
        tv_popular_keyword6.text = "# 290"
        tv_popular_keyword7.text = "# 제이에스티나"
        tv_popular_keyword8.text = "# 가방"
        tv_popular_keyword9.text = "# 지갑"
        tv_popular_keyword10.text = "# 프라다"
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FashionItemFragment().apply {
                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
