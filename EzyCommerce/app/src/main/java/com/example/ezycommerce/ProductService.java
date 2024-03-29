package com.example.ezycommerce;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ProductService {
    @GET("staging/book")
    Call<ProductResponse> getProduct(
            @Query(value = "nim") String nim,
            @Query(value = "nama") String nama
    );

    @GET("staging/book/{bookId}")
    Call<ProductResponse> getProductDetail(
            @Path("bookId") Integer bookId,
            @Query(value = "nim") String nim,
            @Query(value = "nama") String nama
    );
}
