package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.R

data class Pets(
    val name: String,
    val photo: Int,
    val color: String,
    val age: String,
    val weight: String,
    val gender: String,
    val category: String,
    val shortDescription: String,
    val longDescription: Int = R.string.lorem,
) {
    companion object {
        fun getPetsList(): ArrayList<Pets> {
            return arrayListOf(
                Pets(
                    "Bengal cat",
                    R.drawable.bengal_cat,
                    "Brown",
                    "1 Yrs",
                    "1.4Kg",
                    "Male",
                    "Cat",
                    "Like treats",
                ),
                Pets(
                    "Basset Hound",
                    R.drawable.basset_hound,
                    "Brown",
                    "1.4 Yrs",
                    "14Kg",
                    "Female",
                    "Dog",
                    "Addictive to hugs"
                ),
                Pets(
                    "Persian cat",
                    R.drawable.persian_cat,
                    "Brown",
                    "1.4 Yrs",
                    "14Kg",
                    "Male",
                    "Cat",
                    "Looks like Cloud"
                ),

                Pets(
                    "Toyger",
                    R.drawable.toyger,
                    "Brown",
                    "1.4 Yrs",
                    "14Kg",
                    "Male",
                    "Cat",
                    "Whines like a baby"
                ),
                Pets(
                    "German Shepherd",
                    R.drawable.germanshepherd,
                    "Brown",
                    "1 Yrs",
                    "14Kg",
                    "Male",
                    "Dog",
                    "Like treats",
                ),
                Pets(
                    "Bulldog",
                    R.drawable.bulldog,
                    "Brown",
                    "1.4 Yrs",
                    "14Kg",
                    "Male",
                    "Dog",
                    "Looks like Cloud"
                ),
                Pets(
                    "Basenji",
                    R.drawable.basenji,
                    "Brown",
                    "1.4 Yrs",
                    "14Kg",
                    "Male",
                    "Dog",
                    "Whines like a baby"
                ), Pets(
                    "Birman",
                    R.drawable.birman,
                    "Brown",
                    "1.4 Yrs",
                    "14Kg",
                    "Female",
                    "Cat",
                    "Addictive to hugs"
                )
            )
        }
    }
}