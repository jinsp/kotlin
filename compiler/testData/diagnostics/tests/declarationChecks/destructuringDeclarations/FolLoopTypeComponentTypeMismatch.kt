// !WITH_NEW_INFERENCE
class A {
    operator fun component1() = 1
    operator fun component2() = 1.0
}

class C {
    operator fun iterator(): Iterator<A> = null!!
}

fun test() {
    for ((<!NI;TYPE_MISMATCH!><!UNUSED_VARIABLE!>x<!>: Double<!>, <!NI;TYPE_MISMATCH!><!UNUSED_VARIABLE!>y<!>: Int<!>) in <!NI;COMPONENT_FUNCTION_RETURN_TYPE_MISMATCH, COMPONENT_FUNCTION_RETURN_TYPE_MISMATCH!>C()<!>) {

    }
}
