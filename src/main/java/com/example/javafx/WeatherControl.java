package com.example.javafx;

import com.example.javafx.pars.Parsing;
import com.example.javafx.pars.city.Condition;
import com.example.javafx.pars.city.GetCity;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


public class WeatherControl  {
    @FXML
    private Label setCity;
    @FXML
    private Label setPras;
    @FXML
    private Label setTemp;
    @FXML
    private Label setWind;
    @FXML
    private Label setSunrise;
    @FXML
    private Label setSunset;
    @FXML
    private TextField inputText;
    @FXML
    private ImageView setImage;
    @FXML
    private Label conditiontText;
    @FXML
    private Label feels_like;
    @FXML
    private Label wind_dir;
    @FXML
    private Label prec_prob;

    @FXML
    void inputButton()  {
        GetCity getCity = new GetCity();
        String str = inputText.getText();
        str = (str.substring(0, 1).toUpperCase() + str.substring(1)).trim();
        inputText.setText(str);
        if(getCity.getCity(str) != null) {
            String lan = getCity.getCity(str).get(1);
            String lon = getCity.getCity(str).get(2);
            setData(lan, lon, str);
        }else{
            setCity.setText("Отсутсвует в базе");
        }
    }

    void setData(String lan, String lon, String city) {
        Parsing parsing = new Parsing();
        Condition cond = new Condition();

        setCity.setText(city);
        setTemp.setText(parsing.getGson(lan, lon).get("temp") + "°C");

        setWind.setText("Ветер: " + parsing.getGson(lan, lon).get("wind") + "м/с");
        wind_dir.setText("Направление\n" + cond.windDir(parsing.getGson(lan, lon).get("wind_dir")));
        setPras.setText(parsing.getGson(lan, lon).get("pressure") + "мм.рт.ст.");
        setSunrise.setText("Восход: "+ parsing.getGson(lan, lon).get("sunrise"));
        setSunset.setText("Закат: " + parsing.getGson(lan, lon).get("sunset"));
        feels_like.setText("Ощущается как: " + parsing.getGson(lan, lon).get("feels_like") + "°C");

        setImage.setImage(cond.getCondition(parsing.getGson(lan, lon).get("cond")));

        conditiontText.setText(cond.condText(parsing.getGson(lan, lon).get("cond")));
        prec_prob.setText(parsing.getGson(lan, lon).get("prec_prob") + "%");

    }

}
