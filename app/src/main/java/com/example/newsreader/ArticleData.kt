package com.example.newsreader

import android.icu.text.CaseMap
import com.google.firebase.storage.StorageReference
import java.util.*
import kotlin.collections.ArrayList

data class ArticleData(var title: String,
//                       var publishingDate:Date = Date(),
//                       var updateDate:Date = Date(),
//                       var imagesDescription :ArrayList<String>,
//                       var imagesAuthors :ArrayList<String>,
                       var author:String,
                       var subheading:String,
//                       var text:String = "texttexttext",
                       var id:String,
                       var onlyFirstImage:StorageReference
){
//    constructor(empa: String) : this(title,publishingDate,updateDate,imagesDescription, imagesAuthors, author, text, images) {
//
//    }


}