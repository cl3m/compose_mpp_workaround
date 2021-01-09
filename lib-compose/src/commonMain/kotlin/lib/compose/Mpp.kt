package lib.compose

expect annotation class Composable

expect fun hello(world: String = "world"): String

@Composable
expect fun composeOk(text: String)

@Composable
expect fun composeFail(text: String = "test")