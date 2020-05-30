package com.example.junggonara


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tistory.comfy91.clientanddesignseminar.R
import kotlinx.android.synthetic.main.search_activity.*

class SearchActivity : AppCompatActivity() {

    lateinit var rvBestClass : RecyclerView
    lateinit var rvbestAdapter: BestAdapter
    val datas = mutableListOf<BestData>()

    lateinit var rvMustClass : RecyclerView
    lateinit var rvMustAdapter : MustAdapter
    val datas1 = mutableListOf<MustData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_activity)

        initBestItemRecyclerView()
        initMustItemRecyclerView()

        allviewer.setOnClickListener {
            showToast("전체보기가 클릭되었습니다.")
        }

        certification.setOnClickListener {
            showToast("인증상품이 클릭되었습니다.")

            //인증 상품은 눌린채로, 나머지는 non으로
            certification.setImageResource(R.drawable.search_btn_certification_non)
            star_5.setImageResource(R.drawable.search_btn_5_star_non)
            star_5.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.search_btn_5_star_non))
            notopen.setImageResource(R.drawable.search_btn_notopen_non)
        }

        star_5.setOnClickListener {

            showToast("5성급후기가 클릭되었습니다.")

            //5성급 후기는 눌린채로, 나머지는 non으로

            certification.setImageResource(R.drawable.search_btn_certification_non)
            star_5.setImageResource(R.drawable.search_btn_5_star_non)
            notopen.setImageResource(R.drawable.search_btn_notopen_non)

        }

        notopen.setOnClickListener {

            showToast("미개봉상품이 클릭되었습니다.")

            //미개봉상품은 눌린채로, 나머지는 non으로

            certification.setImageResource(R.drawable.search_btn_certification_non)
            star_5.setImageResource(R.drawable.search_btn_5_star_non)
            notopen.setImageResource(R.drawable.search_btn_notopen_non)

        }
    }

    fun initBestItemRecyclerView(){
        rvBestClass = findViewById(R.id.bestview)
        rvMustClass = findViewById(R.id.product)

        rvbestAdapter = BestAdapter(this)
        rvMustAdapter = MustAdapter(this)

        rvBestClass.adapter = rvbestAdapter
        rvMustClass.adapter = rvMustAdapter

        rvBestClass.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvMustClass.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rvbestAdapter.datas = listOf(
            BestData(
                image_best = R.drawable.search_img_user1,
                userName = "솝트",
                textLevel = "실버 Lv.4",
                medal = R.drawable.search_ic_silver
            ),
            BestData(
                image_best = R.drawable.search_img_user2,
                userName = "스타벅스",
                textLevel = "브론즈 Lv.3",
                medal = R.drawable.search_ic_bronze
            ),
            BestData(
                image_best = R.drawable.search_img_user3,
                userName = "엔젤리너스",
                textLevel = "골드 Lv.1",
                medal = R.drawable.search_ic_gold
            ),
            BestData(
                image_best = R.drawable.search_img_user4,
                userName = "SOPT",
                textLevel = "실버 Lv.2",
                medal = R.drawable.search_ic_silver1
            )
        )


        rvbestAdapter.notifyDataSetChanged()
    }


    fun initMustItemRecyclerView(){
        rvMustClass = findViewById(R.id.product)

        rvMustAdapter = MustAdapter(this)

        rvMustClass.adapter = rvMustAdapter

        rvMustClass.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rvMustAdapter.datas1 = listOf(
            MustData(
                product_image = R.drawable.search_img_product1,
                cer_mini = R.drawable.search_img_certification1,
                new_mini = R.drawable.search_img_new1,
                product_name = "여성 엘칸토 로퍼 250",
                price = "45,000원"
            ),
            MustData(
                product_image = R.drawable.search_img_product2,
                cer_mini = R.drawable.search_img_certification1,
                new_mini = null,
                product_name = "[패션] 여성용 팬츠 자켓 가디건 봄 신상\n" +
                        "균일가 F(95) 무료배송",
                price = "45,000원"
            ),
            MustData(
                product_image = R.drawable.search_img_product3,
                cer_mini = R.drawable.search_img_certification1,
                new_mini = R.drawable.search_img_new1,
                product_name = "여성 엘칸토 로퍼 250",
                price = "45,000원"
            ),
            MustData(
                product_image = R.drawable.search_img_product4,
                cer_mini = R.drawable.search_img_certification1,
                new_mini = null,
                product_name = "[패션] 여성용 팬츠 자켓 가디건 봄 신상\n" +
                        "균일가 F(95) 무료배송",
                price = "45,000원"
            ),
            MustData(
                product_image = R.drawable.search_img_product5,
                cer_mini = R.drawable.search_img_certification1,
                new_mini = null,
                product_name = "여성 엘칸토 로퍼 250",
                price = "45,000원"
            )
        )

        rvMustAdapter.notifyDataSetChanged()
    }

}


