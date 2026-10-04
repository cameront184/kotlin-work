// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    val s = (args[0].toDouble() + args[1].toDouble() + args[2].toDouble())/2             // s is the semiperemeter (the first part of herons formula)

    val Area = sqrt(
        s*((s-args[0].toDouble())*
          (s-args[1].toDouble())*
          (s-args[2].toDouble()))
    )

    println("Area = %.5f".format(Area))

}

