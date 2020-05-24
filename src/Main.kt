import java.util.*
import kotlin.test.assertEquals

/*object Kata {
  fun digitize(n:Long): IntArray {

//    return n.toString().reversed().map(Character::getNumericValue).toIntArray()

    val string=n.toString().reversed()
    val result = string.map(Character::getNumericValue).toIntArray()


*//*    var nums = IntArray(string.length)
    for(j in 0..string.length-1){
      nums.set(j,string.get(j).toInt() - '0'.toInt())
    }*//*

    return result
  }
}*/
/*

fun high(str: String) : String {
*/
/*  var words = str.split(" ").maxBy { it.sumBy { it -'a' +1 } }
  var pointer =0
  var reference=0
  for(j in 0..words.size-1){
    var comparable=0
      for(char in words.get(j)){
        comparable=comparable+char.toInt()-96
      }
    if(comparable > reference){
      reference=comparable
      pointer=j
    }
  }
  return words.get(pointer)*//*

 return str.split(" ").maxBy { it.sumBy { it -'a' +1 } }!!
}
*/


/*fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
  if(a1.isEmpty() || a2.isEmpty()){
    return -1
  } else {
    if ((a1.maxBy { it.length }!!.length) - (a2.minBy { it.length }!!.length) > (a2.maxBy { it.length }!!.length) - (a1.minBy { it.length }!!.length)) {
      return ((a1.maxBy { it.length }!!.length) - (a2.minBy { it.length }!!.length))
    } else {
      return ((a2.maxBy { it.length }!!.length) - (a1.minBy { it.length }!!.length))
    }
  }
}*/


fun productFib(prod:Long):LongArray {
  var fibMinus:Long = 0
  var fibPlus:Long=1
  while(true){
    if(fibMinus*fibPlus< prod){
      val fibNext=fibMinus+fibPlus
      fibMinus=fibPlus
      fibPlus=fibNext
    } else if(fibMinus*fibPlus == prod) {
      return longArrayOf(fibMinus, fibPlus, 0)
    } else {
      return longArrayOf(fibMinus, fibPlus, 1)
    }
  }
}

// KATA  - Gap in Primes

//Function to check Prime Number
fun findPrimeNo(number: Long): Boolean {
  if(number<2) return false
  for (i in 2.toLong()..number/2) {
    if (number % i == 0.toLong()) {
      return false
    }
  }
  return true
}

fun gap(g:Int, m:Long, n:Long):LongArray {
  var actualGap= 0
  var firstPrime=0L
 // var secondPrime=0L
  for(value in m..n){
    if(findPrimeNo(value)) {
        if (actualGap==g){
          return longArrayOf(firstPrime, value)
        } else {
          firstPrime=value
          actualGap=1
        }
    } else if( firstPrime==0L){
      actualGap =0
    } else{
      actualGap +=1
    }
  }
  return longArrayOf()
}

fun bouncingBall(h:Double, bounce:Double, window:Double):Int {
  if(h>0 && 0<bounce && bounce<1 && window<h) {
    var sights=1
    var updatedH=h
    while(updatedH*bounce>window){
      updatedH=updatedH*bounce
      sights +=2
    }
    return sights
  } else {
    return -1
  }

}


fun orderWeight(string:String):String {
  // your code
}










fun main(){

}