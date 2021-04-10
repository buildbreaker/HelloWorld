#include <jni.h>
#include <stdio.h>

JNIEXPORT jint JNICALL Java_buildbreaker_Hello_num(JNIEnv *, jobject) {
   return 42;
}