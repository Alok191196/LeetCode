class IsSubSequence {
    fun find(s: String, t: String): Boolean {
        if (s.isEmpty()) return true
        var i = 0
        var j = 0
        while (i < s.length && j < t.length) {
            if (s[i] == t[j]) {
                i += 1
                j += 1
            } else {
                j += 1
            }
        }
        return i == s.length
    }
}

fun main() {
    println(IsSubSequence().find("ace", "abcde"))
    println(IsSubSequence().find("aaaaaa", "bbaaaa"))
}