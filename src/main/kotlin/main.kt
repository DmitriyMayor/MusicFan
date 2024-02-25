fun main() {
    val sum = readln()
    val buyer = Buyer(true)
    var sumAfterDiscount = 0.0


    fun countSum(buyer: Buyer, sum: Int): Double {

        if (buyer.regularCustomer) {
            if (sum > 10_000) {
                sumAfterDiscount = sum * 0.95 * 0.99
            } else if (sum in 1001..10_000) {
                sumAfterDiscount = (sum - 100) * 0.99
            }
        } else {
            if (sum > 10_000) {
                sumAfterDiscount = sum * 0.95
            } else if (sum in 1001..10_000) {
                sumAfterDiscount = ((sum - 100).toDouble())
            } else {
                sumAfterDiscount = sum.toDouble()
            }
        }



        return sumAfterDiscount
    }
    countSum(buyer, sum.toInt())
    println(sumAfterDiscount)
}