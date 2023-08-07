package com.example.javafx.pars.city;

import javafx.scene.image.Image;
import java.util.Objects;

public class Condition {
    public Image getCondition(String cond) {
        String path = null;
        switch (cond) {
            case ("clear"): path = "clear.png"; break;
            case ("partly-cloudy"): path = "partial_cloud.png";break;
            case ("cloudy"): path = "cloudy.png"; break;
            case ("overcast"  ): path = "overcast.png";break;
            case ("rain"): path = "day_snow.png"; break;
            case ("drizzle"):
            case ("light-rain"):
            case ("moderate-rain"):
            case ("thunderstorm-with-hail"):
            case ("thunderstorm-with-rain"):
            case ("thunderstorm"):
            case ("hail"):
            case ("heavy-rain"):
            case ("continuous-heavy-rain"):
            case ("showers"):
                path = "rain.png"; break;
            case ("wet-snow"): path = "sleet.png"; break;
            case ("light-snow"):
            case ("snow"):

            case ("snow-showers"): path = "snow.png"; break;
        }
        assert path != null;
        return new Image(Objects.requireNonNull(Condition.class.getResourceAsStream(path)));
    }
    public String condText(String cond){
        String text = "";
        switch (cond) {
            case ("clear"): text = "ясно"; break;
            case ("partly-cloudy"): text = "малооблачно"; break;
            case ("cloudy"): text = "облачно с прояснениями"; break;
            case ("overcast"): text = "пасмурно"; break;
            case ("light-rain"): text = "небольшой дождь"; break;
            case ("wet-snow"): text = "дождь со снегом"; break;
            case ("light-snow"): text = "небольшой снег"; break;
            case ("drizzle"): text = "морось"; break;
            case ("rain"): text = "дождь"; break;
            case ("heavy-rain"): text = "сильный дождь"; break;
            case ("continuous-heavy-rain"): text = "длительный сильный дождь"; break;
            case ("showers"): text = "ливень"; break;
            case ("hail"): text = "град"; break;
            case ("thunderstorm"): text = "гроза"; break;
            case ("thunderstorm-with-rain"): text = "дождь с грозой"; break;
            case ("thunderstorm-with-hail"): text = "гроза с градом"; break;
            case ("moderate-rain"): text = "умеренно сильный дождь"; break;
            case ("snow"): text = "снег"; break;
            case ("snow-showers"): text = "снегопад"; break;
        }
        return text;
    }
    public String windDir(String text){
        String dir = "";
        switch (text){
            case ("nw") : dir = "северо-западное"; break;
            case ("n") : dir = "северное"; break;
            case ("ne") : dir = "северо-восточное"; break;
            case ("e") : dir = "восточное"; break;
            case ("se") : dir = "юго-восточное"; break;
            case ("s") : dir = "южное"; break;
            case ("sw"): dir = "юго-западное";break;
            case ("w"): dir = "западное"; break;
            case ("c"): dir = "штиль"; break;
        }
        return dir;
    }

}
