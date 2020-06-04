package com.tistory.comfy91.clientanddesignseminar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_fashion_item.*


class PregnantFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fashion_item, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setPoplarKeywords()
        setPopularSeller()
        setMustBuy()
    }

    private fun setPoplarKeywords(){
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

    private fun setPopularSeller(){
        activity?.let {
            Glide.with(it).load(R.drawable.search_img_user1).into(imgv_seller1)
            Glide.with(it).load(R.drawable.search_img_user2).into(imgv_seller2)
            Glide.with(it).load(R.drawable.search_img_user3).into(imgv_seller3)
            Glide.with(it).load(R.drawable.search_img_user4).into(imgv_seller4)

            Glide.with(it).load(R.drawable.search_ic_silver).into(imgv_seller_level1)
            Glide.with(it).load(R.drawable.search_ic_bronze).into(imgv_seller_level2)
            Glide.with(it).load(R.drawable.search_ic_gold).into(imgv_seller_level3)
            Glide.with(it).load(R.drawable.search_ic_silver).into(imgv_seller_level4)
        }
    }

    private fun setMustBuy(){
        activity?.baseContext?.let {
            Glide.with(it).load(R.drawable.search_btn_certification).into(imgv_pick_auth)
            Glide.with(it).load(R.drawable.search_btn_5star).into(imgv_pick_5star)
            Glide.with(it).load(R.drawable.search_btn_notopen).into(imgv_pick_unpack)


            Glide.with(it).load(R.drawable.search_img_product1).into(imgv_product1)
            Glide.with(it).load(R.drawable.search_img_product2).into(imgv_product2)
            Glide.with(it).load(R.drawable.search_img_product3).into(imgv_product3)
            Glide.with(it).load(R.drawable.search_img_product4).into(imgv_product4)
            Glide.with(it).load(R.drawable.search_img_product5).into(imgv_product5)

            Glide.with(it).load(R.drawable.search_img_certification1).into(imgv_product_auth1)
            Glide.with(it).load(R.drawable.search_img_certification1).into(imgv_product_auth2)
            Glide.with(it).load(R.drawable.search_img_certification1).into(imgv_product_auth3)
            Glide.with(it).load(R.drawable.search_img_certification1).into(imgv_product_auth4)
            Glide.with(it).load(R.drawable.search_img_certification1).into(imgv_product_auth5)


            Glide.with(it).load(R.drawable.search_img_new1).into(imgv_product_new1)
            Glide.with(it).load(R.drawable.search_img_new1).into(imgv_product_new3)
        }
    }


    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PregnantFragment().apply {
                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
