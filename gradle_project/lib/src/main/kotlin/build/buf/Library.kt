package build.buf

import buf.connect.kotlin.java_playground.BufInterface
import buf.connect.kotlin.java_playground.AnotherInterface


class Library {
    fun someLibraryMethod(b: BufInterface, a: AnotherInterface): Boolean {
        b.asdf()
        return true
    }

}
