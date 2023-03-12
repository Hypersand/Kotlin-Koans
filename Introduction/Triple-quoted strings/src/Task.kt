//코틀린에서 """(트리플 더블 쿼테이션)은 멀티라인 문자열(multiline string)을 표현하는 데 사용됩니다.
// 이 문자열 리터럴을 사용하면 문자열에 개행 문자를 직접 삽입할 필요 없이
// 여러 줄의 텍스트를 표현할 수 있습니다.
// 코틀린에서는 문자, 숫자, 밑줄, $ 문자, 그리고 # 문자를 식별자 이름으로 사용할 수 있습니다.

const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")

fun main() {
    println(tripleQuotedString)
}