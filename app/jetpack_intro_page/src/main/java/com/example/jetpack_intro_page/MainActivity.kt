package com.example.jetpack_intro_page

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_intro_page.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScreenImage()
                    Screen(message1 = stringResource(R.string.jetpack_compose_tutorial),
                        message2 = stringResource(R.string.jetpack_compose_is_a_modern_toolkit_for_building_native_android_ui_compose_simplifies_and_accelerates_ui_development_on_android_with_less_code_powerful_tools_and_intuitive_kotlin_apis),
                        message3 = stringResource(R.string.in_this_tutorial_you_build_a_simple_ui_component_with_declarative_functions_you_call_compose_functions_to_say_what_elements_you_want_and_the_compose_compiler_does_the_rest_compose_is_built_around_composable_functions_these_functions_let_you_define_your_app_s_ui_programmatically_because_they_let_you_describe_how_it_should_look_and_provide_data_dependencies_rather_than_focus_on_the_process_of_the_ui_s_construction_such_as_initializing_an_element_and_then_attaching_it_to_a_parent_to_create_a_composable_function_you_add_the_composable_annotation_to_the_function_name)
                    )
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun JetpackIntroPreview() {
    HappyBirthdayTheme {
        ScreenImage()
        Screen(message1 = stringResource(R.string.jetpack_compose_tutorial),
            message2 = stringResource(R.string.jetpack_compose_is_a_modern_toolkit_for_building_native_android_ui_compose_simplifies_and_accelerates_ui_development_on_android_with_less_code_powerful_tools_and_intuitive_kotlin_apis),
            message3 = stringResource(R.string.in_this_tutorial_you_build_a_simple_ui_component_with_declarative_functions_you_call_compose_functions_to_say_what_elements_you_want_and_the_compose_compiler_does_the_rest_compose_is_built_around_composable_functions_these_functions_let_you_define_your_app_s_ui_programmatically_because_they_let_you_describe_how_it_should_look_and_provide_data_dependencies_rather_than_focus_on_the_process_of_the_ui_s_construction_such_as_initializing_an_element_and_then_attaching_it_to_a_parent_to_create_a_composable_function_you_add_the_composable_annotation_to_the_function_name)
        )

    }
}

@Composable
fun Screen(message1: String, message2: String, message3: String) {
    Column(modifier = Modifier.padding(0.dp,100.dp,0.dp,)) {
        Text(
            text = message1,
            // textAlign = TextAlign.Justify,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),


            )
        Text(
            text = message2,
            textAlign = TextAlign.Justify,
            //fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),


            )
        Text(
            text = message3,
            textAlign = TextAlign.Justify,
            //fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),


            )
    }

}




@Composable
fun ScreenImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
           // contentScale = ContentScale.Crop,
            //alpha = 0.5F,
            modifier = Modifier.fillMaxWidth()
        )
    }
}