package com.orderforyou.di

import com.orderforyou.repository.AnimeRepository
import com.orderforyou.repository.AnimeRepositoryImp
import com.orderforyou.repository.PaginationRepository
import com.orderforyou.repository.PaginationRepositoryImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract  class RepositryModule {

    @Singleton
    @Binds
    abstract fun PaginationResopository(repo:PaginationRepositoryImp): PaginationRepository

    @Singleton
    @Binds
    abstract fun AnimeResopository(repo: AnimeRepositoryImp): AnimeRepository


}