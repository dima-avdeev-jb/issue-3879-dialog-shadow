import android.widget.TextView
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

actual fun getPlatformName(): String = "Android"

@Composable fun MainView() = App()

@Composable
actual fun NativeView() {
    AndroidView(
        factory = { context ->
            TextView(context).apply {
                this.text = Array(100) { "$it" }.joinToString("\n")
            }
        },
    )
}

