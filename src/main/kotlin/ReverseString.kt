class ReverseString {
    fun reverse(input: CharArray): CharArray {
        var i = 0
        var j = input.size.minus(1)
        while (i <= j) {
            input[j] = input[i].apply{input[i] = input[j]}
            i += 1
            j -= 1
        }
        return input
    }
}

fun main() {
    print(ReverseString().reverse(charArrayOf('h', 'e', 'l', 'l', 'o')))
}