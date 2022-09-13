package com.dls.insuranceadvisorservice

import java.util.function.Predicate
import java.util.stream.Collectors


fun main(args: Array<String>) {

    var list: List<Int> = listOf(1, 2, 3, 6)

    // println(list.reduce(JonSnow::sum))

    val isPredicate = { x: Int -> x % 2 == 0 }
    val map = { x: Int -> x+2}

    var list2 = list.filter(isPredicate).map(map).toCollection(ArrayList())
   // var list2 = list.stream().filter(isPredicate).map(map).collect(Collectors.toList())

    println(list2)

}

class JonSnow {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b;
        }
    }
}
