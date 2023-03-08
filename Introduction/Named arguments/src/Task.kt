// joinToString : 코틀린에서 배열 데이터 출력 형식을 변경할 때 사용한다.
// 일반적인 출력 형식 : [데이터, 데이터, 데이터 ... ]
// joinToString(구분자, 시작, 종료) 형식으로 사용합니다
fun joinOptions(options: Collection<String>) =
        options.joinToString(", ", "[", "]")
