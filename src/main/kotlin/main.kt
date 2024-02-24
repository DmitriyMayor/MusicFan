import kotlin.time.times

fun main() {
    var sum = readln()
    var buyer = Buyer(true)
    var sumAfterDiscount: Int = 0


    fun countSum(buyer: Buyer, sum: Int): Int {

        if (buyer.regularCustomer) {
            if (sum > 10_000) {
                sumAfterDiscount = (sum / 100) * 94
            }
            if (sum in 1001..10_000) {
                sumAfterDiscount = ((sum * 0.99) - 100).toInt()
            } else sumAfterDiscount = sum
        } else {
            if (sum > 10_000) {
                sumAfterDiscount = (sum / 100) * 95
            }
            if (sum in 1001..10_000) {
                sumAfterDiscount = sum - 100
            } else sumAfterDiscount = sum
        }

        return sumAfterDiscount
    }
    countSum(buyer, sum.toInt())
    println(sumAfterDiscount)
}