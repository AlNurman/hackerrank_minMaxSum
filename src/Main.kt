import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
	// Write your code here
	var sum: Long
	var min: Long = 0.toLong()
	var max: Long = 0.toLong()
	for(i in 0 until arr.size){
		sum=0
		for(j in 0 until arr.size){
			if(j!=i) {
				sum = sum + arr[j]
			}
		}
		if(max== 0.toLong())max=sum
		if(min==0.toLong())min=sum

		if(min>sum)min=sum
		if(max<sum)max=sum
	}
	println("$min $max")
}

fun main(args: Array<String>) {

	val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

	miniMaxSum(arr)
}
