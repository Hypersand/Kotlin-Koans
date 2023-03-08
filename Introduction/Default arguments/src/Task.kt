//toUpperCase : 영어 대문자로 변경합니다
//toLowerCase : 영어 소문자로 변경합니다

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.uppercase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)


