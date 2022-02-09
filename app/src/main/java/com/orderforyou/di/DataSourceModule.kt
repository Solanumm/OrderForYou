package com.orderforyou.di






import com.orderforyou.datasource.IAnimeDAO
import com.orderforyou.datasource.IPaginationDAO
import com.orderforyou.utils.Constans
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton






@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {
///getting started with MoshiConverterFactory


    @Provides
    @Singleton
    fun providesMoshi(): Moshi {
        return Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }


    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(providesMoshi()))
            .baseUrl(Constans.BASE_URL)
            .build()
    }


    @Singleton
    @Provides
    fun restDataSourcePagination(retrofit: Retrofit): IPaginationDAO =
        retrofit.create(IPaginationDAO::class.java)

    @Singleton
    @Provides
    fun restDataSourceAnime(retrofit: Retrofit): IAnimeDAO =
        retrofit.create(IAnimeDAO::class.java)
}