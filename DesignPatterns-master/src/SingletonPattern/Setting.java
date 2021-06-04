/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author ghada
 */
public class Setting {
    
    private static Setting setting;
    String appColor; 
    String language;

    private Setting(String appColor, String language) {
        this.appColor = appColor;
        this.language = language;
    }
    
    
    public static Setting getSettingInstance(String color ,String language ){
        if (setting == null){
            setting = new Setting(color, language);
        }
        return setting;
    }

    public String getAppColor() {
        return appColor;
    }

    public void setAppColor(String appColor) {
        this.appColor = appColor;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Setting{" + "appColor=" + appColor + ", language=" + language + '}';
    }
    
    
    
    
    
}
