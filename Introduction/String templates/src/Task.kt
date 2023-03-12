// 정규표현식 연습
// \d : 숫자, [0-9]와 동일
// | : or을 의미. a|b : a 또는 b.
// $ : 템플릿 표현식

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2} $month \d{4}"""
