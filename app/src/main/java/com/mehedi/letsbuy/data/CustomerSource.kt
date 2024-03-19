package com.mehedi.letsbuy.data

import android.net.Uri
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.storage.UploadTask

interface CustomerSource {

    fun uploadProductImage(productImageUri: Uri): UploadTask
    fun uploadProduct(product: Product): Task<Void>
    suspend fun addToCart(product: Product, userID: String): Task<Void>


    fun getAllProductByUserID(userID: String): Task<QuerySnapshot>
    fun getAllProduct(): Task<QuerySnapshot>


}