package com.example.navigationfitnes.botom_navigation

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.navigationfitnes.R
import org.intellij.lang.annotations.JdkConstants.VerticalScrollBarPolicy


@Composable
fun Open(navController: NavController) {

    var login by rememberSaveable {
        mutableStateOf("")
    }
    var password by rememberSaveable {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(id = R.drawable.girl), contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Логин", fontSize = 26.sp)
            OutlinedTextField(
                modifier = Modifier,
                value = login,
                onValueChange = { login = it },
                label = { "Логин" })
            Text(text = "Пароль", fontSize = 26.sp)
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { "Пароль" })
            Button(
                modifier = Modifier.padding(15.dp),
                onClick = {}) {
                Text(fontSize = 30.sp, text = "Войти")
            }
            Button(modifier = Modifier.padding(15.dp),
                onClick = { navController.navigate("screen_1") }) {
                Text(fontSize = 30.sp, text = "Открыть")
            }
        }
    }

}


@Composable
fun Screen1(onClick: (name: String, description: String) -> Unit) {

    BottomAppBar {

    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(ScrollState(0)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,

        ) {
        Text(text = "Список тренировок", fontSize = 38.sp)
        train(
            "Пресс",
            "Тренажер для жима платформы может выглядеть по-разному: он может быть наклонным под углом 45 градусов," +
                    " горизонтальным, как на видео, или вертикальным, когда упражнение выполняется лежа, " +
                    "а ноги поднимаются вертикально вверх. Нам подойдет любой, какой есть в вашем клубе.  \n" +
                    "Исходное положение: стопы на платформе на ширине плеч, спина прямая. \n" +
                    "Как выполнять: не фиксируя колени, плавным движением разгибаем ноги. Медленным движением возвращаемся в исходное положение. \n" +
                    "Рабочие мышцы: Квадрицепс, ягодичные и бицепс бедра.\n", 4
        ) { name, description -> onClick(name, description) }
        train(
            "Руки",
            "Исходное положение: колени на подушке, руки на перекладине. \n" +
                    "                   Как выполнять: свободно опускаемся вниз, не фиксируя локти. Затем подтягиваемся, сводя лопатки, до тех пор, пока подбородок не окажется выше перекладины. Медленным движением возвращаемся в исходное положение. \n" +
                    "                    Рабочие мышцы: широчайшие спины, бицепс, грудные, плечи.\n",
            7
        ) { name, description -> onClick(name, description) }
        train(
            "Отжимание",
            " Исходное положение: прямая спина прижата к подушке тренажере, руки на перекладинах. \n"
                    + "Как выполнять: выполняем жим вниз до полного выпрямления рук в локтях, медленным движением возвращаемся в исходное положение. \n"
                    + "Рабочие мышцы: трицепс, грудные, дельтовидные.\n",
            3
        ) { name, description -> onClick(name, description) }
        train(
            "Кардио", "Беговые дорожки, велотренажеры, эллипсоиды, лестницы. \n"
                    + "В зоне кардио начинают тренировку, разогревают тело перед силовой тренировкой, повышают выносливость, сбрасывают вес, укрепляют сердце. \n",
            10
        ) { name, description -> onClick(name, description) }
        train(
            "Руки", "Подтягивания на брусьях — 3 подхода по 10 раз. \n"
                    + "Французский жим — 3 подхода по 10 раз. Исходное положение лежа, штанга в согнутых руках на уровне головы (как на картинке), затем разгибай руки перед собой. \n"
                    + "Программа тренировки для укрепления плеч\n" +
                    "\n" +
                    "Подъем рук с гантелями перед собой — 3 подхода по 10 раз. Исходное положение стоя, руки по швам, гантели поднимай перед собой, а затем медленно опускай.\n" +
                    "Жим штанги вверх стоя или на лавке — 3 подхода по 10 раз. Исходное положение, гриф возле груди, поднимай штангу над головой и обратно в исходное положение.\n" +
                    "Подъем гантелей в стороны — 3 похода по 10 раз.\n" +
                    "Разводка гантелей в наклоне — 3 похода по 10 раз.\n" +
                    "Совет: всегда возвращай снаряды на место — уважай других.\n" +
                    "\n",
            3
        ) { name, description -> onClick(name, description) }
        train(
            "Бицепс",
            "Сгибание рук с гантелями или штангой — 3 похода по 10 раз. Во время упражнения мышцы должны дрожать. \n" +
                    "Подъем штанги на скамье Скотта — 3 похода по 10 раз. Поставь локти на скамью, возьми гриф и сгибай руки, чувствуя напряжение мышц рук. Медленно опусти",
            50
        ) { name, description -> onClick(name, description) }

    }
}

@Composable
private fun train(
    name: String,
    description: String,
    gym: Int,
    onClick: (name: String, description: String) -> Unit
) {
    var id = remember {
        mutableStateOf(0)
    }

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(120.dp)
            .clickable { onClick(name, description) },
    ) {

        Row(
            modifier = Modifier,
        ) {
            Image(painter = painterResource(id = R.drawable.fintess), contentDescription = "")
            Box(
                modifier = Modifier
                    .fillMaxSize(),
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row(
                        modifier = Modifier,
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "${name}", color = Color.Gray, fontSize = 40.sp,
                            textAlign = TextAlign.Center
                        )

                        }
                    }


                }
            }
        }
    }

@Composable
fun Screen2(
    navHostController: NavHostController,
    nameRecept: String,
    description: String,
    onClick: () -> Unit
) {

    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize()
            .fillMaxSize()
            .verticalScroll(ScrollState(0)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        val addedCards = remember { mutableStateOf(mutableListOf<String>()) }
        Text(text = "$nameRecept", fontSize = 50.sp)
        Text(text = "Тренировка включает:", fontSize = 30.sp)
        Card(
            Modifier.padding(10.dp)
        ) {
            Text(text = "$description", fontSize = 20.sp)
        }
        Row(modifier = Modifier.padding(10.dp)) {


            Button(onClick = onClick) {
                Text(text = "Выполнено")
            }


        }

    }


}


@Composable
fun Screen5() {
    Column(modifier = Modifier.padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Избранное", fontSize = 40.sp)
    }

}
