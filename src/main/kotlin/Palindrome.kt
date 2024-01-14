class Palindrome {

    fun isPalindrome(str: String): Boolean {
        val strArray = str.split("")
        var i = 0
        var j = strArray.size.minus(1)
        while (i <= j) {
            if (strArray[i] != strArray[j])
                return false
            i += 1
            j -= 1
        }
        return true
    }

}

fun main() {
    println(Palindrome().isPalindrome("abcba"))
    println(Palindrome().isPalindrome("racecar"))
    println(Palindrome().isPalindrome("aabbcc"))
    println(Palindrome().isPalindrome("a"))
}