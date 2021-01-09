package lib.compose

import androidx.compose.material.Text

actual typealias Composable = androidx.compose.runtime.Composable

actual fun hello(world: String): String {
    return "hello $world"
}

@Composable
actual fun composeOk(text: String) {
    Text("""
        src/androidMain/kotlin/lib/compose/Mpp.kt
        @Composable
        fun composeOk(text: String) {
            text = $text
    """.trimIndent())
}

@Composable
actual fun composeFail(text: String) {
    Text("""
        src/androidMain/kotlin/lib/compose/Mpp.kt
        @Composable
        fun composeFail(text: String) {
            text = $text
    """.trimIndent())
}