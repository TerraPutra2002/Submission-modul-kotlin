package com.dicoding.exam.exam3

// TODO
fun <T> checkType(args: T): String {
    when {
        args is String -> return "Yes! it's String"
        args is Boolean -> return "Yes! it's Boolean"
        args is Int -> return "Yes! it's Integer"
        args is Double -> return "Yes! it's Double"
        args is List<*> -> return "Yes! it's List"
        args is Map<*, *> -> return "Yes! it's Map"
        else -> return "Unknown type"
    }
}