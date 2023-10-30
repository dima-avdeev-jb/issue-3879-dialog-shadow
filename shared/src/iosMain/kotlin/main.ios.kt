import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.interop.UIKitView
import androidx.compose.ui.window.ComposeUIViewController
import kotlinx.cinterop.ExperimentalForeignApi
import platform.UIKit.UITextView

actual fun getPlatformName(): String = "iOS"

fun MainViewController() = ComposeUIViewController { App() }

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun NativeView() {
    UIKitView(
        factory = {
            UITextView().apply {
                this.text = Array(100) { "$it" }.joinToString("\n")
            }
        },
        modifier = Modifier.fillMaxSize()
    )
}
